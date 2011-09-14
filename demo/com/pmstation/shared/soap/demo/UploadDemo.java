package com.pmstation.shared.soap.demo;

import com.pmstation.shared.soap.client.ApiException;
import com.pmstation.shared.soap.client.DesktopAppJax2;
import com.pmstation.shared.soap.client.DesktopAppJax2Service;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.InputStreamBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * Created by IntelliJ IDEA.
 * User: tinedel
 * Date: 2/7/11
 * Time: 10:49 AM
 */
public class UploadDemo {
  private static void upload(String login, String password, String file) throws ApiException {
    File f = new File(file);
    if (!f.exists() || !f.canRead() || f.isDirectory()) {
      System.out.println("File does not exist, unreadable or not a file");
      return;
    }

    DesktopAppJax2 da = new DesktopAppJax2Service().getDesktopAppJax2Port();
    String loginRes = da.login(login, password);
    if (!loginRes.isEmpty()) {
      System.out.println("Login failed: " + loginRes);
      return;
    }

    if (!da.hasRightUpload()) {
      System.out.println("Uploading is temporarily disabled");
      return;
    }

    long newFileId = da.uploadStartFile(login, password, -1, f.getName(), f.length());
    String sessionKey = da.createUploadSessionKey(login, password, -1);
    long dcId = da.getNewFileDataCenter(login, password);
    String url = da.getUploadFormUrl((int) dcId, sessionKey);

    try {
      HttpClient client = new DefaultHttpClient();
      HttpPost post = new HttpPost(url);
      MultipartEntity me = new MultipartEntity();
      StringBody rfid = new StringBody("" + newFileId);
      StringBody rfb = new StringBody("" + 0);
      InputStreamBody isb = new InputStreamBody(new BufferedInputStream(new FileInputStream(f)), "FilePart");
      me.addPart("resumableFileId", rfid);
      me.addPart("resumableFirstByte", rfb);
      me.addPart("FilePart", isb);

      post.setEntity(me);
      HttpResponse resp = client.execute(post);
      HttpEntity resEnt = resp.getEntity();

      String res = da.uploadFinishFile(login, password, newFileId, DigestUtils.md5Hex(new FileInputStream(f)));
      if(res.isEmpty())
      System.out.println("File uploaded.");
      else
        System.out.println("Upload failed: "+res);
    } catch (Exception ex) {
      System.out.println("Upload failed: "+ex.getMessage());
    }

  }

  public static void main
      (String[] args) {
    if (args.length != 3) {
      showUsage();
      return;
    }

    try {
      upload(args[0], args[1], args[2]);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void showUsage() {
    System.out.println("Usage: upload login password fileToUpload");
  }
}

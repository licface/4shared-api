package com.pmstation.shared.soap.demo;

import com.pmstation.shared.soap.client.AccountItem;
import com.pmstation.shared.soap.client.DesktopAppJax2;
import com.pmstation.shared.soap.client.DesktopAppJax2Service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;

/**
 * Created by IntelliJ IDEA.
 * User: tinedel
 * Date: 2/4/11
 * Time: 3:56 PM
 */
public class DownloadDemo {
  private static void download(String login, String password, long fileId, String path) {
    DesktopAppJax2 da = new DesktopAppJax2Service().getDesktopAppJax2Port();
    String loginRes = da.login(login, password);
    if (!loginRes.isEmpty()) {
      System.out.println("Login failed: " + loginRes);
      return;
    }

    AccountItem ai = da.getFileInfo(login, password, fileId);
    if (ai == null || ai.isDirectory() || ai.isRemoved() || ai.getDownloadLink().isEmpty()) {
      System.out.println("Wrong id or file is removed");
      return;
    }

    try {
      URI uri = new URI(da.getDirectLink(login, password, ai.getDownloadLink()));

      File f = new File(path);
      if (f.exists() && f.isDirectory() && f.canWrite()) {
        f = new File(f, ai.getName());
      } else {
        System.out.println("Can't write to specified folder.");
        return;
      }
      BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(f));
      byte[] buffer = new byte[1024];

      System.out.println("Chunks: " + ai.getSize() / 1024);
      InputStream is = uri.toURL().openStream();
      while (is.read(buffer) > 0) {
        out.write(buffer);
        System.out.print(".");
        System.out.flush();
      }
      System.out.println("Done");
    } catch (Exception e) {
      System.out.println("Can't download file: " + e.getMessage());
    }

  }

  public static void main(String[] args) {
    if (args.length != 4) {
      showUsage();
      return;
    }

    long fileId = -1l;
    try {
      fileId = Long.parseLong(args[2]);
    } catch (Exception e) {
      showUsage();
      return;
    }

    try {
      download(args[0], args[1], fileId, args[3]);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  private static void showUsage() {
    System.out.println("Usage: download login password fileId path");
    System.out.println("\tfileId can be find out using browse demo");
    System.out.println("WARNING!!! file with name same as being downloaded will be overwritten without prompt in specified folder");
  }
}

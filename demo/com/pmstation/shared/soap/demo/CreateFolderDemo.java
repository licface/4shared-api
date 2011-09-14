package com.pmstation.shared.soap.demo;

import com.pmstation.shared.soap.client.ApiException;
import com.pmstation.shared.soap.client.DesktopAppJax2;
import com.pmstation.shared.soap.client.DesktopAppJax2Service;

/**
 * Created by IntelliJ IDEA.
 * User: tinedel
 * Date: 2/16/11
 * Time: 2:03 PM
 */
public class CreateFolderDemo {
  private static void createFodler(String login, String password, String folderName) throws ApiException {
    DesktopAppJax2 da = new DesktopAppJax2Service().getDesktopAppJax2Port();
    String loginRes =da.login(login, password);
    if(!loginRes.isEmpty()) {
      System.out.println("Login failed: "+loginRes);
      return;
    }

    long res = da.createNewFolder(login, password, -1, folderName);
    if(res > 0) {
      System.out.println("Folder created");
    } else {
      System.out.println("Error creating folder: "+res);
    }
  }

  public static void main(String[] args) throws ApiException {
    if(args.length != 3) {
      showUsage();
      return;
    }

    createFodler(args[0],args[1],args[2]);
  }

  private static void showUsage() {
    System.out.println("Usage: createfolder login password name");
  }
}

package com.pmstation.shared.soap.demo;

import com.pmstation.shared.soap.client.DesktopAppJax2;
import com.pmstation.shared.soap.client.DesktopAppJax2Service;

/**
 * Created by IntelliJ IDEA.
 * User: tinedel
 * Date: 9/14/11
 * Time: 3:44 PM
 */
public class PreviewLinkDemo {
  public static void main(String[] args) {
    try {
    if (args.length != 3) {
      showUsage();
      return;
    }

    showPreviewLink(args[0], args[1], Long.parseLong(args[2]));
    } catch (Exception ex) {
      showUsage();
    }
  }

  private static void showUsage() {
    System.out.println("Usage: previewlink login password fileid");
  }

  private static void showPreviewLink(String login, String password, long fileId) {
    DesktopAppJax2 da = new DesktopAppJax2Service().getDesktopAppJax2Port();
    try {
      String res = da.login(login, password);
      if (!res.isEmpty()) {
        System.out.println("Can not login: " + res);
        return;
      }

      if (!da.isAccountActive(login, password) || da.isAccountBanned(login, password)) {
        System.out.println("Account is not active or banned");
        return;
      }

      System.out.println("Preview: " + da.getPreviewLink(login, password, fileId));
      System.out.println("Video Preview: " + da.getVideoPreviewLink(login, password, fileId));
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

}

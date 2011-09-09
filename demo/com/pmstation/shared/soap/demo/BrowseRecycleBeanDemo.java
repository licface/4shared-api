package com.pmstation.shared.soap.demo;

import com.pmstation.shared.soap.client.AccountItem;
import com.pmstation.shared.soap.client.AccountItemArray;
import com.pmstation.shared.soap.client.DesktopAppJax2;
import com.pmstation.shared.soap.client.DesktopAppJax2Service;

/**
 * Created by IntelliJ IDEA.
 * User: tinedel
 * Date: 9/9/11
 * Time: 11:37 AM
 */
public class BrowseRecycleBeanDemo {
  private static void browseRecycleBean(String login, String password) {
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

      AccountItemArray cont = da.getRecycleBinItems(login, password);
      for (AccountItem ai : cont.getItem()) {
        print(ai, 0);
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  private static void print(AccountItem ai, int level) {
    String res = new String(new char[level * 2]).replace('\0', ' ') + ai.getName();
    if (ai.isDirectory()) res += "(" + ai.getId() + ")/";
    else res += " (" + ai.getId() + ")";
    System.out.println(res);
  }

  public static void main(String[] args) {
    if (args.length != 2) {
      showUsage();
      return;
    }

    browseRecycleBean(args[0], args[1]);
  }

  private static void showUsage() {
    System.out.println("Usage: browserb login password");
  }
}

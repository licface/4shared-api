package com.pmstation.shared.soap.demo;

import com.pmstation.shared.soap.client.AccountItem;
import com.pmstation.shared.soap.client.AccountItemArray;
import com.pmstation.shared.soap.client.DesktopAppJax2;
import com.pmstation.shared.soap.client.DesktopAppJax2Service;

/**
 * Created by IntelliJ IDEA.
 * User: tinedel
 * Date: 2/4/11
 * Time: 3:31 PM
 */
public class BrowseFolderDemo {

  /* actual work here*/
  private static void browseFolder(String login, String password) {
    DesktopAppJax2 da = new DesktopAppJax2Service().getDesktopAppJax2Port();
    try {
      String res = da.login(login, password);
      if(!res.isEmpty()) {
        System.out.println("Can not login: "+res);
        return;
      }

      if(!da.isAccountActive(login, password) || da.isAccountBanned(login, password)) {
        System.out.println("Account is not active or banned");
        return;
      }

      AccountItem ai = da.getRoot(login, password);
      if(ai == null || !ai.isDirectory()) {
        System.out.println("Can't get root directory");
        return;
      }

      browseFolder(da, login, password, ai, 0);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  private static void browseFolder(DesktopAppJax2 da, String login, String password, AccountItem dir, int level) {
    if(level > MAX_DEPTH) return;

    AccountItemArray cont = da.getItems(login, password, dir.getId());
    for(AccountItem ai : cont.getItem()) {
      print(ai, level);
      if(ai.isDirectory())
        browseFolder(da, login, password, ai, level+1);
    }
  }

  private static void print(AccountItem ai, int level) {
    String res = new String(new char[level*2]).replace('\0',' ')+ai.getName();
    if(ai.isDirectory()) res += "/";
    else res += " ("+ai.getId()+")";
    System.out.println(res);
  }

  private static final int MAX_DEPTH = 3;

  public static void main(String[] args) {
    if(args.length != 2) {
      showUsage();
      return;
    }

    browseFolder(args[0], args[1]);
  }

  private static void showUsage() {
    System.out.println("Usage: browse login password");
  }
}

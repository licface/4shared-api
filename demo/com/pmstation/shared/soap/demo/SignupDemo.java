package com.pmstation.shared.soap.demo;

import com.pmstation.shared.soap.client.DesktopAppJax2;
import com.pmstation.shared.soap.client.DesktopAppJax2Service;

/**
 * Created by IntelliJ IDEA.
 * User: tinedel
 * Date: 2/4/11
 * Time: 2:25 PM
 */
public class SignupDemo {

  /* actual work here */
  private static void signup(String login, String password, String username) {
    DesktopAppJax2 da = new DesktopAppJax2Service().getDesktopAppJax2Port();
    try {
      String res = "";

      if(username == null || username.isEmpty()) {
        res = da.signup(login, password);
      } else {
        res = da.signupUsername(login, password, username);
      }

      if(res.isEmpty()) {
        System.out.println("User "+login+" registered at 4shared");
      } else {
        System.out.println("Registration failed: "+res);
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public static void main(String[] args) {
    switch (args.length) {
      case 2:
        signup(args[0], args[1]);
        break;
      case 3:
        signup(args[0], args[1], args[2]);
        break;
      default:
        showUsage();
    }

  }

  private static void showUsage() {
    System.out.println("Usage: signup login password <nickname>");
  }

  private static void signup(String login, String password) {
    signup(login, password, "");
  }
}

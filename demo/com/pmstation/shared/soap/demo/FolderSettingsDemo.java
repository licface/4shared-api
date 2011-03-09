package com.pmstation.shared.soap.demo;

import com.pmstation.shared.soap.client.DesktopAppJax2;
import com.pmstation.shared.soap.client.DesktopAppJax2Service;
import com.pmstation.shared.soap.client.SharedFolderProperties;
import com.pmstation.shared.soap.client.SharedFolderPropertiesArray;

import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * User: tinedel
 * Date: 3/9/11
 * Time: 4:24 PM
 */
public class FolderSettingsDemo {
  public static void main(String[] args) {
    switch (args.length) {
      case 3:
        getSettings(args[0], args[1], Long.parseLong(args[2]));
        break;
      case 5:
        setSetting(args[0], args[1], Long.parseLong(args[2]), args[3], args[4]);
        break;
      default:
        showUsage();
    }
  }

  private static void showUsage() {
    System.out.println("Usage: folderSettings login password dirId [<setting to set> <new value>]");
  }

  private static void setSetting(String login, String password, long dirId, String settingName, String newValue) {
    DesktopAppJax2 da = new DesktopAppJax2Service().getDesktopAppJax2Port();
    SharedFolderPropertiesArray res = da.getFolderSharingProperties(login, password, dirId);
    SharedFolderProperties props = res.getItem().get(0);
    SharedFolderProperties alt = res.getItem().get(1);
    for (Method m : props.getClass().getMethods()) {
      if (m.getReturnType().isAssignableFrom(boolean.class) && m.getName().equalsIgnoreCase("is" + settingName)) {
        try {
          if(!(Boolean)m.invoke(alt)) {
            System.out.println(settingName+" can not be altered");
            break;
          } else {
            props.getClass().getMethod("set"+settingName,boolean.class).invoke(props, Boolean.parseBoolean(newValue));
            da.setFolderSharingProperties(login, password, dirId, props);
            System.out.println(settingName+" is now "+newValue+" for "+dirId);
          }
        } catch (Exception e) {

        }
      }
    }
  }

  private static void getSettings(String login, String password, long dirId) {
    DesktopAppJax2 da = new DesktopAppJax2Service().getDesktopAppJax2Port();
    SharedFolderPropertiesArray res = da.getFolderSharingProperties(login, password, dirId);
    SharedFolderProperties props = res.getItem().get(0);
    SharedFolderProperties alt = res.getItem().get(1);
    System.out.println("Properties for " + dirId + ".\nFormat: name: actual value (can be set)");
    for (Method m : props.getClass().getMethods()) {
      if (m.getReturnType().isAssignableFrom(boolean.class) && !m.getName().equals("equals")) {
        try {
          System.out.println(m.getName().substring(2) + ": " + m.invoke(props) + "(" + m.invoke(alt) + ")");
        } catch (Exception e) {

        }
      }
    }
  }
}

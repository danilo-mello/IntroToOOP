package miniproject2;

import java.util.Scanner;

public class InputCollector {

  protected static String getUserInput(String prompt) {
    System.out.println(prompt);
    Scanner in = new Scanner(System.in);
    return in.nextLine();
  }

  protected static String[] getInformation() {

    String name = InputCollector.getUserInput("Enter Name:");
    while (mandatory(name) || isString(name) || validName(name)) {
      name = InputCollector.getUserInput("Enter Name:");
    }
    String mobile = InputCollector.getUserInput("Enter Mobile:");
    while (mandatory(mobile) || isPhoneNumber(mobile) || validMobile(mobile)) {
      mobile = InputCollector.getUserInput("Enter Mobile:");
    }
    String work = InputCollector.getUserInput("Enter work:");
    while (isPhoneNumber(work)) {
      work = InputCollector.getUserInput("Enter work:");
    }
    String home = InputCollector.getUserInput("Enter home:");
    while (isPhoneNumber(home)) {
      home = InputCollector.getUserInput("Enter home:");
    }
    String city = InputCollector.getUserInput("Enter city:");
    while (isString(city)) {
      city = InputCollector.getUserInput("Enter city:");
    }

    return new String[]{name, mobile, work, home, city};
  }

  private static boolean mandatory(String field) {
    if (field.length() < 1) {
      System.out.println("You must enter this field.");
      return true;
    }
    return false;
  }

  private static boolean isString(String string) {
    int len = string.length();
    if (len == 0) {
      return false;
    }
    for (int i = 0; i < len; i++) {
      if ((Character.isLetter(string.charAt(i)))) {
        return false;
      }
    }
    System.out.println("Invalid input");
    return true;
  }

  private static boolean isPhoneNumber(String string) {
    int len = string.length();
    if (len == 0) {
      return false;
    }
    for (int i = 0; i < len; i++) {
      if ((!Character.isLetter(string.charAt(i)))) {
        return false;
      }
    }
    System.out.println("Invalid input");
    return true;
  }

  private static boolean validName(String name) {
    for (Contact contact : ContactList.contactArrayList) {
      if (name.equals(contact.getName())) {
        System.out.println("This name already exists. Try again.");
        return true;
      }
    }
    return false;
  }

  private static boolean validMobile(String mobile) {
    for (Contact contact : ContactList.contactArrayList) {
      if (mobile.equals(contact.getMobile())) {
        System.out.println("This mobile already exists. Try again.");
        return true;
      }
    }
    return false;
  }

  protected static boolean isValidIndex(int index) {

    if (!ContactList.activeIndexes.contains(index)) {
      System.out.print("This index doesn't exists. ");
      System.out.println("Please choose between: " + ContactList.activeIndexes.toString());
      return true;
    }
    return false;
  }

  protected static int getIndex(boolean flag) {

    String index;

    if (flag) {
      index = InputCollector.getUserInput("Enter the index of the contact "
          + "to remove:");
    } else {
      index = InputCollector.getUserInput("Enter the index of the contact "
          + "to update:");
    }
    try {
      return Integer.parseInt(index);
    } catch (NumberFormatException e) {
      return -1;
    }
  }

}
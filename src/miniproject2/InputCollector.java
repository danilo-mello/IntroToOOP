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
    while (isMandatory(name) || !isString(name) || isValidName(name)) {
      name = InputCollector.getUserInput("Enter Name:");
    }
    String mobile = InputCollector.getUserInput("Enter Mobile (only digits):");
    while (isMandatory(mobile) || !isPhoneNumber(mobile) || isValidMobile(mobile)) {
      mobile = InputCollector.getUserInput("Enter Mobile (only digits):");
    }
    String work = InputCollector.getUserInput("Enter work (only digits):");
    while (!isPhoneNumber(work)) {
      work = InputCollector.getUserInput("Enter work (only digits):");
    }
    String home = InputCollector.getUserInput("Enter home (only digits):");
    while (!isPhoneNumber(home)) {
      home = InputCollector.getUserInput("Enter home (only digits):");
    }
    String city = InputCollector.getUserInput("Enter city:");
    while (!isString(city)) {
      city = InputCollector.getUserInput("Enter city:");
    }

    return new String[]{name, mobile, work, home, city};
  }

  private static boolean isMandatory(String field) {
    if (field.length() < 1) {
      System.out.println("You must enter this field.\n");
      return true;
    }
    return false;
  }

  private static boolean isString(String string) {
    int len = string.length();
    if (len == 0) {
      return true;
    }
    for (char ch : string.toCharArray()) {
      if (!Character.isLetter(ch) && !(ch == ' ')) {
        System.out.println("Invalid input\n");
        return false;
      }
    }
    if (string.length() < 3) {
      System.out.println("Input is too short. Try again. (>3)\n");
      return false;
    } else if (string.length() > 30) {
      System.out.println("Input is too long. Try again. (<30)\n");
      return false;
    }
    return true;
  }

  private static boolean isPhoneNumber(String string) {
    int len = string.length();
    if (len == 0) {
      return true;
    }
    for (char ch : string.toCharArray()) {
      if (!Character.isDigit(ch)) {
        System.out.println("Invalid input\n");
        return false;
      }
    }
    if (string.length() < 8) {
      System.out.println("Input is too short. Try again. (>8)\n");
      return false;
    } else if (string.length() > 15) {
      System.out.println("Input is too long. Try again. (<15)\n");
      return false;
    }
    return true;
  }

  private static boolean isValidName(String name) {
    for (Contact contact : ContactList.contactArrayList) {
      if (name.equals(contact.getName())) {
        System.out.println("This name already exists. Try again.\n");
        return true;
      }
    }
    return false;
  }

  private static boolean isValidMobile(String mobile) {
    for (Contact contact : ContactList.contactArrayList) {
      if (mobile.equals(contact.getMobile())) {
        System.out.println("This mobile already exists. Try again.\n");
        return true;
      }
    }
    return false;
  }

  protected static boolean isValidIndex(int index) {

    if (!ContactList.activeIndexes.contains(index)) {
      System.out.println("Invalid Input. Please choose between: " +
          ContactList.activeIndexes.toString() + "\n");
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
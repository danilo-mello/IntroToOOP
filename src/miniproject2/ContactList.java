package miniproject2;

import java.util.ArrayList;

public class ContactList {

  protected static ArrayList<Contact> contactArrayList = new ArrayList<>();
  protected static ArrayList<Integer> activeIndexes = new ArrayList<>();
  private static String name = "";

  protected static void listAllContacts() {
    if (contactArrayList.size() > 0) {
      for (Contact contact : contactArrayList) {
        System.out.println(contact.toString());
      }
    } else {
      System.out.println("There is no contacts in the list.");
    }
  }

  protected static void addContact() {

    String[] info = InputCollector.getInformation();
    contactArrayList.add(new Contact(info[0], info[1], info[2], info[3], info[4]));
    activeIndexes.add(Contact.counter);

  }

  protected static String removeContact(int contactIndex) {

    for (Contact contact : contactArrayList) {
      if (contactIndex == contact.getIndex()) {
        name = contact.getName();
      }
    }
    activeIndexes.remove(contactIndex);
    contactArrayList.remove(contactIndex);
    return name;
  }

  protected static String updateContact(int contactIndex) {

    String[] info = InputCollector.getInformation();

    for (Contact contact : contactArrayList) {
      if (contactIndex == contact.getIndex()) {
         contact.setName(info[0]);
         contact.setMobile(info[1]);
         contact.setWork(info[2]);
         contact.setHome(info[3]);
         contact.setCity(info[4]);
      }
    }
    return "Successfully updated";
  }

}

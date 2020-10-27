package miniproject2;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.ArrayList;

public class ContactList {

  protected static ArrayList<Contact> contactArrayList = new ArrayList<>();
  protected static ArrayList<Integer> activeIndexes = new ArrayList<>();

  protected static void listAllContacts() {
    if (contactArrayList.size() > 0) {
      for (Contact contact : contactArrayList) {
        System.out.println(contact.toString());
      }
    } else {
      System.out.println("There is no contacts in the list.\n");
    }
  }

  protected static void addContact() {

    String[] info = InputCollector.getInformation();
    info[0] = StringUtils.capitalize(info[0]);
    info[1] = info[1].substring(0, 3) + "-" + info[1].substring(3, 6) + "-" +
        info[1].substring(6);
    if (info[2].length() > 7) {
      info[2] = info[2].substring(0, 3) + "-" + info[2].substring(3, 6) + "-" +
          info[2].substring(6);
    }
    if (info[3].length() > 7) {
      info[3] = info[3].substring(0, 3) + "-" + info[3].substring(3, 6) + "-" +
          info[3].substring(6);
    }
    info[4] = StringUtils.capitalize(info[4]);
    contactArrayList.add(new Contact(info[0], info[1], info[2], info[3], info[4]));
    activeIndexes.add(Contact.counter);
    Contact.counter++;
    System.out.println("Successfully added a new contact!\n");
  }

  protected static String removeContact(int contactIndex) {

    String name = "";
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
    info[0] = StringUtils.capitalize(info[0]);
    info[1] = info[1].substring(0, 3) + "-" + info[1].substring(3, 6) + "-" +
        info[1].substring(6);
    if (info[2].length() > 7) {
      info[2] = info[2].substring(0, 3) + "-" + info[2].substring(3, 6) + "-" +
          info[2].substring(6);
    }
    if (info[3].length() > 7) {
      info[3] = info[3].substring(0, 3) + "-" + info[3].substring(3, 6) + "-" +
          info[3].substring(6);
    }
    info[4] = StringUtils.capitalize(info[4]);

    for (Contact contact : contactArrayList) {
      if (contactIndex == contact.getIndex()) {
         contact.setName(info[0]);
         contact.setMobile(info[1]);
         contact.setWork(info[2]);
         contact.setHome(info[3]);
         contact.setCity(info[4]);
      }
    }
    return "Successfully updated\n";
  }

}

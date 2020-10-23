package miniproject2;

public class Driver {

  private static void printMenu() {
    System.out.println("+≡≡≡  Contact App   ≡≡≡+");
    System.out.println("| 1. List All Contacts |");
    System.out.println("| 2. Add new Contact   |");
    System.out.println("| 3. Remove Contact    |");
    System.out.println("| 4. Update Contact    |");
    System.out.println("| 5. Quit              |");
    System.out.println("|======================|");
  }

  public static void main(String[] args) {

    int intIndex;

    while (true) {
      printMenu();
      String userOptionInput = InputCollector.getUserInput("Enter your option:");
      switch (userOptionInput) {

        case ("1"):

          ContactList.listAllContacts();
          break;

        case ("2"):

          ContactList.addContact();
          Contact.counter++;
          System.out.println("Successfully added a new contact!");
          break;

        case ("3"):

          ContactList.listAllContacts();

          intIndex = InputCollector.getIndex(true);
          while (InputCollector.isValidIndex(intIndex)) {
            intIndex = InputCollector.getIndex(true);
          }

          System.out.println("Successfully removed " + ContactList.removeContact(intIndex));
          break;

        case ("4"):

          ContactList.listAllContacts();

          intIndex = InputCollector.getIndex(false);
          while (InputCollector.isValidIndex(intIndex)) {
            intIndex = InputCollector.getIndex(false);
          }

          System.out.println(ContactList.updateContact(intIndex));
          break;

        case ("5"):

          System.out.println("\nBye!\n");
          System.exit(0);

        default:

          System.out.println("\nInvalid input!\n");
          break;

      }
    }

  }

}

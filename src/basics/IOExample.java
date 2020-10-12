package basics;

import java.util.Scanner;

public class IOExample {
    public static void main(String[] args) {

        while (true) {

            // Write a program to say "I love you" in each language
            // "en" - English
            // "pt-br" - Portuguese (Brazil)
            // "es" - Spanish
            // "jp" - Japanese
            // "kr" - Korean

            // 1. create a scanner object
            Scanner in = new Scanner(System.in);

            System.out.print("Enter the language code (Q to quit): ");
            String countryCode = in.nextLine();
            switch (countryCode) {
                case "en":
                    System.out.println("I love you!");
                    break;
                case "pt-br":
                    System.out.println("Eu amo voce!");
                    break;
                case "es":
                    System.out.println("Te amo!");
                    break;
                case "jp":
                    System.out.println("Aishiteru!");
                    break;
                case "kr":
                    System.out.println("Salanghae!");
                    break;
                case "Q":
                    System.exit(0);  // terminate program
                default:
                    System.out.println("Country Code Not Supported!");
                    break;
            }
        }

    }
}

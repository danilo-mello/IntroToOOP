package oop.userInteraction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
    //public static void main(String[] args) throws FileNotFoundException {
    public static void main(String[] args) {
        // 1. read a text file
        // 2. command line arguments
        // 3. handle exceptions
        if (args.length != 1) {
            System.err.println("Invalid number of arguments. Please enter on city name.");
        } else {
            String filename = args[0];
            int counter = 0;
            try {
                File file = new File(filename + ".txt");
                Scanner in = new Scanner(file);

                // read text file by token (word)
                //while (in.hasNext()) {
                //    System.out.println(in.next());
                //}
                while (in.hasNextLine()) {
                    String line = in.nextLine();
                    String[] words = line.split(" ");
                    counter += words.length;
                }
                System.out.println(filename + ".txt file contain " + counter + " words.");
            } catch (FileNotFoundException e) {
                // stdin : keyboard input (System.in)
                // stdout : output (console) (System.out)
                // stderr : display errors (ŕed color) (System.err)

                // System.out.println(e.getLocalizedMessage());
                System.err.println(e.getLocalizedMessage());
            }
        }
    }
}

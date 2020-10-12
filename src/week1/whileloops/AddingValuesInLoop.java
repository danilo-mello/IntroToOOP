package week1.whileloops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        int number = 0;
        System.out.println("I will add up the numbers you give me.");
        while (true) {
            System.out.print("Number: ");
            number = in.nextInt();
            total += number;

            if (number == 0) {
                break;
            }

            System.out.println("The total so far is " + total);
        }
        System.out.println("\nThe total is " + total + ".");
    }
}

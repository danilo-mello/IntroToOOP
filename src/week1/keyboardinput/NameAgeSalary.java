package week1.keyboardinput;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Hello. What's your name?");
        String name = in.nextLine();

        System.out.println("Hi " + name + "!" + " How old are you?");
        int age = in.nextInt();

        System.out.println("So you're " + age + ", eh? That's not old at all!\nHow much do you make, " + name + "?");
        double salary = in.nextDouble();

        System.out.println(salary + "! I hope that's per hour and not per year! LOL!");

    }
}

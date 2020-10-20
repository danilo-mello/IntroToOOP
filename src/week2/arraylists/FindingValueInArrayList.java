package week2.arraylists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindingValueInArrayList {

  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList();
    Random r1 = new Random();
    Scanner in = new Scanner(System.in);

    for (int i = 0; i < 10; i++) {
      list.add(r1.nextInt(50) + 1);
    }

    System.out.println("ArrayList: " + list.toString());

    System.out.print("Value to find: ");
    int value = in.nextInt();

    System.out.println();

    for (int j : list) {
      if (j == value) {
        System.out.println(value + " is in the ArrayList.");
      }
    }
  }
}
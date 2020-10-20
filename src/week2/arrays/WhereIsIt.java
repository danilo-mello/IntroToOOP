package week2.arrays;

import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {

  public static void main(String[] args) {
    int[] a1 = new int[10];
    Random r1 = new Random();
    Scanner in = new Scanner(System.in);

    for (int i = 0; i < a1.length; i++) {
      a1[i] = r1.nextInt(50) +1;
    }

    System.out.print("Array: ");
    for (int j : a1) {
      System.out.print(j + " ");
    }
    System.out.println();
    System.out.print("Value to find: ");
    int toFind = in.nextInt();
    boolean flag = true;

    for (int i = 0; i < a1.length; i++) {
      if (toFind == a1[i]) {
        System.out.println("\n" + toFind + " is in slot " + i + ".");
        flag = false;
      }
    }
    if (flag) {
      System.out.println("\n" + toFind + " is not in the array.");
    }
  }
}
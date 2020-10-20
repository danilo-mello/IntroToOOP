package week2.arrays;

import java.util.Random;

public class FindingTheLargestValue {

  public static void main(String[] args) {
    int[] a1 = new int[10];
    Random r1 = new Random();
    for (int i = 0; i < a1.length; i++) {
      a1[i] = r1.nextInt(100) + 1;
    }

    System.out.print("Array: ");
    for (int j : a1) {
      System.out.print(j + " ");
    }

    int max = a1[0];
    for (int i = 1; i < a1.length; i++) {
      if (max < a1[i]) {
        max = a1[i];
      }
    }
    System.out.println("\n\nThe largest value is " + max);
  }
}
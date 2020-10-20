package week2.arrays;

import java.util.Random;

public class CopyingArrays {

  public static void main(String[] args) {
    int[] a1 = new int[10];
    Random r1 = new Random();

    for (int i = 0; i < a1.length; i++) {
      a1[i] = r1.nextInt(100) + 1;
    }

    int[] a2 = a1.clone();
    a1[9] = -7;

    System.out.print("Array 1: ");
    for (int k : a1) {
      System.out.print(k + " ");
    }
    System.out.println();
    System.out.print("Array 2: ");
    for (int j : a2) {
      System.out.print(j + " ");
    }
  }
}
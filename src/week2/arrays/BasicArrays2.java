package week2.arrays;

import java.util.Random;

public class BasicArrays2 {

  public static void main(String[] args) {
    int[] a1 = new int[10];
    Random r1 = new Random();
    for (int i = 0; i < a1.length; i++) {
      a1[i] = r1.nextInt(100) + 1;
      System.out.println("Slot " + i + " contains a " + a1[i]);
    }
  }
}
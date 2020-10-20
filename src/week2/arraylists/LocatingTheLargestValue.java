package week2.arraylists;

import java.util.ArrayList;
import java.util.Random;

public class LocatingTheLargestValue {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    Random r1 = new Random();

    for (int i = 0; i < 10; i++) {
      list.add(r1.nextInt(100) + 1);
    }

    int max = list.get(0);
    int index = 0;

    for (int j : list) {
      if (j > max) {
        max = j;
        index = list.indexOf(j);
      }
    }
    System.out.println("ArrayList: " + list.toString());

    System.out.println("\nThe largest value is " + max + ", which is in slot " + index);
  }
}
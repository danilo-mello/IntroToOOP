package week2.arraylists;

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists2 {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList();
    Random r1 = new Random();

    for (int i = 0; i < 10; i++) {
      list.add(r1.nextInt(100) + 1);
    }

    System.out.println("ArrayList: " + list.toString());

  }
}
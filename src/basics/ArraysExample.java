package basics;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        // A sequence of elements of the same type
        // arrays have FIXED-SIZE

        // 1. Array literal syntax
        int[] arr1 = {1, 2, 3, 4, 5};

        // the length (size) of an array
        System.out.println(arr1.length);

        // access elements in array
        System.out.println(arr1[0]);  // first element
        System.out.println(arr1[arr1.length - 1]);  // last element

        // traditional for loop
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // change the element
        arr1[0] = 7;

        // for each loop
        for (int elem : arr1) {
            System.out.println(elem);
        }

        // This doesn't print the content of the array
        System.out.println(arr1);

        // This is how to print the content
        System.out.println(Arrays.toString(arr1));

        // 2. Create an array with "size"
        // creating a new array with size 10
        // by default, it stores all the values as 0.
        int[] arr2 = new int[10];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr2));

        // int[] arr3 = new int[] {1, 2};

        String[] countries = {"Canada", "Japan", "Brazil", "Spain", "Germany", "Korea"};

        for (String country : countries) {
            System.out.println(country);
        }


    }
}

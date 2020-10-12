package basics;

import java.util.Arrays;

public class StaticMethods {
    public static void main(String[] args) {

        System.out.println(addTwo(10, 20));

        int a = 10;
        int b = 20;
        System.out.printf("a = %d, b = %d\n", a, b);
        swap(a, b);
        System.out.printf("a = %d, b = %d\n", a, b);

        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr)); // [1, 2, 3]
        changeFirstElement(arr);
        System.out.println(Arrays.toString(arr)); // [7, 2, 3]

        // copying an array
        // 1st way
        int[] arr1 = arr.clone();
        // 2nd way
        int[] arr2 = Arrays.copyOf(arr, arr.length);

        System.out.println(arr == arr1); // false (this way compares the reference)
        System.out.println(arr == arr2); // false
        System.out.println(Arrays.equals(arr, arr1)); // true (this is the way to compare the content)


    }
    public static int addTwo(int a, int b) {
        return a + b;
    }

    // pass by value
    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;

    }

    // pass by reference
    public static void changeFirstElement(int[] arr) {
        arr[0] = 7;

    }

}

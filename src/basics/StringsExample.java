package basics;


// Memory
// - Heap
// - Stack
// - Data
// - Code
public class StringsExample {
    public static void main(String[] args) {
        // 1. string literal
        String name = "Derrick";  // data segment of the memory (read only)
        String name1 = new String("Derrick");
        String name2 = "Derrick";
        String name3 = new String("Derrick");

        System.out.println(name == name2);  // true
        System.out.println(name1 == name2);  // false
        System.out.println(name1 == name3);  // false

        // when comparing strings, we mustn't use ==, because they compare memory address
        // instead, to compare the content, we use the method equals():

        System.out.println(name.equals(name2)); // true

        System.out.println(!name.equals(name2)); // false

        // length (the number of characters)
        System.out.println(name.length());

        String cafe = "Starbucks";  // second cup, blenz, tim hortons
        //             012345678
        System.out.println(cafe.substring(0, 4));  // Star

        // indexOf
        System.out.println(cafe.indexOf("bucks"));  // 4

        // Exercise
        // Print every char in a String
        String brand = "Panasonic";

        for (int i = 0; i < brand.length(); i++) {
            System.out.println(brand.substring(i, i + 1));
        }

        for (int i = 0; i < brand.length(); i++) {
            System.out.println(brand.charAt(i));
        }

        // toCharArray : "Sony" -> {'S', 'o', 'n', 'y'}
        for (char ch : brand.toCharArray()) {
            System.out.println(ch);
        }
    }
}

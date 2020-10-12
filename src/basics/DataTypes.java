package basics;
// python: snake_case
// java: camelCase
public class DataTypes {
    public static void main(String[] args) {
        // Primitive Types
        // - the value (itself) gets stored in memory

        // To create a variable in Java
        // Java is static typed Language
        byte day = 127;        //  8 bits  (-128 <= <= 127)
        short year = 2020;     // 16 bits (-2^15 <= <= 2^15-1)
        int age = 26;          // 32 bits (-2^31 <= <= 2^31-1)
        long sin = 123456789L; // 64 bits (-2^63 <= <= 2^63-1)

        // you must use single quotes, single character
        // also uses 1 byte -> you could use the corresponding number from the ascii table
        char gender = 'M';
        System.out.println(gender);
        char ch = 65;  // 'A'

        // the boolean type in java is in lower case
        boolean flag = true;

        // floating point number, must put f at the end
        // uses 32 bits
        float weight = 135.54f;

        // double uses 64 bit
        // double precision floating point number
        double height = 180.23;

        // Operators
        // Arithmetic -> +, -, *, /, %
        // Assignment operator -> =
        // Comparison -> <, >, <=, >=, ==, !=
        // Increment(Decrement) -> ++, --, +=, -=
        // Logical -> && (and), || (or), ! (not)

        int x = 10;
        // x++;  // Increment by 1
        int y = x++; // 10
        int z = ++x; // 11
        System.out.println(y);
        System.out.println(z);
        System.out.println(x);

    }
}

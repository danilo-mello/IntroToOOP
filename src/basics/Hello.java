package basics;

public class Hello {
    // psvm + tab -> main method
    // main method -> you must have this method to run your java file
    public static void main(String[] args) {
        // sout + tab -> println method
        // println() -> print with a newline
        System.out.println("Hello, Java!");

        // print() -> print without a newline
        System.out.print("Vancouver,");
        System.out.print("BC\n");

        //printf() -> print with format
        // %s : string
        // %d : int (digit)
        // %f : float
        System.out.printf("%s starts at %02d:%02d pm\n", "Java", 1, 0);

    }
}
// python -> interpreted language, dynamic typing
// java -> compiled language, static typing -> faster
//      -> source code -> byte code
//      -> runs on JVM (Java Virtual Machine) -> portable
//      -> designed 1990s by James Gosling, one of the most popular programming languages
//      -> Web back-end (server-side), 'Enterprise' size Application
//      -> 'Object-Oriented Programming' Language

// class name -> Capitalized
// package name -> lowercase
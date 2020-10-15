package lab1;

public class Driver {
    public static void main(String[] args) {
        try {
            Model m1 = new Model();
            Model m2 = new Model("Angelina", "Jolie", 66, 119.5);
            Model m3 = new Model("Felicity", "Jones", 63, 121.5, true, true);

            m1.setFirstName("Diane");
            m1.setLastName("Kruger");
            m1.setHeight(5, 7);
            m1.setHeight(70);
            m1.setWeight(80);

            m1.printDetails();
            m2.displayModelDetails();
            m3.printDetails();

            // m2.setWeight(290);
            // m2.setWeight(70);
            // m2.setHeight(123);
            // m2.setHeight(23);
            // m2.setHeight(8, 8);
            // m2.setHeight(1, 2);
            // m2.setWeight(200);
            // m2.setWeight(20);
            // m2.setFirstName("ab");
            // m2.setFirstName("abcdefghijklmnopqrstuvwxyz");
            // m2.setLastName("ab");
            // m2.setLastName("abcdefghijklmnopqrstuvwxyz");

            m2.setSmokes(true);
            m2.setCanTravel(false);

            m2.displayModelDetails();
            System.out.println(m2.getFirstName() + " weight in kg is " + m1.getWeightKg() + ".");

        } catch (IllegalArgumentException e) {
            System.err.println(e.getLocalizedMessage());
        }
    }
}
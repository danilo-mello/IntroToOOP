package lab1;

public class ModelValidation {
    public static void checkFirstName(String firstName) {
        if (firstName.length() < 3 || firstName.length() > 20) {
            throw new IllegalArgumentException("First name must be 3-20 characters long");
        }
    }

    public static void checkLastName(String lastName) {
        if (lastName.length() < 3 || lastName.length() > 20) {
            throw new IllegalArgumentException("Last name must be 3-20 characters long");
        }
    }

    public static void checkHeight(int height) {
        if (height < 24 || height > 84) {
            throw new IllegalArgumentException("Height must be between 24 and 84 inches.");
        }
    }

    public static void checkWeight(double weight) {
        if (weight < 80 || weight > 280) {
            throw new IllegalArgumentException("Weight must be between 80 and 280 pounds.");
        }
    }
}
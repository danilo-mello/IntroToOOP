package lab1;
import static lab1.ModelValidation.*;

/**
 * @author Danilo Mello
 */
public class Model {

    public static final int INCHES_PER_FOOT = 12;
    public static final double POUNDS_PER_KG = 2.2046;
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final int TALL_INCHES = 67;
    public static final double THIN_POUNDS = 140.0;
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;

    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smokes;

    /**
     * Constructor without parameters (Default Constructor).
     */
    public Model() {
    }

    /**
     * Constructor with all parameters.
     * @param firstName String with the First Name (3-20 chars).
     * @param lastName String with the Last Name (3-20 chars).
     * @param height Integer with the Height in inches (24-84).
     * @param weight Double with the weight in pounds (80-280).
     * @param canTravel Boolean if the model can travel or not.
     * @param smokes Boolean if the model smokes or not.
     */
    public Model(String firstName, String lastName, int height, double weight, boolean canTravel, boolean smokes) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);
        setCanTravel(canTravel);
        setSmokes(smokes);
    }

    /**
     * Constructor with 4 arguments: First Name, Last Name, Height and Weight.
     * canTravel is true and smokes is false by default.
     * @param firstName String with the First Name (3-20 chars).
     * @param lastName String with the Last Name (3-20 chars).
     * @param height Integer with the Height in inches (24-84).
     * @param weight Double with the weight in pounds (80-280).
     */
    public Model(String firstName, String lastName, int height, double weight) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);
        setCanTravel(true);
        setSmokes(false);
    }

    /**
     * Returns a string with the first name.
     * @return String with the first Name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Returns a string with the last name.
     * @return String with the last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns an integer with the height in inches.
     * @return Int with the height.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Returns a double with the weight in pounds.
     * @return Double with the weight.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Returns a boolean for if a model can travel or not.
     * @return Boolean true if the model can travel or false if the model cannot travel.
     */
    public boolean isCanTravel() {
        return canTravel;
    }

    /**
     * Returns a boolean for if a model smokes or not.
     * @return Boolean true if the model smokes or false if she doesn't.
     */
    public boolean isSmokes() {
        return smokes;
    }

    /**
     * Checks if the first name is between 3-20 chars and sets it if correct.
     * @param firstName String with the first name.
     */
    public void setFirstName(String firstName) {
        checkFirstName(firstName);
        this.firstName = firstName;
    }

    /**
     * Checks if the last name is between 3-20 chars and sets it if correct.
     * @param lastName String with the last name.
     */
    public void setLastName(String lastName) {
        checkLastName(lastName);
        this.lastName = lastName;
    }

    /**
     * Checks if the height is between 24-84 inches and sets it if correct.
     * @param height int with the height in inches.
     */
    public void setHeight(int height) {
        checkHeight(height);
        this.height = height;
    }

    /**
     * Checks if the weight is between 80-280 pounds and sets it if correct.
     * @param pounds double with the weight in pounds.
     */
    public void setWeight(double pounds) {
        checkWeight(pounds);
        this.weight = pounds;
    }

    /**
     * Sets the boolean if the model can travel or not.
     * @param canTravel Boolean with true if the model can travel or false if she can't.
     */
    public void setCanTravel(boolean canTravel) {
        this.canTravel = canTravel;
    }

    /**
     * Sets the boolean if the model smokes or not.
     * @param smokes Boolean with true if the models smokes or false if she doesn't
     */
    public void setSmokes(boolean smokes) {
        this.smokes = smokes;
    }

    /**
     * Returns a formatted String with the height in feet and inches.
     * @return String with the height in feet and inches.
     */
    public String getHeightInFeetAndInches() {
        int feet = height / INCHES_PER_FOOT;
        int inches = height % INCHES_PER_FOOT;
        if (inches == 0) {
            return String.format("%d feet", feet);
        } else if (inches == 1) {
            return String.format("%d feet %d inch", feet, inches);
        } else {
            return String.format("%d feet %d inches", feet, inches);
        }
    }

    /**
     * Returns the weight in kilograms.
     * @return a rounded double with the weight in kilograms.
     */
    public long getWeightKg() {
        return Math.round(getWeight() / POUNDS_PER_KG);
    }

    /**
     * Receives the weight in kilograms, checks if the value is accepted and stores it in pounds.
     * @param kilograms long with the weight in kilograms.
     */
    public void setWeight(long kilograms) {
        checkWeight(kilograms * POUNDS_PER_KG);
        this.weight = POUNDS_PER_KG * kilograms;
    }

    /**
     * Receives the height in feet + inches, checks if the value is accepted and stores it in inches.
     * @param feet int with the feet part of the height.
     * @param inches int with the inches part of the height.
     */
    public void setHeight(int feet, int inches) {
        checkHeight((feet * INCHES_PER_FOOT) + inches);
        this.height = (feet * INCHES_PER_FOOT) + inches;
    }

    /**
     * Prints detail information about this Model
     */
    public void printDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeight() + " inches");
        System.out.println("Weight: " + Math.round(getWeight()) + " pounds");
        if (isCanTravel()) {
            System.out.println("Does travel");
        } else {
            System.out.println("Does not travel");
        }
        if (isSmokes()) {
            System.out.println("Does smoke ");
        } else {
            System.out.println("Does not smoke ");
        }
        System.out.println();
    }

    /**
     * Calculates the hourly salary.
     * @return int with the final hourly salary.
     */
    public int calculatePayDollarsPerHour() {
        int hourlyRate = BASE_RATE_DOLLARS_PER_HOUR;
        if (getHeight() >= TALL_INCHES && getWeight() < THIN_POUNDS) {
            hourlyRate += TALL_THIN_BONUS_DOLLARS_PER_HOUR;
        }
        if (isCanTravel()) {
            hourlyRate += TRAVEL_BONUS_DOLLARS_PER_HOUR;
        }
        if (isSmokes()) {
            hourlyRate -= SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        }
        return hourlyRate;
    }

    /**
     * Displays the model's details
     */
    public void displayModelDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeightInFeetAndInches());
        System.out.println("Weight: " + Math.round(getWeight()) + " pounds");
        System.out.println("Travels: " + (isCanTravel() ? "yep" : "nope"));
        System.out.println("Smokes: " + (isSmokes() ? "yep" : "nope"));
        System.out.println("Hourly rate: $" + calculatePayDollarsPerHour());
        System.out.println();
    }
}
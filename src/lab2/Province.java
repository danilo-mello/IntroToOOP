package lab2;

import java.util.Arrays;

public class Province {

    private static final int DEFAULT_POPULATION = 4_648_055;
    private static final String DEFAULT_PROVINCE = "British Columbia";
    private static final String DEFAULT_CAPITAL = "Victoria";

    private String name;
    private String capital;
    private long population;

    public Province(String name, String capital, long population) {
        if (isValidProvince(name) && isValidCapital(capital) && isValidPopulation(population)) {
            setName(name);
            setCapital(capital);
            setPopulation(population);
        } else {
            setName(getDefaultProvince());
            setCapital(getDefaultCapital());
            setPopulation(getDefaultPopulation());
        }
    }

    public Province(){
        setName(getDefaultProvince());
        setCapital(getDefaultCapital());
        setPopulation(getDefaultPopulation());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getName(){
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public long getPopulation() {
        return population;
    }

    public static String getDefaultProvince() {
        return DEFAULT_PROVINCE;
    }

    public static String getDefaultCapital() {
        return DEFAULT_CAPITAL;
    }

    public static int getDefaultPopulation() {
        return DEFAULT_POPULATION;
    }

    private static boolean isValidPopulation(long population) {
        return ((population >= 30_000) && (population <=15_000_000));
    }

    private static boolean isValidProvince(String name) {
        String[] provinces;
        provinces = new String[]{"Alberta", "British Columbia", "Manitoba", "New Brunswick",
                "Newfoundland and Labrador", "Nova Scotia", "Ontario",
                "Quebec", "Prince Edward Island", "Saskatchewan"};
        return Arrays.asList(provinces).contains(name);
    }

    private static boolean isValidCapital(String capital) {
        String[] capitals;
        capitals = new String[]{"Charlottetown", "Edmonton", "Fredericton", "Halifax",
                "Quebec", "Regina", "St. John's", "Toronto", "Victoria", "Winnipeg"};
        return Arrays.asList(capitals).contains(capital);
    }

    public String getDetails() {
        return String.format("The capital of %s (population. %d) is %s.", getName(), getPopulation(), getCapital());
    }

}

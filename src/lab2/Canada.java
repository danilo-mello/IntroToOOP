package lab2;

public class Canada {

    private Province[] provinces;

    public Canada(){
        provinces = new Province[]{new Province("Alberta", "Edmonton", 4_067_175),
                new Province("British Columbia", "Victoria", 4_648_055),
                new Province("Manitoba", "Winnipeg", 1_278_365),
                new Province("New Brunswick", "Halifax", 747_101),
                new Province("Newfoundland and Labrador", "St. John's", 519_716),
                new Province("Nova Scotia", "Fredericton", 923_598),
                new Province("Ontario", "Toronto", 13_448_494),
                new Province("Prince Edward Island", "Charlottetown", 142_907),
                new Province("Quebec", "Quebec", 8_164_361),
                new Province("Saskatchewan", "Regina", 1_098_352)};
    }
    public void displayAllProvinces() {
        for (Province province : provinces)
            System.out.println(province.getDetails());
    }

    public int getNumOfProvincesBetween(int min, int max) {
        int numberOfProvinces = 0;
        for (Province province : provinces) {
            if (province.getPopulation() / 1_000_000 >= min && province.getPopulation() / 1_000_000 <= max) {
                numberOfProvinces++;
            }
        }
        return numberOfProvinces;
    }

}

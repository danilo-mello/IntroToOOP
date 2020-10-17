package miniproject1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MiniProject {

    private final String city;
    private final StringBuilder wordSoFar;

    /**
     * Constructor method
     */
    MiniProject(){
        String[] cities = readFile();
        city = pickCity(cities);
        wordSoFar = wordSoFar(city);
    }

    private String getCity() {
        return city;
    }

    private StringBuilder getWordSoFar() {
        return wordSoFar;
    }

    /**
     * Reads the designated file and returns an Array of Strings.
     * @return Returns a Array of Strings with all the cities in the file.
     */
    private String[] readFile() {
        File file = new File("cities.txt");
        try {
            Scanner in = new Scanner(file);
            List<String> cities = new ArrayList<>();
            while (in.hasNextLine()) {
                String city = in.nextLine();
                cities.add(city);
            }
            in.close();
            return cities.toArray(new String[0]);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return new String[0];
        }
    }

    /**
     * Receives an array of Strings and randomly selects one of the strings
     * @param cities an array of Strings with city names.
     * @return A ramdomly city from the given array.
     */
    private String pickCity(String[] cities) {
        Random random = new Random();
        int n = random.nextInt(cities.length);
        return cities[n];
    }

    /**
     * Builds a StringBuilder hiding the String received as a parameter
     * e.g. "Rio de Janeiro" -> "___ __ _______".
     * @param chosenCity String with a city name
     * @return A StringBuilder with the letters swapped by underscores.
     */
    private StringBuilder wordSoFar(String chosenCity) {
        String hiddenWord = "";
        for (int i = 0; i < chosenCity.length(); i++) {
            if (chosenCity.charAt(i) == ' ') {
                hiddenWord = hiddenWord.concat(" ");
            } else {
                hiddenWord = hiddenWord.concat("_");
            }
        }
        return new StringBuilder(hiddenWord);
    }

    /**
     * Method to check if the game was won.
     * @param counterToWin int with the number of correct guessed letters.
     * @return true if game was won, false if not.
     */
    private boolean CheckWin(int counterToWin) {
        if (counterToWin == getCity().length()) {
            System.out.println("You win!");
            System.out.println("You have guessed '" + wordSoFar + "' correctly.");
            return true;
        } else return false;
    }

    /**
     * Gives a message if the game was lost.
     * @param counterToLose int with the number of wrong guessed letters
     */
    private void CheckLose(int counterToLose) {
        if (counterToLose == 10) {
            System.out.println("You lose!");
            System.out.println("The correct word was " + getCity() + "!");
        }
    }

    /**
     * Method to initialize and start the game.
     */
    public void StartGame(){
        Question(getCity(), getWordSoFar());
    }

    /**
     * Method to receive a guess and validate it.
     * @return String with the letter.
     */
    private String Guess() {
        Scanner in = new Scanner(System.in);
        String letter;

        while (!in.hasNext("[abcdefghijklmnopqrstuvwxyzABCDEFGHIJLMNOPQRSTUVWXYZ]")) {
            System.out.println("Invalid input!");
            System.out.print("Guess a letter: ");
            in.next();
        }
        letter = in.next();

        return letter;
    }

    /**
     * This method calls the Guess method, verifies if the letter was already guessed and
     * if the city contains the guessed letter, updating the hidden word with if true
     * and showing the previous wrong guesses.
     * @param chosenCity String with the selected city.
     * @param wordSoFar String with the hidden selected city.
     */
    private void Question(String chosenCity, StringBuilder wordSoFar) {

        String usedLetters = "";
        String used = "";
        int counterToLose = 0;
        int counterToWin = 0;
        boolean contains;

        for (int i = 0; i < chosenCity.length(); i++) {
            if (chosenCity.charAt(i) == ' ') {
                counterToWin++;
            }
        }

        System.out.println("Here's the question: ");
        System.out.println(wordSoFar);

        while (counterToLose < 10) {
            System.out.print("Guess a letter: ");
            String letter = Guess();
            letter = letter.toLowerCase();

            if (used.contains(letter)) {
                System.out.println("You already typed " + letter + "!");

            } else {
                used = used.concat(letter);
                used = used.concat(letter.toUpperCase());
                contains = chosenCity.toLowerCase().contains(letter);

                if (contains) {
                    for (int i = 0; i < chosenCity.length(); i++) {

                        if (letter.charAt(0) == chosenCity.charAt(i)) {
                            wordSoFar.setCharAt(i, letter.charAt(0));
                            counterToWin++;

                        } else if (letter.toUpperCase().charAt(0) == chosenCity.charAt(i)) {
                            wordSoFar.setCharAt(i, letter.toUpperCase().charAt(0));
                            counterToWin++;
                        }
                    }

                } else {
                    usedLetters = usedLetters.concat(letter + " ");
                    counterToLose++;
                }

                if (CheckWin(counterToWin)) System.exit(0);
                System.out.println("You're guessing: " + wordSoFar);
                System.out.println("You have guessed (" + counterToLose + ") wrong letters: " + usedLetters);
            }
        }
        CheckLose(counterToLose);
    }
}
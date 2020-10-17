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

    private String pickCity(String[] cities) {
        Random random = new Random();
        int n = random.nextInt(cities.length);
        return cities[n];
    }

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

    private boolean CheckWin(int counterToWin) {
        if (counterToWin == getCity().length()) {
            System.out.println("You win!");
            System.out.println("You have guessed '" + wordSoFar + "' correctly.");
            return true;
        } else return false;
    }

    private void CheckLose(int counterToLose) {
        if (counterToLose == 10) {
            System.out.println("You lose!");
            System.out.println("The correct word was " + getCity() + "!");
        }
    }

    public void StartGame(){
        Question(getCity(), getWordSoFar());
    }

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
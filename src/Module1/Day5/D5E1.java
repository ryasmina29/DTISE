/* package Module1.Day5;
//Word guessing game

import java.util.Random;
import java.util.Scanner;

public class D5E1 {
    private final String[] words = {"nose", "apple", "mouse", "jacket"};
    private final int maxAttempts = 10;


    //Select the random word from the words array
    private String selectRandomWord() {
        return words[new Random().nextInt(words.length)];
    }

    //Hide the random word with underscores
    private String hidetheWord(String selectRandomWord) {
        return selectRandomWord.replaceAll(".", "_");
    }

    //Prompt the player to guess the letter
    private char getPlayerGuess() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put your guess here: ");
        return sc.next().charAt(0);
    }

    //Check if the guessed char is in the random word
    private boolean isGuessCorrect(String SelectRandomWorld, char guessedChar) {
        return (SelectRandomWorld.contains(String.valueOf(guessedChar)));
    }

    //Update hidden word
    private String updateHiddenWord(String SelectRandomWord, String hiddenWord, char guessedChar) {
        StringBuilder updateWord = new StringBuilder(hiddenWord);
        for (int i = 0; i < hiddenWord.length(); i++) {
            if (isGuessCorrect(hiddenWord, guessedChar)) {
                updateWord.setCharAt(i, guessedChar);
            }
        }
        return updateWord.toString();
    }


        private void displayGameResult(String SelectRandomWorld, String hiddenWord, int attempts) {
        String displayedWord = "";
        if (playerAttempts < maxAttempts && SelectRandomWord.equals(hiddenWord)) {
            displayedWord = "Congratulation, you guess the word!";
        }
        return displayedWord;
    }
}

 */
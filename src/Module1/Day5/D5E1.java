/*package Module1.Day5;
//Word guessing game
import java.util.Random;
import java.util.Scanner;

public class D5E1 {
    private final String[] words = {"nose", "apple", "mouse", "jacket"};

    //Select the random word from the words array
    private String selectRandomWord() {
        return words[new Random().nextInt(words.length)];
    }

    //Hide the random word with underscores
    private String hidetheWord(String words) {
        return words.replaceAll(".", "_");
    }

    //Prompt the player to guess the letter
    private Character getPlayerGuess() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put your guess here: ");
        return sc.next().charAt(0);
    }

    //Check if the guessed char is in the random word
    private boolean isGuessCorrect(String SelectRandomWorld, Character guessedChar) {
        return (SelectRandomWorld.contains(guessedChar + ""));
    }

    //Update hidden word
    private String updateHiddenWord(String SelectRandomWord, String hiddenWord, Character guessedChar) {
        return SelectRandomWord.replaceAll(String.format("[%s%c]", hiddenWord, guessedChar), "_");
    }




    //The max attempt is 10 and make an array contained every character from the random word
        int maxAttempts = 10;
        int playerAttempts = 0;

        //Call the word hiding function
        System.out.println("Guess the word!");
        System.out.println(hidetheWord(SelectRandomWord));

        //THE GAME LOOP
        do {
            getPlayerGuess();
            if (isGuessCorrect(SelectRandomWord, getPlayerGuess())) {
                updateHiddenWord(SelectRandomWord, hidetheWord(SelectRandomWord), getPlayerGuess());
                System.out.println(maxAttempts - playerAttempts + " attempts left");
            } else if (!isGuessCorrect(SelectRandomWord, getPlayerGuess())) {
                playerAttempts++;
                System.out.println(updateHiddenWord(SelectRandomWord, hidetheWord(SelectRandomWord), getPlayerGuess()));
                System.out.println(maxAttempts - playerAttempts + " attempts left");
            }
        } while (playerAttempts < maxAttempts && !isGuessCorrect(SelectRandomWord, getPlayerGuess()));

        if (playerAttempts == maxAttempts) {
            System.out.println(loseGameResult(SelectRandomWord, playerAttempts, maxAttempts, hidetheWord(SelectRandomWord)));
        } else if (isGuessCorrect(SelectRandomWord, getPlayerGuess())) {
            System.out.println(winGameResult(SelectRandomWord, playerAttempts, maxAttempts, hidetheWord(SelectRandomWord)));
        }









    public static String winGameResult(String SelectRandomWord, int playerAttempts, int maxAttempts, String hiddenWord) {
        String displayedWord = "";
        if (playerAttempts < maxAttempts && SelectRandomWord.equals(hiddenWord)) {
            displayedWord = "Congratulation, you guess the word!";
        }
        return displayedWord;
    }


    public static String loseGameResult(String SelectRandomWorld, int playerAttempts, int maxAttempt, String hiddenWord) {
        String displayedWord = "";
        if (playerAttempts == maxAttempt) {
            displayedWord = "You lose!\nThe right word is: " + SelectRandomWorld;
        }
        return displayedWord;
    }
}


/*

while attempts = 0;
{
loop the gaming code
}

 */
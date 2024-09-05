package Day4;

import java.util.Scanner;
import java.util.Random;

public class D4E4 {
    public static void RunD4E4() {
        int randomNum, guessNum, attempts;
        Scanner sc = new Scanner(System.in);
        Random generator = new Random();
        randomNum = generator.nextInt(100) + 1;
        attempts = 1;

        System.out.println("Choose a number between 1 to 100!");

        do {
            guessNum = sc.nextInt();
            if (guessNum > randomNum) {
                System.out.println("Lower!");
                attempts += 1;
            } else {
                System.out.println("Higher!");
                attempts +=1;
            }
        } while (guessNum != randomNum);

        System.out.print("The right number is "+ randomNum + " and it took you " + attempts + " times to guess it!");

    }
}

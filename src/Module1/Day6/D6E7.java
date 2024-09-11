package Module1.Day6;

import java.util.Scanner;

public class D6E7 {
    public static void RunD6E6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word you want to reverse: ");
        String word = sc.nextLine();
        String temp = "";

        for (int i = 0; i < word.length(); i++) {
            Character c = word.charAt(i);
            temp = c + temp;
        }
        System.out.println("The reversed word is: " + temp);
    }
}

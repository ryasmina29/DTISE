package Module1.Day3;

import java.util.Arrays;
import java.util.Scanner;

//Anagram Check
public class D3E9 {
    public static void RunD3E9() {
        System.out.println("Day 3, Exercise 9");
        Scanner sc = new Scanner(System.in);
        System.out.println("Word 1: ");
        String wordA = sc.nextLine();
        System.out.println("Word 2: ");
        String wordB = sc.nextLine();


        System.out.print("Is it anagram? " + isAnagram (wordA, wordB));
    }
    public static boolean isAnagram(String wordA, String wordB) {
        char[] chA = wordA.toCharArray();
        char[] chB = wordB.toCharArray();
        Arrays.sort(chA);
        Arrays.sort(chB);
        return Arrays.equals(chA, chB);
    }
}

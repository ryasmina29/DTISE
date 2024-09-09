package Module1.Day3;
//Reverse string

import java.util.Scanner;

public class D3E5 {
    public static void RunD3E5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Word: ");
        String word = sc.nextLine();
        String reverse="";

        for (int i=0; i<word.length(); i++) {
            Character ch = word.charAt(i);
            reverse = ch + reverse;
        }
        System.out.println("Reversed word: "+ reverse);        }
    }






/*    public static String revword(String x) {
        int n = x.length();
        char ch = x.charAt(x.length()-1);
        String rev = "" + ch;
        for (int i = 0; i < n; i++) {
        }
            return rev;*/


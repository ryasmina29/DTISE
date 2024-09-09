package Module1.Day2;

import java.util.Scanner;

public class ExerciseDay2 {
    public static void runExerciseD2() {
        //Exercise 1
        System.out.println("Exercise 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Weather Degree: ");
        double weatherinF = sc.nextDouble();
        System.out.println("The weather in Celcius is: " + ((weatherinF - 32) * (5.0 / 9.0)));
        System.out.println();

        //Exercise 2
        System.out.println("Exercise 2");
        System.out.println("Distance in centimeter: ");
        double numCM = sc.nextDouble();
        System.out.println("The distance in Kilometer is: " + (numCM / 100000.0));
        System.out.println();

        //Exercise 3
        System.out.println("Exercise 3");
        System.out.println("Input amount: ");
        double n = sc.nextDouble();
        boolean isOdd = false;
        if (n % 2 == 0) {
            System.out.printf("Rp%,.2f", n);
        } else {
            System.out.println(isOdd);
        }
        System.out.println();

        //Exercise 4
        System.out.println("Exercise 4");
        String word = "Hello world";
        System.out.println(word.replace(word.substring(1, 4), ""));
        System.out.println();

        //Exercise 5
        System.out.println("Exercise 5");
        System.out.println("Is it Palindrome? ");
        String wordPal = sc.next();
        System.out.println(isPalindrome(wordPal));

    }

    public static boolean isPalindrome(String x) {
        int n = x.length();
        for (int i = 0; i < n; i++) {
            if (x.charAt(i) != x.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

        /* StringBuilder sb = new StringBuilder(x);
        sb.reverse();
        return x.equals(sb.toString());*/
}
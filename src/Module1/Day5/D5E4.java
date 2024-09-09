package Module1.Day5;
//FIZZBUZZ

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D5E4 {
    public static void RunD5E4() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int numSize = sc.nextInt();


        for(int i = 1; i <= numSize; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            }
            else if (i % 3 == 0) {
                System.out.print("Fizz ");
            }
            else if (i % 5 == 0) {
                System.out.print("Buzz ");
            }
            else {
                System.out.print(i + " ");
            }
        }
    }
}
package Day4;

import java.util.Scanner;

public class D4E2 {
    public static void RunD4E2() {
        System.out.println("Day 4, Exercise 2");
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert any number: ");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

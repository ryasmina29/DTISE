package Day4;

import java.util.Scanner;

public class D4E1 {
    public static void RunD4E1() {
        System.out.println("Day 4, Exercise 1");
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert number: ");
        int n = sc.nextInt();
        System.out.println("Multiply Table: ");
        MultiplyTable(n);
    }

    public static void MultiplyTable(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
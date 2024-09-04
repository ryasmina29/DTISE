package Day3;
//Fibonacci

import java.util.Scanner;

public class D3E6 {
    public static void RunD3E6() {
        System.out.println("Day 3, Exercise 6");
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert number: ");
        int n = sc.nextInt();
        System.out.print("Fibonacci number: ");
        Fibonacci(n);
    }

     public static void Fibonacci(int x) {
        int FirstNum = 0, SecondNum = 1;
        for (int i = 0; i < x; i++) {
            System.out.print(FirstNum + " ");
            int ThirdNum = FirstNum + SecondNum;
            FirstNum = SecondNum;
            SecondNum = ThirdNum;
        }
     }
}
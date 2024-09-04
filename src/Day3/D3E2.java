package Day3;
//Determine prime number
import java.util.Scanner;

public class D3E2 {
    public static void RunD3E2() {
        System.out.println("Day 3, Exercise 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = sc.nextInt();
        System.out.println(isPrime(num));
    }

    public static boolean isPrime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
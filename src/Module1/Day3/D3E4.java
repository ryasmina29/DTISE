package Module1.Day3;
//Make a calculator
import java.util.Scanner;

public class D3E4 {
    public static void RunD3E4() {
        System.out.println("Day 3, Exercise 4");
        Scanner sc = new Scanner(System.in);
        System.out.println("a: ");
        int a = sc.nextInt();
        System.out.println("b: ");
        int b = sc.nextInt();
        System.out.println(addNum(a, b));
    }
    public static int addNum(int a, int b) {
        return a + b;
    }
    public static int subsNum ( int a, int b){
        return a - b;
    }
    public static int divNum ( int a, int b){
        return a / b;
    }
    public static int multNum ( int a, int b){
        return a * b;
    }
    }
package Module1.Day5;
//EXCHANGE RATE
import java.util.Scanner;

public class D5E2 {
    public static void RunD5E2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write down the amount: ");
        double amount = sc.nextDouble();
        System.out.print("Enter the source currency (EUR/USD/GBP/JPY): ");
        String sourceCurr = sc.next();
        System.out.print("Enter the target currency (EUR/USD/GBP/JPY): ");
        String targetCurr = sc.next();
        double [] rate = {1.11, 0.84, 158.59}; //EUR to USD, GBP, JPY respectively


        switch (sourceCurr) {
            case "EUR":
                switch (targetCurr) {
                    case "USD":
                        System.out.println("The conversed amount is " + amount * rate[0]);
                        break;
                    case "GBP":
                        System.out.println("The conversed amount is " + amount * rate[1]);
                        break;
                    case "JPY":
                        System.out.println("The conversed amount is " + amount * rate[2]);
                        break;
                }
                break;
            case "USD":
                switch (targetCurr) {
                    case "EUR":
                        System.out.println("The conversed amount is " + amount * (1 / rate[0]));
                        break;
                    case "GBP":
                        System.out.println("The conversed amount is " + amount * (rate[1] / rate[0]));
                        break;
                    case "JPY":
                        System.out.println("The conversed amount is " + amount * (rate[2] / rate[0]));
                        break;
                }
                break;
            case "GBP":
                switch (targetCurr) {
                    case "USD":
                        System.out.println("The conversed amount is " + amount * (rate[0] / rate[1]));
                        break;
                    case "EUR":
                        System.out.println("The conversed amount is " + amount * (1 / rate[1]));
                        break;
                    case "JPY":
                        System.out.println("The conversed amount is " + amount * (rate[2] / rate[1]));
                        break;
                }
                break;
            case "JPY":
                switch (targetCurr) {
                    case "USD":
                        System.out.println("The conversed amount is " + amount * (rate[0] / rate[2]));
                        break;
                    case "GBP":
                        System.out.println("The conversed amount is " + amount * (rate[1] / rate[2]));
                        break;
                    case "EUR":
                        System.out.println("The conversed amount is " + amount * (1 / rate[2]));
                        break;
                }
                break;
        }
    }
}
package Module1.Day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculateAverage {
    private final Scanner sc;

    public CalculateAverage() {
        this.sc = new Scanner(System.in);
        }

    public void run() {
        System.out.println("Calculate the average of the following numbers: ");
        ArrayList<Integer> numArray = getUserNumbers(sc);
        System.out.println("The numbers you input are: " + numArray.toString());
        System.out.println("The average of the following number is: " + averageNum(numArray));
    }

    private ArrayList<Integer> getUserNumbers(Scanner sc) {
        boolean isQuit = false;
        List<Integer> numArray = new ArrayList<Integer>();
        do {
            System.out.println("Enter the number or press q to quit: ");
            String num = sc.nextLine();
            try {
                numArray.add(Integer.parseInt(num));
                }
            catch (NumberFormatException e) {
                if (num.equals("q")) {
                    isQuit = true;
                    }
                else System.out.println("Invalid number");
                }
            }
        while (!isQuit);
        return (ArrayList<Integer>) numArray;
        }

    private int averageNum(ArrayList<Integer> numArray) {
        int totalNum = 0;
        for (int i = 0; i < numArray.size(); i++) {
            totalNum += numArray.get(i);
            }
        return totalNum / numArray.size();
    }
}


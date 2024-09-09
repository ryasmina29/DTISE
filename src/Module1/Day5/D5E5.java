package Module1.Day5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class D5E5 {
    public static void RunD5E5() {
        int nums [] = {6, 2, 10, 4, 8, 1};
        Scanner sc = new Scanner(System.in);

        System.out.println(Arrays.toString(nums));

        System.out.println("Enter the number: ");
        int targetNum = sc.nextInt();

        boolean found = true;

        System.out.println(Arrays.toString(SumNumber(nums, targetNum)));

        }

    public static int[] SumNumber(int [] num, int targetNum) {
        HashMap<Integer, Integer> ArrayNum = new HashMap<Integer, Integer>(); //Create a HashMap object called
            // ArrayNum that will store int keys and values:
        int [] twoNum = new int[2]; //create an integer array consist of 2 data
        for (int i = 0; i < num.length; i++) {
            ArrayNum.put(num[i], i); //to add the ArrayNum the num data and i-th number array
            int remainingNum = targetNum - num[i];
            if (ArrayNum.containsKey(remainingNum)) {
                twoNum[0] = ArrayNum.get(remainingNum); //to access the value in ArrayNum
                twoNum[1] = i;
                return twoNum;
            }
        }
        return twoNum;
    }
}



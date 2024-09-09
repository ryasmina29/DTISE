package Module1.Day5;
//REMOVE ODD NUMBER

import java.util.ArrayList;
import java.util.Arrays;

public class D5E3 {
    public static void RunD5E3() {
        int[] num = {1, 3, 5};
        System.out.println(Arrays.toString(num));
        ArrayList<Integer> evenNum = new ArrayList<Integer>();

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                evenNum.add(num[i]);
            }
        }
        System.out.println("Even numbers: "+evenNum);
    }
}
package Day3;

import java.lang.reflect.Array;
import java.util.Arrays;

//Sort number
public class D3E8 {
    public static void RunD3E8() {
        System.out.println("Day 3, Exercise 8");

        int [] num = {64, 34, 25, 12, 22, 11, 90};

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                int x = 0;
                if (num[i] < num[j]) { //Change here for descend/ascend
                    x = num[i];
                    num[i] = num[j];
                    num[j] = x;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}

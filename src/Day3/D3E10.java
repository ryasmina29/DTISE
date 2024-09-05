package Day3;

import java.lang.reflect.Array;
import java.util.Arrays;

//Second smallest
public class D3E10 {
    public static void RunD3E10() {
        int[] num = {5, 3, 8, 1, 2, 9};


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

        System.out.println(num[1]);
    }
}

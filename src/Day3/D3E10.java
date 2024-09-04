package Day3;

import java.lang.reflect.Array;
import java.util.Arrays;

//Second smallest
public class D3E10 {
    public static void RunD3E10() {
        int[] num = {5, 3, 8, 1, 2, 9};
        Arrays.sort(num);
        int x = Array.getLength(num);

        System.out.println(num[1]);
    }
}

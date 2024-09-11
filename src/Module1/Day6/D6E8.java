package Module1.Day6;

import java.util.ArrayList;
import java.util.Arrays;

public class D6E8 {
    public static void RunD6E7() {
        int [] nums = {4, 3, 2, 7, 8, 2, 3, 1, 1};
        System.out.println("The array of numbers are: " + Arrays.toString(nums));
        ArrayList<Integer> listNum = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums [i] == nums [j]) {
                    listNum.add(nums[i]);
                }
            }
        }
        System.out.println("The duplicated number(s) is/are: " + Arrays.toString(listNum.toArray()));
    }
}

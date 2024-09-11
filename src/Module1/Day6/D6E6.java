package Module1.Day6;
// Remove duplicate
import java.util.ArrayList;
import java.util.Arrays;

public class D6E6 {
    public static void RunD6E5() {
        int[] num = {1, 1, 2, 3, 4, 4, 7};
        System.out.print("Numbers before removing the duplicate: ");
        System.out.println(Arrays.toString(num));

        ArrayList noDuplicate = new ArrayList();
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num [i] !=num[j]) {
                    noDuplicate.add(num[i]);
                }
            }
        }
        System.out.println("Numbers after duplicate: "+ noDuplicate);


    }
}

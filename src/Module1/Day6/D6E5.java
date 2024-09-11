package Module1.Day6;

// Descend/Ascend

import java.util.Arrays;
import java.util.Scanner;

public class D6E5 {
    public static void RunD6E5() {
        int[] num = {5, 3, 8, 1, 2, 9};
        System.out.print("Numbers before sorting: ");
        System.out.println(Arrays.toString(num));
        Scanner sc = new Scanner(System.in);
        System.out.print("Descend/Ascend? (Press 1 for descend, 2 for ascend): ");
        String whatSort = sc.nextLine();

        switch (whatSort) {
            case "1":
                sortDescend(num);
                break;
            case "2":
                sortAscend(num);
                break;
        }
    }

    public static void sortDescend(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                int n = 0;
                if (num[i] < num[j]) {
                    n = num[i];
                    num[i] = num[j];
                    num[j] = n;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }

    public static void sortAscend(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 1+i; j < num.length; j++) {
                int n = 0;
                if (num[i] > num[j]) {
                    n = num[i];
                    num[i] = num[j];
                    num[j] = n;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}

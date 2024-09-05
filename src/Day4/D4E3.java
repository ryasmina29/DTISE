package Day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D4E3 {
    public static void RunD4E3() {
        System.out.println("Exercise 3");
        List<Integer> list = new ArrayList<Integer>();

        boolean x = true;
        while (x) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number: ");
            int num = sc.nextInt();
            list.add(num);

            System.out.println("y/n to continue: ");
            x = sc.next().charAt(0) == 'y';
        }
        System.out.println("Numbers: " + list.toString());
    }
}

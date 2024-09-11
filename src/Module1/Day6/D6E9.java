package Module1.Day6;

import java.util.Stack;

public class D6E9 {
    public static void RunD6E8() {
        int [] temp = {73, 74, 75, 71, 69, 72, 76, 73};

        int [] days = new int[temp.length];

        for (int i = 0; i < temp.length; i++) {
            days[i] = -1;
            }
        Stack<Integer> prevDay = new Stack<>();
        for (int i = 0; i < temp.length; i++) {
            while (!prevDay.isEmpty() && temp[prevDay.peek()] < temp[i]) {
                days[prevDay.peek()] = i - prevDay.peek();
                prevDay.pop();
                    }
            prevDay.push(i);
            }
        for (int i = 0; i < temp.length; i++) {
            if (days[i] < 0) {
                System.out.print("");
            }
            System.out.print(days[i] + " ");
        }
    }
}

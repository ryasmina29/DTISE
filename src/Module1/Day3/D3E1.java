package Module1.Day3;
//Sum a bunch of numbers
public class D3E1 {
    public static void RunD3E1() {
        System.out.println("Day 3, Exercise 1");
        int [] num = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i : num) {
            sum += num[i];
        }
        System.out.println("The total of the numbers is: " + sum);
    }
}

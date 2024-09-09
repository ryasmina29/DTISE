package Module1.Day3;
//Find the largest number
public class D3E3 {
    public static void RunD3E3() {
        System.out.println("Day 3, Exercise 3");
        System.out.println("The highest number is: " + checkhighest());
    }
    public static int checkhighest() {
        int[] num = {3, 7, 89, 95, 1};
        int highest = num[0];

        for (int x : num) {
            if (x > highest) {
                highest = x;
            }
        }
        return highest;
    }
}
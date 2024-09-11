package Module1.Day6;

public class D6E1 {
    public static void RunD6E1() {
        System.out.println(findLargest());

    }
    public static int findLargest() {
        int[] nums = {7, 2, 5, 1, 4};
        int highest = nums[0];

        for (int x : nums) {
            if (x > highest) {
                highest = x;
            }
        }
        return highest;
    }
}

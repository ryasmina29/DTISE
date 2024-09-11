package Module1.Day6;

public class D6E3 {
    public static void RunD6E3() {
    int [] nums = {1, 2, 1, 5, 3, 7, 4, 3, 6};

    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] == nums[j]) {
                System.out.print(nums[i] + " ");
                }
            else System.out.print(nums[j] + " ");
            }
        }
    }
}

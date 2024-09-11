package Module1.Day6;

public class D6E2 {
    public static void RunD6E2() {
        int [] nums = {1, 2, 3, 4, 5};

        System.out.println(checkDuplicate(nums));
    }

    public static boolean checkDuplicate(int [] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

package leetcode.hashMap;

import java.util.Arrays;

public class MakeArrayZeroBySubtractingEqualAmounts {
    public static int minimumOperations(int[] nums) {

        Arrays.sort(nums);
        int prev = -1;
        int counter = 1;
        int sum = nums[0];
        if (nums.length == 1 && sum == 0) return 0;
        //10 20 21

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != prev) {
                prev = nums[i];
                sum += nums[i] - sum;
                counter++;
                if (sum == nums[nums.length - 1]) return counter;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[]{1, 2, 3}));
    }
}

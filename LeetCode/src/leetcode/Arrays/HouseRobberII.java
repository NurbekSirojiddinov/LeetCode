package leetcode.Arrays;

public class HouseRobberII {
    public int rob(int[] nums) {
        int sum1 = nums[0];
        int sum2 = nums[nums.length-1];
        int prev = 0;

        for (int i = 1; i < nums.length - 1; i++) {
            int next = Math.max(sum1, prev + nums[i]);
            prev = sum1;
            sum1 = next;
        }
        prev = 0;

        for (int i = nums.length - 1; i > 0; i--) {
            int next = Math.max(sum2, prev + nums[i]);
            prev = sum2;
            sum2 = next;
        }
        return Math.max(sum1, sum2);
    }
}

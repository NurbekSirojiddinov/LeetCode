package leetcode.contest.weekly_334;

import java.util.Arrays;

public class LeftAndRightSumDifferences {
    public static int[] leftRigthDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] ans = new int[nums.length];
        int i = 1;
        int j = nums.length - 2;

        while (i < nums.length + 1 && j > -1) {
            leftSum[i] = nums[i - 1] + leftSum[i - 1];
            rightSum[j] = nums[j + 1] + rightSum[j + 1];
            i++;
            j--;
        }

        for (int k = 0; k < leftSum.length; k++) {
            ans[k] = Math.abs(leftSum[k] - rightSum[k]);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftRigthDifference(new int[]{10, 4, 8, 3})));
    }
}

package leetcode.dynamic_programming;

public class MaximumSumCircularSubarray {
    public static int maxSubarraySumCircular(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        int currentMinSum = currentSum;
        int minSum = maxSum;
        int totalSum = maxSum;

        for (int i = 1; i < nums.length; i++) {
            totalSum += nums[i];
            currentSum = Math.max(currentSum, currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);

            currentMinSum = Math.min(currentMinSum, currentMinSum + nums[i]);
            minSum = Math.min(minSum, currentMinSum);
        }
        if (totalSum == minSum) return maxSum;
        return Math.max(maxSum, totalSum - minSum);
    }

    public static void main(String[] args) {
        System.out.println(maxSubarraySumCircular(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}

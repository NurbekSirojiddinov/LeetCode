package leetcode.arrays;

import java.util.Arrays;

public class MaximumXORForEachQuery {
    public static int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] queries = new int[nums.length];
        int j = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                nums[i] = nums[i] ^ nums[i - 1];
            }
            queries[j] = max(nums[i], maximumBit);
            j--;
        }
        return queries;

    }

    public static int max(int num, int maxBit) {
        int max = 0;
        int res = 0;
        int k = (int) Math.pow(2, maxBit);
        for (int i = 0; i < k; i++) {
            int cur = num ^ i;
            if (cur > max) {
                max = cur;
                res = i;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getMaximumXor(new int[]{2,3,4,7}, 3)));
    }
}

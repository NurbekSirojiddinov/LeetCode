package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;


public class MaximumSumOfDistinctSubarraysWithLengthK {
    public static void main(String[] args) {

    }

    private static long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int counter = 0;
        long sum = 0;
        long result = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i] + 1));
            }
            if (map.size() == k) {
                result = Math.max(result, sum);
                sum = 0;
            }
        }
        return 1;
    }
}

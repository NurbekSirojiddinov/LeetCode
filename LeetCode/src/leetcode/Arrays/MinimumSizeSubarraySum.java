package leetcode.Arrays;

public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int min = nums.length+1;
        for(int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            if(sum >= target) {
                return 1;
            }
            for(int j = i+1; j < nums.length; j++) {
                sum+=nums[j];
                if(sum >= target) {
                    min = Math.min(j-i+1, min);
                }
            }
        } if(min >= nums.length) return 0;
        return min;
    }

    public static void main(String[] args) {
        int target = 15;
        int[] nums = {1,2,3,4,5};
        System.out.println(minSubArrayLen(target, nums));
    }
}

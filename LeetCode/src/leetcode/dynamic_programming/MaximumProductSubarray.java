package leetcode.dynamic_programming;

public class MaximumProductSubarray {
    private static int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], answer = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);

            answer = Math.max(answer, max);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[] {1}));
    }
}

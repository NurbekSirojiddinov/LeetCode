package leetcode.daily;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int[] ans = new int[nums.length];
        int i = 0;

        while (left < nums.length && nums[left] < 0) {
            nums[left] = nums[left] * nums[left];
            left++;
        }
        int right = left--;

        while (i < nums.length) {
            if (right < nums.length && (left < 0 || (nums[left] > nums[right] * nums[right]))) {
                ans[i] = nums[right] * nums[right];
                right++;
            } else {
                ans[i] = nums[left--];
            }
            i++;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SquaresOfASortedArray().sortedSquares(new int[]{-1, -2, -3, 0, 3, 6, 8})));
    }
}

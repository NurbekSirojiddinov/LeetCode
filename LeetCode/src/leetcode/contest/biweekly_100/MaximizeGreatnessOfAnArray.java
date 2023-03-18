package leetcode.contest.biweekly_100;

import java.util.Arrays;

public class MaximizeGreatnessOfAnArray {
    public static int maximizeGreatness(int[] nums) {
        int left = 0;
        int right = 1;
        int counter = 0;

        Arrays.sort(nums);

        while (right < nums.length) {
            if (nums[left] != nums[right]) {
                counter++;
                left++;
            }
            right++;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(maximizeGreatness(new int[]{1, 2, 3}));
    }
}

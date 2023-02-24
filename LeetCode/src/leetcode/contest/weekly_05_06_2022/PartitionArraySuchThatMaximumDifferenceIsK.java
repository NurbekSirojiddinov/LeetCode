package leetcode.contest.weekly_05_06_2022;

import java.util.Arrays;

public class PartitionArraySuchThatMaximumDifferenceIsK {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 1;

        System.out.println(partitionArray(nums, k));
    }

    private static int partitionArray(int[] nums, int k) {
        if (nums.length == 1) return 1;

        Arrays.sort(nums);
        int i = nums.length - 1;
        int num = nums[i];
        i--;
        int counter = 0;

        while (i >= 0) {
            if (num - nums[i] > k) {
                counter++;
                num = nums[i];
            } else
                i--;
        }
        if (num - nums[0] <= k) counter++;
        return counter;
    }
}

package leetcode.sorting;

import java.util.Arrays;

public class RangeSumOfSortedSubarraySums {
    public static int rangeSum(int[] nums, int n, int left, int right) {
        int[] subSums = new int[((1 + n) * n) / 2];
        int index = 0;
        int result = 0;

        for (int i = 0; i < n; i++) {
            subSums[index] = nums[i];
            index++;
            for (int j = i + 1; j < n; j++) {
                subSums[index] = subSums[index - 1] + nums[j];
                index++;
            }
        }
        Arrays.sort(subSums);
        for (int i = left - 1; i < right; i++) {
            result = (result + subSums[i]) % (int) (1e9 + 7);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(rangeSum(new int[]{1, 2, 3, 4, 5}, 5, 3, 6));
    }
}

package leetcode.arrays;

import java.util.Arrays;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        int l = 0;
        int r = 1;

        while ( r < nums.length && l < nums.length) {
            if (nums[l] % 2 == 0 || nums[r] % 2 == 1) {
                if (nums[l] % 2 == 0) {
                    l++;
                }
                if (nums[r] % 2 == 1) {
                    r++;
                }
                continue;
            }
            if (l < r) {
                int cur = nums[l];
                nums[l] = nums[r];
                nums[r] = cur;
            } else {
                r++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{0, 2})));
    }
}

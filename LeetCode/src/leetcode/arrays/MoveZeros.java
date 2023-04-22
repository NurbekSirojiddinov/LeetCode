package leetcode.arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int l = 0;
        int r = 0;

        while (r < nums.length) {
            if (nums[l] != 0) {
                l++;
                if (r < l) r++;
                continue;
            }
            if (l < r && nums[r] != 0) {
                nums[l] = nums[r];
                nums[r] = 0;
                l++;
            }
            r++;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0, 2, 3};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));

    }
}

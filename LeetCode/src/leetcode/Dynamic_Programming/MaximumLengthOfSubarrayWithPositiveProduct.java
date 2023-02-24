package leetcode.Dynamic_Programming;

public class MaximumLengthOfSubarrayWithPositiveProduct {
    private static int getMaxLen(int[] nums) {
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int j = i;
                int num = 1;
                int firstMinus = -1;
                int lastMinus = 0;

                while (i < nums.length && nums[i] != 0) {
                    if (nums[i] < 0 && firstMinus == -1) {
                        firstMinus = i;
                    }
                    if (nums[i] < 0) {
                        lastMinus = i;
                        num *= -1;
                    }
                    i++;
                }
                if (i == nums.length) i = nums.length - 1;
                if (nums[i] == 0) i--;
                if (num == 1) {
                    maxLength = Math.max(maxLength, i - j + 1);
                }
                if (firstMinus - j > i - lastMinus) {
                    maxLength = Math.max(maxLength, lastMinus - j);
                } else {
                    maxLength = Math.max(maxLength, i - firstMinus);
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(getMaxLen(new int[]{-17, -9, 17, -3, -5, -13, 2, 6, 0}));
    }
}

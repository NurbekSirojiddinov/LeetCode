package leetcode.contest.weekly_352;

public class A {
    public static int longestAlternatingSubarray(int[] nums, int threshold) {
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            int r = 1;
            for (int j = i; j < nums.length - 1; j++) {
                if (nums[j] <= threshold && (nums[j] % 2) != (nums[j + 1] % 2) && nums[j + 1] <= threshold) {
                    r = j + 1;
                } else {
                    break;
                }
            }
            if (nums[i] % 2 == 0) res = Math.max(res, (r - i + 1));
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(longestAlternatingSubarray(new int[]{1,2}, 2));
    }
}

package leetcode.contest.weekly_341;

public class FindTheMaximumDivisibilityScore {
    public static int maxDivScore(int[] nums, int[] divisors) {
        int maxDivScore = 0;
        int num = 0;

        for (int i = 0; i < divisors.length; i++) {
            int count = 0;
            if (num != nums[i]) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] % divisors[j] == 0) {
                        count++;
                    }
                }
            }
            if (maxDivScore < count) {
                maxDivScore = count;
                num = divisors[i];
            } else if (maxDivScore == count) {
                num = Math.min(num, divisors[i]);
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(maxDivScore(new int[]{5, 4, 6}, new int[]{1, 2, 3}));
    }
}

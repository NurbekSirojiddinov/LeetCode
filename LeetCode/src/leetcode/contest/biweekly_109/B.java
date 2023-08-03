package leetcode.contest.biweekly_109;

public class B {

    public static long maxScore(int[] nums, int x) {
        long cur = 0;
        long ans = nums[0];
        int num1 = nums[0];
        int num2 = 0;
        int i = 1;

        while (i < nums.length) {
            int r = nums[i] % 2;
            if ((cur != 0 && ((r == 1 && num2 % 2 == 1) || (r == 0 && num2 % 2 == 0))) || (r == 1 && num1 % 2 == 0) || (r == 0 && num1 % 2 == 1)) {
                cur += nums[i];
                num2 = nums[i];
            } else {
                if (ans + cur - x > ans + nums[i]) {
                    if(ans + cur - (2L * x) + nums[i] > ans + cur - x) {
                        num1 = nums[i];
                        ans += cur - (2L * x) + nums[i];
                    } else {
                        ans += cur - x;
                        num1 = num2;
                    }
                } else if(ans + cur - (2L * x) + nums[i] > ans + nums[i]) {
                    num1 = nums[i];
                    ans += cur - (2L * x) + nums[i];
                }
                else {
                    ans += nums[i];
                    num1 = nums[i];
                }
                cur = 0;
            }
            i++;
        }
        if (cur != 0 && cur - x > 0) {
            ans += (cur - x);
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maxScore(new int[]{2,3,6,1,9,2}, 5));
    }
}

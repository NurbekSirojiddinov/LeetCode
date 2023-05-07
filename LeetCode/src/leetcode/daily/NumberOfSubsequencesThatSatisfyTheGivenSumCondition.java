package leetcode.daily;

import java.util.Arrays;

public class NumberOfSubsequencesThatSatisfyTheGivenSumCondition {
    public static int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        /*
         * 2 3 3 4 5
         *2 3 3 4
         *2 3 3 5 -> (n-1)
         *2 3 4 5
         *2 3 4 5
         * 2 3 3
         * 2 3 4 -> (n-2)
         * 2 3 4
         * 2 3
         * 2 3
         * 2 4
         * 2 5
         * 2 n + (n-1)+(n-2)
         * (n-3)*n + (n-3+1)*(n-3)/2  + (n+2)
         * n*(n-2) + (n-1)(n-2)/2 + n + 2;
         * n(n-2) - (n-1)(n-2)/2 + n + 2
         * 4
         * 8+3+6 = 17
         * */
// (r-l)+
        int l = 0;
        int r = 0;
        long sum = 0;
        long MOD = 1000000007;

        while (nums[l] + nums[r] <= target) {
            if (r + 1 == nums.length || nums[l] + nums[r + 1] > target) {
                sum += Math.pow(2, r - l);
                if (sum >= MOD) {
                    sum -= MOD;
                }
                l++;
                if (l >= nums.length) break;
                if (r + 1 == nums.length && nums[l] + nums[r] > target) {
                    if (2 * nums[l] <= target) {
                        sum++;
                    }
                    break;
                }
                continue;
            }
            r++;
        }
        return (int) sum;
    }

    public static void main(String[] args) {
        System.out.println(numSubseq(new int[]{5,2,4,1,7,6,8}, 16));
    }
}

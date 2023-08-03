package leetcode.contest.weekly_353;

import java.util.HashMap;
import java.util.Map;

class Solution {
    int res = -1;
    Map<Integer, Integer> mp = new HashMap<>();

    public int maximumJumps(int[] nums, int target) {
        return dp(0, nums, target, nums[0], 0);
    }

    public int dp(int i, int[] nums, int target, int num, int p) {
        if (i == nums.length - 1) {
            res = Math.max(res, p);
            return p;
        }
        if (mp.containsKey(i)) {
            res = Math.max(res, mp.get(i));
            return mp.get(i);
        }

        for (int j = i + 1; j < nums.length; j++) {
            int sum = nums[j] - num;
            if (sum >= -1 * target && sum <= target) {
                mp.put(i, dp(j, nums, target, nums[j], p + 1));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maximumJumps(new int[]{-533985778, -424626669, 794071124, 694501105, -651162637, -789411200, 773124493, -655591953, 205086705, -421668572}, 1194793065));
    }
}

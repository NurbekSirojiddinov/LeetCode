package leetcode.contest.weekly_344;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class B {
    public static int[] distinctDifferenceArray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                set.add(nums[j]);
            }
                set2.add(nums[i]);
            ans[i] = set2.size() - set.size();
            set = new HashSet<>();
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(distinctDifferenceArray(new int[]{})));
    }
}

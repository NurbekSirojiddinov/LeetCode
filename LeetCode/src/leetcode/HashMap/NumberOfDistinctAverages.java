package leetcode.HashMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberOfDistinctAverages {
    public static int distinctAverages(int[] nums) {
        Arrays.sort(nums);

        Set<Double> set = new HashSet<>();
        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            set.add((nums[left] + nums[right--]) / 2.);
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(distinctAverages(new int[] {9,5,7,8,7,9,8,2,0,7}));
    }
}

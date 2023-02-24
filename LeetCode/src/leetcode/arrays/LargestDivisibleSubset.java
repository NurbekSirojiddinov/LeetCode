package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {
    public static List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int divider = nums[i];
            List<Integer> list1 = new ArrayList<>();
            list1.add(divider);
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] % divider == 0) {
                    list1.add(nums[j]);
                    divider = nums[j];
                }
            }
            if (list1.size() > list.size()) {
                list = list1;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {5, 9, 18, 54, 108, 540, 90, 180, 360, 720};
        System.out.println(largestDivisibleSubset(nums));
    }
}

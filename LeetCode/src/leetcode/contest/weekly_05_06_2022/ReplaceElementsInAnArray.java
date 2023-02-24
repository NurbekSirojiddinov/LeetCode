package leetcode.contest.weekly_05_06_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceElementsInAnArray {
    public static void main(String[] args) {

        int[] nums = {1, 2, 4, 6};
        int[][] operations = {{1, 3}, {4, 7}, {6, 1}};
        System.out.println(Arrays.toString(arrayChange(nums, operations)));
    }

    private static int[] arrayChange(int[] nums, int[][] operations) {
        int n = 0;
        List<Integer> map = new ArrayList<>();

        for (int num : nums) {
            map.add(num);
        }
        for (int[] operation : operations) {
            if (map.contains(operation[0])) {
                map.add(map.indexOf(operation[0]), operation[1]);
                map.remove((Integer) operation[0]);
            }
        }
        for (int num : map) {
            nums[n] = num;
            n++;
        }
        return nums;
    }
}

package leetcode.contest.weekly_05_06_2022;

import java.util.ArrayList;
import java.util.List;

public class MinMaxGame {
    public static void main(String[] args) {

        int[] nums = {1,3,5,2,4,8,2,2};
        System.out.println(minMaxGame(nums));
    }

    private static int minMaxGame(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        if (nums.length == 1) return nums[0];

        for (int i = 1; i < nums.length; i+=2) {
            if (list.size() % 2 == 0) {
                list.add(Math.min(nums[i], nums[i - 1]));
            } else {
                list.add(Math.max(nums[i], nums[i - 1]));
            }
        }

        while (list.size() != 1) {
            for (int i = 1; i < list.size(); i+=2) {
                if (list1.size() % 2 == 0) {
                    list1.add(Math.min(list.get(i), list.get(i-1)));
                } else {
                    list1.add(Math.max(list.get(i), list.get(i-1)));
                }
            }
            list = new ArrayList<>(list1);
            list1.clear();
        }
        return list.get(0);
    }
}

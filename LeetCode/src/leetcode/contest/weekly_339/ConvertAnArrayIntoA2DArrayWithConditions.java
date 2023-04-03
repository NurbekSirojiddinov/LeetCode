package leetcode.contest.weekly_339;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertAnArrayIntoA2DArrayWithConditions {
    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Set<Integer> set;

        while (true) {
            set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0 && !set.contains(nums[i])) {
                    set.add(nums[i]);
                    nums[i] = 0;
                }
            }
            if (set.size() == 0) {
                break;
            }
            lists.add((set.stream().toList()));
        }
        return lists;
    }

    public static void main(String[] args) {
        System.out.println(findMatrix(new int[]{1,3,4,1,2,3,1}));
    }
}

package leetcode.hash_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonDecreasingSubsequences {
    public static List<List<Integer>> findSubsequences(int[] nums) {

        Map<String, List<Integer>> map = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        stringBuilder.append(nums[0]);
        int begin = 0;
        int index = 1;
        int i = 1;

        while (begin < nums.length - 1) {
            list.add(nums[i]);
            stringBuilder.append(nums[i]);
            map.put(stringBuilder.toString(), list);
            list = new ArrayList<>(list);
            i++;
            if (i == nums.length) {
                index++;
                i = index;
                list = new ArrayList<>();
                stringBuilder = new StringBuilder();
                stringBuilder.append(nums[begin]);
                list.add(nums[begin]);
            } if (i == nums.length) {
                begin++;
                if (begin == nums.length - 1) break;
                index = begin + 1;
                i = index;
                list = new ArrayList<>();
                stringBuilder = new StringBuilder();
                stringBuilder.append(nums[begin]);
                list.add(nums[begin]);
            }
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        System.out.println(findSubsequences(new int[]{4,6,7,8}));
    }
}

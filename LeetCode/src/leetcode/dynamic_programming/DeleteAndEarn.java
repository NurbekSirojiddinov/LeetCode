package leetcode.dynamic_programming;

import java.util.*;

public class DeleteAndEarn {
    private static int deleteAndEarn(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 0);
            }
            map.put(num, map.get(num) + 1);
        }
        if (map.size() == 1) {
            return map.get(nums[0]) * nums[0];
        }
        int[] arr = new int[map.size()];
        int i = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            arr[i] = entry.getKey();
            i++;
        }
        Arrays.sort(arr);
        int[] result = new int[arr.length];
        result[0] = arr[0];
        result[1] = arr[1];

        for (int j = 2; j < arr.length; j++) {
            result[j] = Math.max(arr[j-1] * map.get(arr[j-1]), arr[j-2] * map.get(arr[j-2]) + arr[j] * map.get(arr[j]));
        }
        return result[result.length-1];
    }

    public static void main(String[] args) {
        System.out.println(deleteAndEarn(new int[]{1, 1, 1, 2, 4, 5, 5, 5, 6}));//1 2 4 5 6
    }                                                                          //3 2 1 3
}

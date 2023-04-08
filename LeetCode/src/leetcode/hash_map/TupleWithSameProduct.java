package leetcode.hash_map;

import java.util.HashMap;
import java.util.Map;

public class TupleWithSameProduct {
    public static int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int tuples = 0;

        for (int i = 0; i < nums.length; i++) {
            int num;
            for (int j = i + 1; j < nums.length; j++) {
                num = nums[i] * nums[j];
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        for (int num : map.values()) {
            tuples += ((num * (num - 1)) / 2) * 8;
        }
        return tuples;
    }

    public static void main(String[] args) {
        System.out.println(tupleSameProduct(new int[]{2, 3, 4, 6, 8, 12}));
    }
}

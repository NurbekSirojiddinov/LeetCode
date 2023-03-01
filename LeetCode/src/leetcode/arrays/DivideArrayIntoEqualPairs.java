package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class DivideArrayIntoEqualPairs {
    private static boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() % 2 == 1) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(divideArray(new int[] {3,2,3,2,2,2}));
    }
}

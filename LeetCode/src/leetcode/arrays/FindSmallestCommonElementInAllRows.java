package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindSmallestCommonElementInAllRows {
    public static int smallestCommonElement(int[][] mat) {
        Map<Integer, Integer> mp = new HashMap<>();
        int minCommon = 100000;

        for (int[] ints : mat) {
            for (int j = 0; j < mat[0].length; j++) {
                mp.put(ints[j], mp.getOrDefault(ints[j], 0) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() == mat.length) {
                minCommon = Math.min(minCommon, entry.getKey());
            }
        }
        return minCommon == 100000 ? -1 : minCommon;
    }

    public static void main(String[] args) {
        System.out.println(smallestCommonElement(new int[][]{{1, 2, 3, 4, 5}, {2, 4, 5, 8, 10}, {3, 5, 7, 9, 11}, {3, 5, 7, 9, 11}, {1, 3, 5, 7, 9}}));
    }
}

package leetcode.contest.weekly_333;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MergeTwo2DArraysBySummingValues {
    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int[] ints : nums1) {
            map.put(ints[0], map.getOrDefault(ints[0], 0) + ints[1]);
        }
        for (int[] ints : nums2) {
            map.put(ints[0], map.getOrDefault(ints[0], 0) + ints[1]);
        }

        int[][] result = new int[map.size()][2];
        int i = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result[i][0] = entry.getKey();
            result[i][1] = entry.getValue();
            i++;
        }

        Arrays.sort(result, Comparator.comparingDouble(a -> a[0]));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(mergeArrays(new int[][]{}, new int[][]{})));
    }
}

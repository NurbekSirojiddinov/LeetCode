package leetcode.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MergeSimilarItems {
    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> treeMap = new TreeMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        int max = Math.max(items1.length, items2.length);

        for (int i = 0; i < max; i++) {
            if (i < items1.length) {
                treeMap.put(items1[i][0], treeMap.getOrDefault(items1[i][0], 0) + items1[i][1]);
            }
            if (i < items2.length) {
                treeMap.put(items2[i][0], treeMap.getOrDefault(items2[i][0], 0) + items2[i][1]);
            }
        }

        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            List<Integer> list = new ArrayList<>(List.of(entry.getKey(), entry.getValue()));
            ans.add(list);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(mergeSimilarItems(new int[][]{{1, 3}, {2, 2}}, new int[][]{{7, 1}, {2, 2}, {1, 4}}));
    }
}

package leetcode.HashMap;

import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs {
    public static int equalPairs(int[][] grid) {
        int counter = 0;
        StringBuilder row;
        StringBuilder column;
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {
            row = new StringBuilder();
            column = new StringBuilder();
            for (int j = 0; j < grid.length; j++) {
                row.append(grid[i][j]).append(",");
                column.append(grid[j][i]).append(",");
            }
            map.put(row.toString(), map.getOrDefault(row.toString(), 0) + 1);
            map2.put(column.toString(), map2.getOrDefault(column.toString(), 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (map2.containsKey(entry.getKey())) {
                counter += entry.getValue() * map2.get(entry.getKey());
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(equalPairs(new int[][]{{11,1}, {1,11}}));
    }
}

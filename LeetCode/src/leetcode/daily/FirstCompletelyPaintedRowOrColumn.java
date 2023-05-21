package leetcode.daily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstCompletelyPaintedRowOrColumn {
    public static int firstCompleteIndex(int[] arr, int[][] mat) {
        Map<Integer, List<Integer>> map1 = new HashMap<>();
        Map<Integer, Integer> col = new HashMap<>();
        Map<Integer, Integer> row = new HashMap<>();
        int c = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                map1.put(mat[i][j], List.of(i, j));
            }
            row.put(i, mat[0].length);
            if (c < mat[0].length) {
                col.put(c, mat.length);
            }
            c++;
        }

        while (c < mat[0].length) {
            col.put(c, mat.length);
            c++;
        }

        for (int i = 0; i < arr.length; i++) {
            int ro = map1.get(arr[i]).get(0);
            int co = map1.get(arr[i]).get(1);
            int val1 = col.get(co) - 1;
            int val2 = row.get(ro) - 1;
            col.put(co, val1);
            row.put(ro, val2);

            if (val1 == 0 || val2 == 0) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(firstCompleteIndex(new int[]{8, 2, 4, 9, 3, 5, 7, 10, 1, 6}, new int[][]{{8, 2, 9, 10, 4}, {1, 7, 6, 3, 5}}));
    }
}

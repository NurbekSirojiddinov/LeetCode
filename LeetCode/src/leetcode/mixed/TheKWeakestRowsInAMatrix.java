package leetcode.mixed;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class TheKWeakestRowsInAMatrix {
    public static void main(String[] args) {
        int k = 3;
        int[][] mat = {{1, 1, 1,1,1},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}};
        System.out.println(Arrays.toString(kWeakestRows(mat, k)));
    }

    private static int[] kWeakestRows(int[][] mat, int k) {
            int[] result = new int[k];
            int[][] result1 = new int[mat.length][2];

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    if (mat[i][j] == 0) {
                        result1[i][0] = i;
                        result1[i][1] = j;
                        break;
                    }if (j == mat[0].length - 1) {
                        result1[i][0] = i;
                        result1[i][1] = j +1;
                    }
                }
            }
            java.util.Arrays.sort(result1, (a, b) -> Double.compare(a[1], b[1]));
    /**/
            for (int i = 0; i < k; i++) {
                result[i] = result1[i][0];
            }
            return result;
    }
}

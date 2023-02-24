package leetcode.Dynamic_Programming;

import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

public class UniquePath {
    public static void main(String[] args) {
    }

    private static int uniquePaths(int m, int n) {
        int[][] array = new int[m - 1][n];
        if (m == 1) return 1;
        int temp = 1;
        int sum = 1;
        for (int i = 1; i < n; i++) {
            array[0][i] = temp;
            for (int j = 1; j < m - 1; j++) {
                array[j][i] = array[j - 1][i] - array[j - 1][i - 1];
                temp += array[j][i];
            }
            sum += temp;
        }
        return sum;
    }
}

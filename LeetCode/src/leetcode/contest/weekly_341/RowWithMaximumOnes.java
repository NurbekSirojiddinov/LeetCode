package leetcode.contest.weekly_341;

import java.util.Arrays;

public class RowWithMaximumOnes {
    public static int[] rowAndMaximumOnes(int[][] mat) {
        int row = 0;
        int one = 0;

        for (int i = 0; i < mat.length; i++) {
            int ones = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    ones++;
                }
            }
            if (ones > one) {
                row = i;
                one = ones;
            }
        }
        return new int[]{row, one};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rowAndMaximumOnes(new int[][]{{0, 1, 0, 1}, {0, 1, 0, 0}})));
    }
}

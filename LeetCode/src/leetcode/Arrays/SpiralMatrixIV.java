package leetcode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrixIV {
    public static int[][] spiralMatrix(int m, int n, List<Integer> head) {
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = -1;
            }
        }
        int row = 0;
        int col = 0;
        int lastRow = 0;
        int lastCol = n;
        int i = 0;
        boolean increaseCol = true;
        boolean rowInc = false;

        while (i < head.size()) {
            matrix[row][col] = head.get(i);
            if (increaseCol && col == lastCol - 1) {
                row++;
            } else {
                if (increaseCol && !rowInc)
                    col++;
                else
                    col--;
            }
            if (row == m) {
                lastCol--;
                row--;
                col--;
                increaseCol = false;
                rowInc = true;
            }

            if (col < 0 && row > lastRow) {
                while (row - 1 != lastRow) {
                    row--;
                    if (row - 1 == lastRow) {
                        lastRow++;
                        row = lastRow;
                        rowInc = false;
                        break;
                    }
                }
                increaseCol = true;
                col = 0;
            }
            i++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(3, 0, 2, 6, 8, 1, 7, 9, 4, 2, 5, 5, 0, 1, 2, 3, 4, 5, 6, 7));
        System.out.println(Arrays.deepToString(spiralMatrix(4, 5, list)));
    }
}

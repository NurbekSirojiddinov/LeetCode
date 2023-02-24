package leetcode.Arrays;

public class ScoreAfterFlippingMatrix {
    public static int matrixScore(int[][] grid) {

        int sum = 0;

        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == 0) { // in order to achieve max sum, all values of first column should be 1.
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 0) {
                        grid[i][j] = 1;
                    } else {
                        grid[i][j] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < grid[0].length; i++) {
            int ones = 0;
            for (int[] ints : grid) {
                if (ints[i] == 1) {
                    ones++;
                }
            }
            if (ones < grid.length - ones) {
                for (int k = 0; k < grid.length; k++) {
                    if (grid[k][i] == 1) {
                        grid[k][i] = 0;
                    } else {
                        grid[k][i] = 1;
                    }
                }
            }
        }
        for (int[] ints : grid) {
            StringBuilder binaryStr = new StringBuilder();
            for (int j = 0; j < grid[0].length; j++) {
                binaryStr.append(ints[j]);
            }
            sum += Integer.parseInt(binaryStr.toString(), 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(matrixScore(new int[][]{{0, 0, 1, 1}, {1, 0, 1, 0}, {1, 1, 0, 0}}));
    }
}

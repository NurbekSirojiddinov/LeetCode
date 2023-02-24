package leetcode.Arrays;


import java.util.LinkedList;

public class MaximumSumOfAnHourglass {
    public static int maxSum(int[][] grid) {
        int maxHourglass = 0;
        LinkedList<Integer> list = new LinkedList<>();

        int i = 0;
        int j = 0;

        while (true) {
            if (i + 2 < grid.length && j + 2 < grid[0].length) {
                maxHourglass = Math.max(maxHourglass, (grid[i][j] + grid[i][j + 1] + grid[i][j+2] + grid[i + 1][j + 1] + grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2]));
            }
            if (j + 2 >= grid[0].length) {
                j = 0;
                if (i + 2 >= grid.length) {
                    return maxHourglass;
                }

                i++;
            } else {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(maxSum(new int[][]{
                {520626,685427,788912,800638,717251,683428},
                {23602,608915,697585,957500,154778,209236},
                {287585,588801,818234,73530,939116,252369}}));
    }
}

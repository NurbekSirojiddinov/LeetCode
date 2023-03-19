package leetcode.contest.weekly_337;

public class KnightTourConfiguration {
    public static boolean checkValidGrid(int[][] grid) {
        int moves = 1;
        int n = grid.length;
        int i = 0;
        int j = 0;

        while (moves < n * n) {
            if (j + 2 < n && i + 1 < n && grid[i + 1][j + 2] == moves) {
                j = j + 2;
                i = i + 1;
                moves++;
            } else if (j + 2 < n && i - 1 >= 0 && grid[i - 1][j + 2] == moves) {
                j = j + 2;
                i = i - 1;
                moves++;
            } else if (j - 2 >= 0 && i + 1 < n && grid[i + 1][j - 2] == moves) {
                j = j - 2;
                i = i + 1;
                moves++;
            } else if (j - 2 >= 0 && i - 1 >= 0 && grid[i - 1][j - 2] == moves) {
                j = j - 2;
                i = i - 1;
                moves++;
            } else if (i + 2 < n && j + 1 < n && grid[i + 2][j + 1] == moves) {
                i = i + 2;
                j = j + 1;
                moves++;
            } else if (i + 2 < n && j - 1 >= 0 && grid[i + 2][j - 1] == moves) {
                i = i + 2;
                j = j - 1;
                moves++;
            } else if (i - 2 >= 0 && j - 1 >= 0 && grid[i - 2][j - 1] == moves) {
                i = i - 2;
                j = j - 1;
                moves++;
            } else if (i - 2 >= 0 && j + 1 < n && grid[i - 2][j + 1] == moves) {
                i = i - 2;
                j = j + 1;
                moves++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkValidGrid(new int[][]{{0, 11, 16, 5, 20}, {17, 4, 19, 10, 15}, {12, 1, 8, 21, 6}, {3, 18, 23, 14, 9}, {24, 13, 2, 7, 22}}));
    }
}

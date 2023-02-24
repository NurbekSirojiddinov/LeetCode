package leetcode.mixed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shift2DGrid {
    public static void main(String[] args) {
        int k = 1;
        int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(shiftGrid(grid, k));
    }
    private static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int[][] res = new int[grid.length][grid[0].length];
        k = k % (grid.length * grid[0].length);
        int n = 0;
        int m = 0;

        for(int i = k / (grid.length); i < grid.length; i++) {
            for(int j = k % grid[0].length; j < grid[0].length; j++) {
                res[i][j] = grid[i-k / (grid.length)][j-k % grid[0].length];
            }}
        int l = grid[0].length - k % grid[0].length;
        if (l == grid[0].length) {
            l = 0;
        }
        for (int i = grid.length - (k / grid.length); i < grid.length; i++) {
            for (int j = l; j < grid[0].length; j++) {
                res[m][n] = grid[i][j];
                if (n < grid[0].length-1) {
                    n++;
                }else {
                    m++;
                    n = 0;
                }
            }
        }

        for (int[] re : res) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < res[0].length; j++) {
                list.add(re[j]);
            }
            result.add(list);
        }
        return result;
    }
}

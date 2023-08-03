package leetcode.contest.weekly_347;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class B {

    public static int[][] differenceOfDistinctValues(int[][] grid) {
        int[][] ans = new int[grid.length][grid.length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                Set<Integer> set = new HashSet<>();
                int rD;
                int r = i+1;
                int c = j+1;

                while (r < grid.length && c < grid[0].length) {
                    set.add(grid[r][c]);
                    r++;
                    c++;
                }
                rD = set.size();
                set.clear();

                r = i-1;
                c = j-1;

                while (r >= 0 && c >= 0) {
                    set.add(grid[r][c]);
                    r--;
                    c--;
                }
                ans[i][j] = Math.abs(rD - set.size());
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(differenceOfDistinctValues(new int[][]{{1, 2, 3}, {3, 1, 5}, {3, 2, 1}})));
    }
}

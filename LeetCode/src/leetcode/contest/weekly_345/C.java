package leetcode.contest.weekly_345;

public class C {
    int ans = 0;

    public int maxMoves(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            dfs(grid, i, 0, 0, grid[i][0], true);
        }
        return ans;
    }

    public void dfs(int[][] grid, int i, int j, int moves, int num, boolean a) {
        if (grid[i][j] <= num && moves != 0) {
            moves--;
            ans = Math.max(moves, ans);
            return;
        }

        if (i - 1 < 0 || j + 1 >= grid[0].length) {
            ans = Math.max(moves, ans);
            if (!a) {
                return;
            }
        } else {
            dfs(grid, i - 1, j + 1, moves + 1, grid[i][j], false);
        }
        if (j + 1 > grid[0].length) {
            ans = Math.max(moves, ans);
            return;
        } else {
            dfs(grid, i, j + 1, moves + 1, grid[i][j
                    ], false);
        }
        if (i + 1 >= grid.length || j + 1 >= grid[0].length) {
            ans = Math.max(moves, ans);
        } else
            dfs(grid, i + 1, j + 1, moves + 1, grid[i][j], false);
    }

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.maxMoves(new int[][]{{3,2,4}, {2,1,9}, {1,1,7}}));
    }
}

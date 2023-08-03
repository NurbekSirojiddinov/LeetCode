package leetcode.contest.weekly_352;

class GridTraveler {
    static int n;
    static int m;
    static int[][] grid;

    public static long travel(int n, int m) {
        GridTraveler.n = n;
        GridTraveler.m = m;
        grid = new int[n][m];
        return dfs(0, 0);
    }

    public static long travel2(int n, int m) {
        GridTraveler.n = n;
        GridTraveler.m = m;
        grid = new int[n][m];
        return dfs2(0, 0);
    }

    public static long dfs(int i, int j) {
        if (i == n - 1 || j == m - 1) return 1;

        if (grid[i][j] == 0)
            grid[i][j] = (int) (dfs(i + 1, j) + dfs(i, j + 1));

        return grid[i][j];
    }

    public static long dfs2(int i, int j) {
        if (i == n - 1 || j == m - 1) return 1;

        return dfs2(i + 1, j) + dfs(i, j + 1);
    }

    public static void main(String[] args) {
        long b = System.currentTimeMillis();
        System.out.println(travel2(10000, 10000));
        System.out.println(System.currentTimeMillis() - b);
        b = System.currentTimeMillis();
        System.out.println(travel(10000, 10000));
        System.out.println(System.currentTimeMillis() - b);
    }
}
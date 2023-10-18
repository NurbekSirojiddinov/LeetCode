package leetcode.dynamic_programming;

public class UniquePath {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3,3));
        System.out.println(uniquePaths(1,2));
        System.out.println();
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

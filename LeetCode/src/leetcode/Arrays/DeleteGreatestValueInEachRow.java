package leetcode.Arrays;

import java.util.Arrays;

public class DeleteGreatestValueInEachRow {
    public static int deleteGreatestValue(int[][] grid) {
        int answer = 0;

        for (int[] ints : grid) {
            Arrays.sort(ints);
        }
        for (int i = grid[0].length - 1; i >= 0; i--) {
            int max = 0;
            for (int[] ints : grid) {
                max = Math.max(max, ints[i]);
            }
            answer += max;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(deleteGreatestValue(new int[][]{{1, 2, 4}, {3, 3, 1}}));
    }
}

package leetcode.contest.weekly_344;

import java.util.*;

public class C {
    public static int[] colorTheArray(int n, int[][] queries) {
        int[] array = new int[n];
        int[] ans = new int[queries.length];
        int adj = 0;

        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][0];
            if (array[index] != 0) {
                if (array[index] != queries[i][1]) {
                    if (index - 1 >= 0 && array[index] == array[index - 1]) {
                        adj--;
                    }
                    if (index + 1 < n && array[index] == array[index + 1]) {
                        adj--;
                    }
                    adj = getAdj(n, queries, array, adj, i, index);
                }
            } else {
                adj = getAdj(n, queries, array, adj, i, index);
            }
            ans[i] = adj;
        }
        return ans;
    }

    private static int getAdj(int n, int[][] queries, int[] array, int adj, int i, int index) {
        if (index - 1 >= 0 && array[index - 1] == queries[i][1]) {
            adj++;
        }
        if (index + 1 < n && array[index + 1] == queries[i][1]) {
            adj++;
        }
        array[index] = queries[i][1];
        return adj;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(colorTheArray(4, new int[][]{{0, 2}, {1, 2}, {3, 1}, {1, 1}, {2, 1}})));
    }
}

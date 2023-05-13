package leetcode.contest.biweekly_104;

import java.util.Arrays;

public class B {
    public int matrixSum(int[][] nums) {
        int sum = 0;

        for (int[] ints : nums) {
            Arrays.sort(ints);
        }

        for (int i = 0; i < nums[0].length; i++) {
            int max = 0;
            for (int[] num : nums) {
                max = Math.max(num[i], max);
            }
            sum += max;
        }
        return sum;
    }

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.matrixSum(new int[][]{{1,2,3}}));
    }
}

package leetcode.daily;

import java.util.*;

class Solution {
    public static double average(int[] salary) {
        int max = 0;
        int min = 1000000;

        for (int j : salary) {
            max = Math.max(max, j);
            min = Math.min(min, j);
        }
        return (double) (Arrays.stream(salary).sum() - max - min) / (salary.length - 2);
    }

    public static void main(String[] args) {
        System.out.println(average(new int[]{1, 2, 3, 4, 5}));
    }
}

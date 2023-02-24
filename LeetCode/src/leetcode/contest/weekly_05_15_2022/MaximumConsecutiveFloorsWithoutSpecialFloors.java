package leetcode.contest.weekly_05_15_2022;

import java.util.Arrays;

public class MaximumConsecutiveFloorsWithoutSpecialFloors {
    public static void main(String[] args) {

        System.out.println(16 & 17 & 71 & 62 & 12 & 24);
    }

    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int max = special[0] - bottom;
        bottom = special[0];

        for (int i = 1; i < special.length; i++) {
            max = Math.max(max, special[i] - bottom - 1);
            bottom = special[i];
        }
        if (special[special.length - 1] != top) {
            max = Math.max(max, top - bottom);
        }
        return max;

    }
}

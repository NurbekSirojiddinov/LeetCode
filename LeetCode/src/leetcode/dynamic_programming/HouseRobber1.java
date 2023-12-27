package leetcode.dynamic_programming;

import java.time.Instant;

public class HouseRobber1 {
    public static int rob(int[] houses) {

        if (houses.length == 1) return houses[0];
        if (houses.length == 2) return Math.max(houses[0], houses[1]);

        for (int i = 2; i < houses.length; i++) {
            houses[i] = Math.max(houses[i - 2] + houses[i], houses[i - 1]);
        }
        return houses[houses.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(rob(new int[]{1, 2, 3, 4, 5,7}));
        System.out.println(Instant.now());
    }
}

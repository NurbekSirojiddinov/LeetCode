package leetcode.contest.biweekly_106;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class D {
    public static int sumDistance(int[] nums, String s, int d) {
        long total = 0;
        int sum = 0;
        int mod = 1000000000 + 7;
        for (int i = 0; i < nums.length; i++) {
            if (s.charAt(i) == 'R')
                nums[i] = nums[i] + d;
            else
                nums[i] = nums[i] - d;
            total += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            total -= nums[i];
            sum += Math.abs((long) nums[i] * (nums.length - i - 1) - total);
            sum %= mod;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDistance(new int[]{68,-26,-13,-40}, "LRLL", 2));
    }
}


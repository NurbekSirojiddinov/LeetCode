package leetcode.contest.weekly_337;

import java.util.Arrays;

public class NumberOfEvenAndOddBits {
    public static int[] evenOddBit(int n) {
        String str = Integer.toBinaryString(n);
        int even = 0;
        int odd = 0;
        int index = 0;


        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (c == '1') {
                if (index % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            index++;
        }
        return new int[]{even, odd};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(evenOddBit(8)));
    }
}

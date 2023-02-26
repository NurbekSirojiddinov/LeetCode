package leetcode.contest.weekly_334;

import java.util.Arrays;

public class FindTheDivisibilityArrayOfAString {
    public static int[] divisibilityArray(String word, int m) {
        int[] div = new int[word.length()];
        StringBuilder stringBuilder = new StringBuilder(word);
        long number = 0;


        for (int i = 0; i < stringBuilder.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(stringBuilder.charAt(i)));
            if (number == 0) {
                number += digit;
            } else {
                number = number * 10 + digit;
            }
            number = number % m;
            if (number == 0) {
                div[i] = 1;
            } else {
                div[i] = 0;
            }
        }
        return div;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(divisibilityArray("100000000010000000003019999999961000000000", 1000000000)));
    }
}

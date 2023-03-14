package leetcode.sorting;

import java.util.Arrays;

public class CheckIfAStringCanBreakAnotherString {
    public static boolean checkIfCanBreak(String s1, String s2) {

        char[] firstChars = s1.toCharArray();
        char[] secondChars = s2.toCharArray();
        Arrays.sort(firstChars);
        Arrays.sort(secondChars);

        boolean firstFront = true;
        boolean firstBack = true;
        boolean secondFront = true;
        boolean secondBack = true;
        int right = s1.length() - 1;

        for (int i = 0; i < s1.length(); i++) {
            if (firstFront && firstChars[i] < secondChars[i]) {
                firstFront = false;
            }
            if (firstBack && firstChars[i] < secondChars[right]) {
                firstBack = false;
            }

            if (secondFront && secondChars[i] < firstChars[i]) {
                secondFront = false;
            }

            if (secondBack && secondChars[i] < firstChars[right]) {
                secondBack = false;
            }
            right--;
        }

        return (firstFront || firstBack || secondFront || secondBack);
    }

    public static void main(String[] args) {
        System.out.println(checkIfCanBreak("abe", "acd"));
    }
}

package leetcode.contest.weekly_346;

public class B {
    public static String makeSmallestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (chars[l] != chars[r]) {
                if (chars[l] > chars[r]) {
                    chars[l] = chars[r];
                } else {
                    chars[r] = chars[l];
                }
            }
            l++;
            r--;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : chars) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeSmallestPalindrome("egcfe"));
    }
}

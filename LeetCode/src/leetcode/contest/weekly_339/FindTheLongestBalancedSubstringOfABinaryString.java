package leetcode.contest.weekly_339;

public class FindTheLongestBalancedSubstringOfABinaryString {
    public static int findTheLongestBalancedSubstring(String s) {
        int max = 0;

        for(int i = 0; i < s.length(); i++) {
            int zeros = 0;
            int ones = 0;
            if(s.charAt(i) == '0') {
                while(i < s.length() && s.charAt(i) != '1') {
                    zeros++;
                    i++;
                }
                while(i < s.length() && s.charAt(i) != '0') {
                    ones++;
                    i++;
                }
                i--;
            }
            max = Math.max(Math.min(ones, zeros) * 2, max);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findTheLongestBalancedSubstring("01000111"));
    }
}

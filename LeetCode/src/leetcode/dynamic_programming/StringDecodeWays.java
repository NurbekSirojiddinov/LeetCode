package leetcode.dynamic_programming;

import java.util.HashMap;
import java.util.Map;

public class StringDecodeWays {
    String s;
    Map<Integer, Integer> memo = new HashMap<>();

    public int numDecodings(String s) {
        this.s = s;
        return dp(0);
    }

    public int dp(int i) {
        if (memo.containsKey(i)) {
            return memo.get(i);
        }
        if (i == s.length()) return 1;
        else if (s.charAt(i) == '0') return 0;

        int l = dp(i + 1);

        int r = 0;

        if (i < s.length() - 1) {
            int num = Integer.parseInt(s.substring(i, i + 2));
            if (num >= 10 && num <= 26) {
                r = dp(i + 2);
            }
        }

        memo.put(i, r + l);
        return memo.get(i);
    }

    public static void main(String[] args) {
        System.out.println(new StringDecodeWays().numDecodings("125"));
    }
}

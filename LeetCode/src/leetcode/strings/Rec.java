package leetcode.strings;

public class Rec {
    public static int[] memo = new int[30];

    public static int rec(int num) {
        return dp(num, memo);
    }

    public static int dp(int num, int[] memo) {
        int res;
        if (memo[num] != 0) {
            return memo[num];
        } else if (num == 1 || num == 2) res = 1;
        else {
            res = rec(num - 1) + rec(num - 2);
        }
        memo[num] = res;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(rec(4));
    }
}

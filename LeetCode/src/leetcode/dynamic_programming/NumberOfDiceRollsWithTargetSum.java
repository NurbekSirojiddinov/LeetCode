package leetcode.dynamic_programming;

import java.util.HashMap;
import java.util.Map;

public class NumberOfDiceRollsWithTargetSum {
    Map<Integer, Integer> map = new HashMap<>();
    int ans = 0;
    int k;

    public int numRollsToTarget(int n, int k, int target) {
        this.k = k;
         dp(target, n);
         return ans;
    }

    public void dp(int target, int n) {
        if(target == 0) {
            ans++;
            return ;
        }
        if(n == 0) return;

        for(int i = 1; i <= k; i++) {
            dp(target-i, n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new NumberOfDiceRollsWithTargetSum().numRollsToTarget(3, 3, 5));
    }
}

package leetcode.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CanConstructString {
    List<String> wordBank;
    boolean flag = false;
    Map<String, Boolean> memo = new HashMap<>();

    public boolean wordBreak(String s, List<String> wordDict) {
        this.wordBank = wordDict;
        return backtrack(s);
    }

    public boolean backtrack(String target) {
        if (target.length() == 0) {
            flag = true;
            return true;
        }
        if (memo.containsKey(target)) return memo.get(target);

        boolean res = false;
        for (String s : wordBank) {
            if (target.startsWith(s)) {
                res = backtrack(target.substring(s.length()));
            }
        }
        memo.put(target, res);
        return flag;
    }

    public static void main(String[] args) {
        CanConstructString obj = new CanConstructString();
        System.out.println(obj.wordBreak("applepenapple", new ArrayList<>(List.of("apple", "pen"))));
    }
}

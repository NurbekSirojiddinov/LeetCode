package leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {
    String[] arr;
    List<String> ans;
    public List<String> letterCombinations(String digits) {
        arr = new String[digits.length()];
        ans = new ArrayList<>();
        if (digits.length() == 0) return ans;
        Map<Integer, String> mp = Map.of(
                2, "abc", 3, "def", 4, "ghi", 5, "jkl",
                6, "mno", 7, "pqrs", 8, "tuv", 9, "wxyz");

        for (int i1 = 0; i1 < digits.length(); i1++) {
            arr[i1] = mp.get((int) digits.charAt(i1) - 48);
        }

        return bt(new StringBuilder(), 0);
    }

    public List<String> bt(StringBuilder str, int st) {
        if (str.length() == arr.length) {
            ans.add(str.toString());
            return ans;
        }
        for (int j = 0; j < arr[st].length(); j++) {
            str.append(arr[st].charAt(j));
            bt(str, st + 1);
            str.deleteCharAt(str.length() - 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        LetterCombinationsOfAPhoneNumber obj = new LetterCombinationsOfAPhoneNumber();
        List<String> list = obj.letterCombinations("999999999999");
        System.out.println(list.size());

    }
}

package leetcode.strings;

import java.util.HashMap;
import java.util.Map;

public class ReplaceAllDigitswithCharacters {
    public String replaceDigits(String s) {
        int[] arr = new int[26];
        Map<Integer, Character> mp = new HashMap<>();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            mp.put('a' + i, (char) ('a' + i));
        }

        for (int i = 0; i < s.length() - 1; i++) {
            str.append(mp.get(s.charAt(i) + Integer.parseInt(String.valueOf(s.charAt(i + 1)))));
        }
        return str.toString();
    }

    public static void main(String[] args) {

    }
}

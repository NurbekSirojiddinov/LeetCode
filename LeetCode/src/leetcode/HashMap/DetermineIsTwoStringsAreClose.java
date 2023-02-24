package leetcode.HashMap;

import java.util.*;

public class DetermineIsTwoStringsAreClose {
    public static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        Set<Character> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            arr1[word1.charAt(i) - 'a']++;
            arr2[word2.charAt(i) - 'a']++;
            set.add(word1.charAt(i));
        }

        for (int i = 0; i < 26; i++) {
            char c = (char) (i + 'a');
            if (arr2[i] != 0 && !set.contains(c)) {
                return false;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != 0) {
                list.add(arr1[i]);
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr2[i] != 0) {
                if (list.contains(arr2[i])) {
                    list.remove((Integer) arr2[i]);
                } else {
                    return false;
                }
            }
            if (i == 25 && list.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(closeStrings("cabbba", "abbccc"));
    }
}

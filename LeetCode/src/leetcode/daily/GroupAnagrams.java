package leetcode.daily;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> mp = new HashMap<>();

        for (String string : strs) {
            char[] c = string.toCharArray();
            Arrays.sort(c);
            String string1 = new String(c);
            mp.computeIfAbsent(string1, k -> new ArrayList<>()).add(string);
        }

        return mp.values().stream().toList();
    }
}

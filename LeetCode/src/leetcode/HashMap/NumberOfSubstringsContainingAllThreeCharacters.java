package leetcode.HashMap;

import java.util.*;

public class NumberOfSubstringsContainingAllThreeCharacters {
    public static int numberOfSubstrings(String s) {
        Map<Character, List<Integer>> map = new HashMap<>();
        int subStrings = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(s.charAt(i))) {
                map.put(c, new ArrayList<>());
            }
            map.get(c).add(i);
        }

        while (map.size() == 3) {
            int max = Math.max(map.get('a').get(0), Math.max(map.get('b').get(0), map.get('c').get(0)));
            int min = Math.min(map.get('a').get(0), Math.min(map.get('b').get(0), map.get('c').get(0)));
            if (map.get('a').get(0) == min) {
                map.get('a').remove(0);
                if (map.get('a').size() == 0) map.remove('a');
            } else if (map.get('b').get(0) == min) {
                map.get('b').remove(0);
                if (map.get('b').size() == 0) map.remove('a');
            } else {
                map.get('c').remove(0);
                if (map.get('c').size() == 0) map.remove('a');
            }
            subStrings += s.length() - max;
        }
            return subStrings;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("abcabc"));
    }
}

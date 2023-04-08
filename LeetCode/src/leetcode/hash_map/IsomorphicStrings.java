package leetcode.hash_map;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();

        if (checkIsomorphic(t, s, map)) return false;
        map.clear();

        return !checkIsomorphic(s, t, map);
    }

    private static boolean checkIsomorphic(String s, String t, Map<Character, Character> map) {
        for (int i = 0; i < t.length(); i++) {
            char letter = t.charAt(i);
            if (!map.containsKey(letter)) {
                map.put(letter, s.charAt(i));
            } else if (map.get(letter) != s.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba"));
        /*
         * e:a
         * g:d
         * c:f
         * d:d
         * */
    }
}

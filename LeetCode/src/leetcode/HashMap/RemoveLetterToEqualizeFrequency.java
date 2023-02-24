package leetcode.HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveLetterToEqualizeFrequency {
    public static boolean equalFrequency(String word) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        Set<Integer> set;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        set = new HashSet<>(map.values());
        if ((set.size() == 1 && map.get(word.charAt(0)) > 1) || set.size() > 2) return false;
        if (set.size() == 1 && map.get(word.charAt(0)) == 1) return true;
        int first = map.get(word.charAt(0));
        int second;
        int a = 0;
        while (a < word.length() && word.charAt(a) == word.charAt(0)) {
            a++;
        }
        second = map.get(word.charAt(a));


        for (Map.Entry<Character, Integer> entry :map.entrySet()) {
            map2.put(entry.getValue(), map2.getOrDefault(entry.getValue(), 0) + 1);
        }
        if (first != second && Math.abs(first - second) == 1) return (map2.get(map.get(word.charAt(0))) == 1 || map2.get(map.get(word.charAt(a))) == 1);

        for (int i = 2; i < word.length(); i++) {
            char c = word.charAt(i);
            int min = Math.min(first, map.get(c));
            int max = Math.max(first, map.get(c));
            if (first != map.get(c)) return ((Math.abs(first - map.get(c)) == 1) && ((min == 1 && map2.get(min) == 1) || map2.get(max) == 1)) || (min) == 1 && map2.get(min) == 1;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(equalFrequency("cbccca"));
    }
}

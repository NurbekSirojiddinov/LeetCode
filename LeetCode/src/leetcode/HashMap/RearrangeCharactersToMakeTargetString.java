package leetcode.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RearrangeCharactersToMakeTargetString {
    public static int rearrangeCharacters(String s, String target) {

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> helperMap;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.indexOf(1);
        list.remove((Object) 2);
        System.out.println(list.indexOf(2));
        int numberOfCopies = 0;

        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        helperMap = new HashMap<>(map);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            StringBuilder stringBuilder = new StringBuilder(s);

            if (helperMap.containsKey(c)) {
                helperMap.put(c, helperMap.get(c) - 1);
                if (helperMap.get(c) == 0) {
                    helperMap.remove(c);
                }
                stringBuilder.deleteCharAt(i);
                i--;
                s = stringBuilder.toString();
            }
            if (helperMap.size() == 0) {
                numberOfCopies++;
                helperMap = new HashMap<>(map);
                i = -1;
            }
        }
        return numberOfCopies;
    }

    public static void main(String[] args) {
        System.out.println(rearrangeCharacters("oweioiiohoikiwihhwwojhwhjl", "woijih"));
    }
}

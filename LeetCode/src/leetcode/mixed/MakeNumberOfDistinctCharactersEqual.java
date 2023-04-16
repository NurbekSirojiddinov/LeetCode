package leetcode.mixed;

import java.util.HashMap;
import java.util.Map;

public class MakeNumberOfDistinctCharactersEqual {
    public static boolean isItPossible(String word1, String word2) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        Map<Character, Integer> map3;
        Map<Character, Integer> map4;

        //add all chars to the map
        for (char character : word1.toCharArray()) {
            map.put(character, map.getOrDefault(character, 0) + 1);
        }
        for (char character : word2.toCharArray()) {
            map2.put(character, map2.getOrDefault(character, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            for (Map.Entry<Character, Integer> entry1 : map2.entrySet()) {
                map3 = new HashMap<>(map);
                map4 = new HashMap<>(map2);

                //remove one char from map3
                map3.put(entry.getKey(), map3.get(entry.getKey()) - 1);
                if (map3.get(entry.getKey()) == 0) map3.remove(entry.getKey());
                //add a new char to map3
                map3.put(entry1.getKey(), 1);

                //remove one char from map4
                map4.put(entry1.getKey(), map4.get(entry1.getKey()) - 1);
                if (map4.get(entry1.getKey()) == 0) map4.remove(entry1.getKey());
                //add a new char to map4
                map4.put(entry.getKey(), 1);

                if (map3.size() == map4.size()) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isItPossible("ab", "abcc"));
    }
}

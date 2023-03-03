package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class DecodeTheMessage {
    private static String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>(Map.of(' ', ' '));
        StringBuilder stringBuilder = new StringBuilder();
        char letter = 'a';

        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, letter++);
            }
        }

        for (int i = 0; i < message.length(); i++) {
            stringBuilder.append(map.get(message.charAt(i)));
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
        System.out.println(decodeMessage("th quick brown fox jumps over the lazy dog", "vkbs abs t suepuv"));
    }
}

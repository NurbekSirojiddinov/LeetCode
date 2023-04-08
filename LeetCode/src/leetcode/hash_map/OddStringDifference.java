package leetcode.hash_map;

import java.util.HashMap;
import java.util.Map;

public class OddStringDifference {
    public static String oddString(String[] words) {
        Map<String, String> map = new HashMap<>();
        StringBuilder str;
        boolean flag = false;

        for (int i = 0; i < words.length; i++) {
            str = new StringBuilder();
            for (int j = 1; j < words[i].length(); j++) {
                str.append(words[i].charAt(j) - words[i].charAt(j - 1)).append(";");
            }
            if (map.containsKey(str.toString())) {
                flag = true;
                if (map.size() == 2) {
                    return map.get(str.toString()).equals(words[i - 1]) ? words[i - 2] : words[i - 1];
                }
            } else {
                if (map.size() == 1 && flag) return words[i];
                map.put(str.toString(), words[i]);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(oddString(new String[]{"ddd","poo","baa","onn"}));
    }
}

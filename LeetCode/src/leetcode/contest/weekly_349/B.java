package leetcode.contest.weekly_349;

import java.util.HashMap;
import java.util.Map;

public class B {
    public static String smallestString(String s) {
        StringBuilder str = new StringBuilder();

        Map<Character, Character> mp = new HashMap<>();
        mp.put((char) 97, (char) 122);

        for (int i = 98; i <= 122; i++) {
            mp.put((char) i, ((char) (i - 1)));
        }
        int a = 0;
        int b = -1;
        if (s.charAt(0) == 'a') {
            while (a < s.length()) {
                str.append('a');
                while (s.charAt(a) != 'a') {
                    str.append(mp.get(s.charAt(a)));
                    a++;
                }
                while (a < s.length()) {
                    str.append(s.charAt(a));
                    a++;
                }
            }
        }
        if (a == 0) {
            str.append(mp.get('a'));
            for (int i = 1; i < s.length(); i++) {
                str.append(mp.get(s.charAt(i)));
            }
            } else {
            for (int i = 0; i < s.length(); i++) {
                str.append(mp.get(s.charAt(i)));
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(smallestString("aaa"));
        System.out.println(smallestString("a"));
    }
}


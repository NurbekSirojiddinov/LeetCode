package leetcode.hashMap;

import java.util.HashSet;
import java.util.Set;

public class MaximumNumberOfWordsYouCanType {
    public static int canBeTypedWords(String text, String brokenLetters) {

        String[] arr = text.split(" ");
        Set<Character> set = new HashSet<>();
        int counter = 0;

        for (int i = 0; i < brokenLetters.length(); i++) {
            set.add(brokenLetters.charAt(i));
        }
        for (String s : arr) {
            int a = 0;
            for (int j = 0; j < s.length(); j++) {
                if (set.contains(s.charAt(j))) {
                    a = 1;
                    break;
                }
            }
            if (a == 0) counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(canBeTypedWords("hello coders", "ab"));
    }
}

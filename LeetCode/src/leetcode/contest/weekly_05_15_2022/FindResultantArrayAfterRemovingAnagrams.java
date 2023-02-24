package leetcode.contest.weekly_05_15_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindResultantArrayAfterRemovingAnagrams {
    public static void main(String[] args) {
        String[] words = {"abba", "baba", "bbaa", "cd", "cd"};
        System.out.println(removeAnagrams(words));
    }

    private static List<String> removeAnagrams(String[] words) {
        List<String> stringBuilders = new ArrayList<>(Arrays.asList(words));
        for (int i = 0; i < stringBuilders.size(); i++) {
            if (i != 0) {
                if (isAnagram(stringBuilders.get(i), stringBuilders.get(i - 1))) {
                    stringBuilders.remove(stringBuilders.get(i));
                    i--;
                }
            }
        }
        return stringBuilders;
    }

    private static boolean isAnagram(String str1, String str2) {
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        boolean status = true;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        return status;
    }

}

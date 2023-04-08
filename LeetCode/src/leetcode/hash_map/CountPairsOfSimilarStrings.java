package leetcode.hash_map;

import java.util.HashSet;
import java.util.Set;

public class CountPairsOfSimilarStrings {
    public static int similarPairs(String[] words) {
        Set<Character> set;
        int pairs = 0;

        for (int i = 0; i < words.length; i++) {
            set = new HashSet<>();
            for (int k = 0; k < words[i].length(); k++) {
                set.add(words[i].charAt(k));
            }

            for (int j = i + 1; j < words.length; j++) {
                boolean flag = true;
                Set<Character> set1 = new HashSet<>();
                for (int n = 0; n < words[j].length(); n++) {
                    if (!set.contains(words[j].charAt(n))) {
                        flag = false;
                        break;
                    }
                    set1.add(words[j].charAt(n));
                }
                if (flag && set1.size() == set.size()) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        System.out.println(similarPairs(new String[]{"aba", "aacbb", "abcd", "bac", "aabc"}));
    }
}

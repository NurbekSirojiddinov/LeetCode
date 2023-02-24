package leetcode.contest.weekly_331;

import java.util.*;

public class CLassA {
    public static int[] vowelStrings(String[] words, int[][] queries) {
        Set<Character> set = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u'));
        Map<Integer, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        int[] arr = new int[queries.length];
        int counter = 0; //number of vowels that start and end with a vowel

        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
            if (set.contains(words[i].charAt(0)) && set.contains(words[i].charAt(words[i].length() - 1))) { //check if word starts and ends with a vowel
                counter++;
            }map.put(i, counter);
        }
        for (int i = 0; i < queries.length; i++) {
            arr[i] = map.get(queries[i][1]) - map.get(queries[i][0]);
            String str = list.get(queries[i][0]);
            if (set.contains(str.charAt(0)) && set.contains(str.charAt(str.length() - 1))) {
                arr[i]++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(vowelStrings(new String[]{"aba", "bcb", "ece", "aa", "e"}, new int[][]{{0, 2}, {1, 4}, {1, 1}})));
    }
}

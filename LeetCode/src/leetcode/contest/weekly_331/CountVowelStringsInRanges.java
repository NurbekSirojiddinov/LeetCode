package leetcode.contest.weekly_331;

import java.util.*;

public class CountVowelStringsInRanges {
    public static int[] vowelStrings(String[] words, int[][] queries) {
        Map<String, Integer> map = new HashMap<>();
        Map<Integer, List<Integer>> listMap = new HashMap<>();
        Set<Character> set = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u'));

        for (int[] query : queries) {
            String str = query[0] + String.valueOf(query[1]);
            map.put(str, 0);
            if (!listMap.containsKey(query[0])) {
                listMap.put(query[0], new ArrayList<>());
            }
            List<Integer> list = listMap.get(query[0]);
            if (!list.contains(query[1])) list.add(query[1]);
            listMap.put(query[0], list);
        }

        for (String word : words) {
            for (int j = 0; j < word.length(); j++) {
                if (set.contains(word.charAt(j)) && listMap.containsKey(j)) {
                    List<Integer> list = listMap.get(j);
                    for (int a : list) {
                        char c;
                        if (a >= word.length()) {
                            c = word.charAt(word.length() - 1);
                        } else {
                            c = word.charAt(a);
                        }
                        if (set.contains(c)) {
                            String str = j + String.valueOf(a);
                            map.put(str, map.getOrDefault(str, 0) + 1);
                        }
                    }
                }
            }
        }
        int[] arr = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String str = queries[i][0] + String.valueOf(queries[i][1]);
            if (map.containsKey(str)) {
                arr[i] = map.get(str);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(vowelStrings(new String[]{"aba", "bcb", "ece", "aa", "e"}, new int[][]{{0, 2}, {1, 4}, {1, 1}})));
    }
}

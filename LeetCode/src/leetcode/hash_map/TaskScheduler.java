package leetcode.hash_map;

import java.util.*;

public class TaskScheduler {
    public static int leastInterval(char[] tasks, int n) {

        int[] array = new int[26];
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
        int index = 0;
        int i = 0;
        int counter = 0;
        int result = 0;

        for (char c : tasks) {
            if (!list.contains(c)) {
                list.add(c);
            }
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        char previous = ' ';

        while (!list.isEmpty()) {
            if (i >= list.size()) {
                i--;
            }
            char c = list.get(i);
            counter++;
            if (c!= previous) {
                map.put(c, map.get(c) - 1);
                previous = c;
            } else if (counter == n + 1) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    result++;
                }
            }
            result++;
            if (map.get(c) == 0) {
                map.remove(c);
                list.remove((Character) c);
                i--;
            }
            if (counter == n + 1) {
                counter = 0;
                i = index - 1;
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2));
    }
}

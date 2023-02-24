package leetcode.mixed;

import java.util.*;

public class FindPlayersWithZeroOrOneLosses {
    public static void main(String[] args) {
        int[][] matches = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        System.out.println(findWinners(matches));
    }
    private static List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int[] match : matches) {
            if (!map.containsKey(match[0])) {
                map.put(match[0], 0);
            }
            if (!map.containsKey(match[1])) {
                map.put(match[1], 0);
            }
            map.put(match[1], map.get(match[1]) + 1);
        }
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        System.out.println(map);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0) {
                list.add(entry.getKey());
            }if (entry.getValue() == 1) {
                list1.add(entry.getKey());
            }
        }
        System.out.println(list);
        System.out.println(list1);
        Collections.sort(list);
        Collections.sort(list1);

        result.add(list);
        result.add(list1);

        return result;
    }
}

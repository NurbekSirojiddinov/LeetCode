package leetcode.daily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindPlayersWithZeroOrOneLosses {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<Integer> w = new ArrayList<>();
        Map<Integer, Integer> l = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();

        for (int[] m : matches) {
            if (!w.contains(m[0])) w.add(m[0]);
            l.put(m[1], l.getOrDefault(m[1], 0) + 1);
        }

        ans.add(w.stream()
                .filter(integer -> !l.containsKey(integer)).sorted().collect(Collectors.toList()));

        w = new ArrayList<>();
        List<Integer> finalW = w;
        l.forEach((integer, integer2) -> {
            if (integer2 == 1) {
                finalW.add(integer);
            }
        });
        ans.add(finalW.stream().sorted().collect(Collectors.toList()));

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new FindPlayersWithZeroOrOneLosses().findWinners(new int[][]{}));
    }
}

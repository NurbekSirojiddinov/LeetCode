package leetcode.contest.weekly_01_05_2022;

import java.util.*;

public class MinimumConsecutiveCardsToPickUp {
    public static void main(String[] args) {
        int[] cards = {3,4,2,3,4,7};
        System.out.println(minimumCardPickup(cards));
    }

    private static int minimumCardPickup(int[] cards) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < cards.length; i++) {
            if (!map.containsKey(cards[i])) {
                map.put(cards[i], i);
            } else {
                list.add(1 + i - map.get(cards[i]));
                map.remove(cards[i]);
                map.put(cards[i], i);
            }
        }
        if (list.isEmpty()) return -1;
        Collections.sort(list);
        return list.get(0);
    }
}

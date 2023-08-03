package leetcode.contest.biweekly_108;

import java.util.*;

public class B {
    public static List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {
        Set<Integer> mp = new HashSet<>();

        for (int num : nums) {
            mp.add(num);
        }

        for (int i = 0; i < moveFrom.length; i++) {
            mp.remove(moveFrom[i]);
            mp.add(moveTo[i]);
        }
        List<Integer> l = new ArrayList<>(mp);

        Collections.sort(l);

        return l;
    }

    public static void main(String[] args) {
        System.out.println(relocateMarbles(new int[] {1,2,3}, null, null));

    }
}

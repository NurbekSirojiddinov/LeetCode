package leetcode.contest.weekly_345;

import java.util.*;

public class A {
    public static int[] circularGameLosers(int n, int k) {
        Map<Integer, Boolean> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        map.put(0, Boolean.TRUE);
        int i = 1;

        for (int j = 1; j < n; j++) {
            map.put(j, Boolean.FALSE);
        }

        int index = 0;
        while (true) {
            if (index + i * k >= n) {
                index = (index + i * k)% n;
            } else {
                index = index + i * k;
            }
            if (map.get(index)) {
                break;
            }
            map.put(index, Boolean.TRUE);
            i++;
        }
        for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
            if (!entry.getValue()) {
                list.add(entry.getKey());
            }
        }
        int[] arr = new int[list.size()];
        i = 0;

        for (int m : list) {
            arr[i++] = m + 1;
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(circularGameLosers(4, 4)));
    }
}



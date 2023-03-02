package leetcode.arrays;

import java.util.*;

public class SortIntegersByTheNumberOf1Bits {
    public static int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int j : arr) {
            if (!map.containsKey(j)) {
                map.put(j, Integer.bitCount(j));
            }
        }

        for (int k : arr) {
            if (list.size() == 0) {
                list.add(k);
            } else {
                int index = -1;
                for (int j = 0; j < list.size(); j++) {
                    if (map.get(k) < map.get(list.get(j))) {
                        list.add(j, k);
                        break;
                    } else if (Objects.equals(map.get(k), map.get(list.get(j)))) {
                        index = j;
                    }
                    if (j == list.size() - 1) {
                        if (index != -1) {
                            list.add(index + 1, k);
                        } else list.add(k);
                        break;
                    }
                }
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortByBits(new int[]{1, 2, 3, 4, 5, 6, 7, 8})));
    }
}

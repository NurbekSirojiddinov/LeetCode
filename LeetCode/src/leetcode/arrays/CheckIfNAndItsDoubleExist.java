package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

class CheckIfNAndItsDoubleExist {
    public static boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int j : arr) {
            if ((j % 2 == 0 && map.containsKey(j / 2)) || map.containsKey(j * 2)) {
                return true;
            }
            map.put(j, 0);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{1, 2, 3, 4, 5, 6, 7, 8,}));
    }
}
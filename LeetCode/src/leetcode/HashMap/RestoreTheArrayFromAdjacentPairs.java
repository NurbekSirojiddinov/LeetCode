package leetcode.HashMap;

import javax.swing.tree.TreeNode;
import java.util.*;

public class    RestoreTheArrayFromAdjacentPairs {
    public static int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int firstNum = 0;

        for (int[] adjacentPair : adjacentPairs) {
            if (!map.containsKey(adjacentPair[0]) && !map2.containsKey(adjacentPair[0])) {
                firstNum = adjacentPair[0];
            }
            if (map.containsKey(adjacentPair[0])) {
                list.add(map.get(adjacentPair[0]));
                list.add(adjacentPair[0]);
                list.add(adjacentPair[1]);
            }
            map.put(adjacentPair[0], adjacentPair[1]);
            if (!map.containsKey(adjacentPair[1]) && !map2.containsKey(adjacentPair[1])) {
                firstNum = adjacentPair[1];
            }
            if (map2.containsKey(adjacentPair[1])) {
                list.add(map2.get(adjacentPair[1]));
                list.add(adjacentPair[1]);
                list.add(adjacentPair[0]);
            }
            map2.put(adjacentPair[1], adjacentPair[0]);
        }
        int[] result = new int[map.size()];
        int index = 1;
        result[0] = firstNum;
        if (firstNum == list.get(0) || firstNum == list.get(list.size() - 1)) {
            index--;
        }
        for (int i = 0; i < list.size(); i++) {
            result[index] = list.get(i);
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(restoreArray(new int[][]{{2, 1}, {3, 4}, {3, 2}})));
    }
}

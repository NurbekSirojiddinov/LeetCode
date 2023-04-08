package leetcode.hash_map;

import java.util.*;

public class CheckArrayFormationThroughConcatenation {
    public static boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, Integer> indices = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            indices.put(arr[i], i);
        }
        for (int[] piece : pieces) {
            if (!indices.containsKey(piece[0])) {
                return false;
            }
            int start = indices.get(piece[0]);
            List<Integer> sublist = new ArrayList<>();
            for (int i = start; i < start + piece.length; i++) {
                sublist.add(arr[i]);
            }
            if (!sublist.equals(List.of(piece))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canFormArray(new int[]{37,69,3,74,46}, new int[][]{{37,69,3,74,46}}));
    }
}

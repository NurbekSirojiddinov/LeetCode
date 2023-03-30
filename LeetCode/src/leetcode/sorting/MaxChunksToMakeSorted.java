package leetcode.sorting;

import java.util.ArrayList;
import java.util.List;

public class MaxChunksToMakeSorted {
    public static int maxChunksToSorted(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int index = 0;
        int counter = 0;
        int prev = 0;

        for (int i = 0; i < arr.length; i++) {
            list.add(index++);
            if (list.contains(arr[i]) && i - prev + 1 == list.size()) {
                boolean flag = true;
                for (int i1 = prev; i1 <= i; i1++) {
                    if (!list.contains(arr[i1])) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    list = new ArrayList<>();
                    counter++;
                    prev = i + 1;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(maxChunksToSorted(new int[]{1,0,2,3,4}));
    }
}

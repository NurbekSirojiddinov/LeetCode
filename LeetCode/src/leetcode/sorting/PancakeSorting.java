package leetcode.sorting;

import java.util.ArrayList;
import java.util.List;

public class PancakeSorting {
    public static List<Integer> pancakeSort(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int maxVal = arr.length;

        while (maxVal != 1) {
            for (int i = 0; i < maxVal; i++) {
                if (i == 0 && arr[i] == maxVal) {
                    sort(0, maxVal - 1, arr);
                    list.add(maxVal);
                    maxVal--;
                    break;
                } else if (arr[i] == maxVal) {
                    sort(0, i, arr);
                    sort(0, maxVal - 1, arr);
                    list.add(i + 1);
                    list.add(maxVal);
                    maxVal--;
                    break;
                }
            }
        }
        return list;
    }

    private static void sort(int j, int k, int[] arr) {
        while (j < k) {
            int temp = arr[j];
            arr[j] = arr[k];
            arr[k--] = temp;
            j++;
        }
    }

    public static void main(String[] args) {
        System.out.println(pancakeSort(new int[]{3, 2, 4, 1}));
    }
}

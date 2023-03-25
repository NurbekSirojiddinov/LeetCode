package leetcode.sorting;

import java.util.Arrays;

public class TheKStrongestValuesInAnArray {
    public static int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int median = arr[(n - 1) / 2];
        int[] strongestArr = new int[k];
        int index = 0;
        int left = 0;
        int right = n - 1;

        while (index < k) {
            int val = Math.abs(arr[left] - median) - Math.abs(arr[right] - median);
            if (val > 0 || (val == 0 && arr[left] > arr[right])) {
                strongestArr[index++] = arr[left++];
            } else if (val < 0 || arr[left] <= arr[right]) {
                strongestArr[index++] = arr[right--];
            }
        }
        return strongestArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getStrongest(new int[]{1, 2, 3, 4, 5}, 2)));
    }
}

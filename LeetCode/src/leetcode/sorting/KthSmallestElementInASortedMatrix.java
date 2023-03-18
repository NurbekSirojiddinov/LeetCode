package leetcode.sorting;

import java.util.Arrays;

public class KthSmallestElementInASortedMatrix {
    public static int kthSmallest(int[][] matrix, int k) {

        int[] arr = new int[matrix.length * matrix.length];
        int index = 0;

        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                arr[index++] = ints[j];
            }
        }
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static void main(String[] args) {
        System.out.println(kthSmallest(new int[][]{{1, 2, 3}, {1, 2, 3}}, 2));
    }
}

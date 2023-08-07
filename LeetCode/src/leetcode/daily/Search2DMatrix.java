package leetcode.daily;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Search2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            if (ints[0] <= target && ints[ints.length - 1] >= target) {
                return !(Arrays.binarySearch(ints, target) == -1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}}, 4));
    }
}

package leetcode.sorting;

import java.util.Arrays;
import java.util.Map;

public class SortEvenAndOddIndicesIndependently {
    public static int[] sortEvenOdd(int[] nums) {

        int[] oddIndexes = new int[nums.length / 2];
        int[] evenIndexes = new int[nums.length - oddIndexes.length];
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < nums.length; i += 2) {
            if (i + 1 < nums.length) {
                oddIndexes[index1++] = nums[i + 1];
            }
            evenIndexes[index2++] = nums[i];
        }
        index1 = oddIndexes.length - 1;
        index2 = 0;
        int index = 0;
        Arrays.sort(oddIndexes);
        Arrays.sort(evenIndexes);

        while (index1 >= 0 || index2 < evenIndexes.length) {
            if (index2 < evenIndexes.length) {
                nums[index++] = evenIndexes[index2++];
            }
            if (index1 >= 0) {
                nums[index++] = oddIndexes[index1--];
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortEvenOdd(new int[]{4, 1, 2, 3})));
    }
}

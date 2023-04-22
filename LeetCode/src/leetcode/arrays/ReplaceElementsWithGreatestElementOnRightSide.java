package leetcode.arrays;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public static int[] replaceElements(int[] arr) {
        int index = arr.length - 2;
        int prev = arr[index + 1];
        arr[index + 1] = -1;
        int curr;

        while (index >= 0) {
            curr = arr[index];
            arr[index] = prev;
            prev = Math.max(prev, curr);
            index--;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceElements(new int[]{1, 2, 3, 4, 5, 6})));
    }
}

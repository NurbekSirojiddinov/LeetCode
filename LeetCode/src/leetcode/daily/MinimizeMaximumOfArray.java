package leetcode.daily;

import java.util.Arrays;
import java.util.Comparator;

public class MinimizeMaximumOfArray {
    public static int minimizeArrayValue(int[] nums) {
        IndexValue[] indexValues = new IndexValue[nums.length];
        int l = 0;
        int r = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            indexValues[i] = new IndexValue(i, nums[i]);
        }
        Arrays.sort(indexValues, Comparator.comparing(IndexValue::val));
        int max = indexValues[r].val();

        while (l <= r) {
            if (indexValues[r].index() > indexValues[l].index() && indexValues[r].val() > indexValues[l].val()) {
                int newVal = (indexValues[r].val() - indexValues[l].val()) / 2;
                indexValues[l] = new IndexValue(l, indexValues[l].val() + newVal);
                indexValues[r] = new IndexValue(r, indexValues[r].val() - newVal);
                max = Math.max(max, Math.max(indexValues[l].val(), indexValues[r].val()));
            }
            l++;
            r--;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(minimizeArrayValue(new int[]{1, 8, 6, 5, 4, 7}));
    }
}

record IndexValue(int index, int val) {
}

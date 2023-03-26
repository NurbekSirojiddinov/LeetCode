package leetcode.sorting;

import java.util.Arrays;

public class CountElementsWithStrictlySmallerAndGreaterElements {
    public static int countElements(int[] nums) {
        int counter = 0;
        Arrays.sort(nums);
        int i = 1;
        int n = nums.length;

        while (i < nums.length) {
            if (nums[i] == nums[i - 1]) {
                i++;
            } else {
                i--;
                break;
            }
        }
        if (i == nums.length) return 0;
        int j = i + 1;
        int k = j;

        while (j < nums.length - 1) {
            if (j + 1 < n && nums[j] == nums[j + 1]) {
                j++;
            } else if (j + 1 < n && nums[j] > nums[i] && nums[j] < nums[j + 1]) {
                counter++;
                k++;
                j = k;
            } else if (nums[i] >= nums[j]) {
                j++;
                k++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {

        System.out.println(countElements(new int[]{-71, -71, 93, -71, 40}));
    }
}


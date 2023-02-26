package leetcode.contest.weekly_334;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindTheMaximumNumberOfMarkedIndices {
    public static int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        int markedIndices = 0;

        int j = nums.length - 1;
        int i = j - 1;

        while (i >= 0) {
            if (set.contains(j)) {
                j--;
            } else if (nums[j] >= nums[i] * 2) {
                markedIndices += 2;
                set.add(i);
                set.add(j);
                j--;
            }
            if (!set.contains(j))
                i--;
        }
        int max = 0;
        i = 0;
        j = nums.length / 2;
        if (nums.length % 2 == 1) {
            j++;
        }
        while (j < nums.length) {
            if (nums[j] > nums[i] * 2) {
                max +=2;
                i++;
            }
            j++;
        }
        return Math.max(markedIndices, max);
    }

    public static void main(String[] args) {
        System.out.println(maxNumOfMarkedIndices(new int[]{57,40,57,51,90,51,68,100,24,39,11,85,2,22,67,29,74,82,10,96,14,35,25,76,26,54,29,44,63,49,73,50,95,89,43,62,24,88,88,36,6,16,14,2,42,42,60,25,4,58,23,22,27,26,3,79,64,20,92}));
    }
}

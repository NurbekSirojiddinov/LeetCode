package leetcode.contest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximalScoreAfterApplyingKOperations {
    public static long maxKElements(int[] nums, int k) {
        long maxScore = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            priorityQueue.add(num);
        }
        while ( k > 0) {
            int num = 0;
            if (!priorityQueue.isEmpty()) {
                num = priorityQueue.poll();
            }
            maxScore += num;
            priorityQueue.add((int) Math.ceil(num / 3.));
            k--;
        }
        return maxScore;
    }

    public static void main(String[] args) {
        System.out.println(maxKElements(new int[]{1, 2, 3, 4, 1, 2, 3}, 6));
        //1,1,2,2,3,4
        System.out.println(maxKElements(new int[]{10, 10, 10, 10, 10}, 4));
    }
}

package leetcode.sorting;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinimumAmountOfTimeToFillCups {
    public static int fillCups(int[] amount) {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        if (amount[0] != 0) {
            queue.add(amount[0]);
        }
        if (amount[1] != 0) {
            queue.add(amount[1]);
        }
        if (amount[2] != 0) {
            queue.add(amount[2]);
        }
        int counter = 0;

        while (!queue.isEmpty()) {
            int first = queue.poll();
            int second = -1;
            if (!queue.isEmpty()) {
                second = queue.poll();
            }

            counter++;
            first--;
            second--;
            if (first > 0) {
                queue.add(first);
            }
            if (second > 0) {
                queue.add(second);
            }

        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(fillCups(new int[]{5, 4, 4}));
    }
}

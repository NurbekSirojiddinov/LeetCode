package leetcode.mixed;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementInAStream {

    Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
    int k;

    public KthLargestElementInAStream(int k, int[] nums) {
        this.k = k;
        for (int i : nums) {
            queue.offer(i);
        }
    }

    public int add(int val) {
        int count = 0;
        int val1 = 0;
        queue.offer(val);

        for (int v : queue) {
            count++;
            if (count == k) {
                return v;
            }
        }
        return 0;
    }
}

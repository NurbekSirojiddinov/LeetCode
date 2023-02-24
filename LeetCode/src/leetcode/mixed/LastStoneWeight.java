package leetcode.mixed;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight {
    public static void main(String[] args) {
        int[] stones = {1,2,3,4,5,6,7,8};
        System.out.println(lastStoneWeight(stones));
    }
    private static int lastStoneWeight(int[] stones) {

            Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
            for (int i : stones) {
                queue.offer(i);
            }
            while (!queue.isEmpty()  && queue.size() != 1) {
                int a = queue.poll();
                int b = 0;
                if (!queue.isEmpty())
                 b = queue.poll();
                queue.add(Math.abs(a-b));
            }
            if (!queue.isEmpty())
            return queue.poll();
            return 0;
    }
}

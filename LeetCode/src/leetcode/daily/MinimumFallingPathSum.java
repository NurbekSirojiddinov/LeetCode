package leetcode.daily;

import java.util.PriorityQueue;
import java.util.Queue;

public class MinimumFallingPathSum {
    public int connectSticks(int[] sticks) {

        Queue<Integer> queue = new PriorityQueue<>();

        for (int stick : sticks) {
            queue.add(stick);
        }
        int sum = 0;

        while (!queue.isEmpty()) {
            int a = queue.poll();
            if (queue.isEmpty()) return sum;
            a += queue.poll();
            sum += a;
            queue.add(a);
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new MinimumFallingPathSum().connectSticks(new int[]{1,8,3,5}));
    }
}

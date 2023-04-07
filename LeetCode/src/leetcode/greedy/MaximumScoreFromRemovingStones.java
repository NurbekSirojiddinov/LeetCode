package leetcode.greedy;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaximumScoreFromRemovingStones {
    public static int maximumScore(int a, int b, int c) {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        queue.addAll(List.of(a, b, c));
        int sum = 0;

        while (queue.size() > 1) {
            if (queue.size() == 2) {
                sum += Math.min(queue.poll(), queue.poll());
                return sum;
            }
            a = queue.poll();
            b = queue.poll();
            c = queue.poll();
            queue.add(b);
            a--;
            c--;
            sum+=1;
            if (a != 0) queue.add(a);
            if (c != 0) queue.add(c);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(maximumScore(1,8,8));
    }
}

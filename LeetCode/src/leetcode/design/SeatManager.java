package leetcode.design;

import java.util.PriorityQueue;
import java.util.Queue;

public class SeatManager {

    private final Queue<Integer> queue;

    public SeatManager(int n) {
        queue = new PriorityQueue<>();
        for (int i = 1; i <= n; i++) queue.offer(i);
    }

    public int reserve() {
        System.out.println(queue);
        if (!queue.isEmpty()) return queue.poll();
        return 0;
    }

    public void unreserve(int seatNumber) {
        queue.offer(seatNumber);
    }

    public static void main(String[] args) {
        SeatManager manager = new SeatManager(5);
        System.out.println(manager.reserve());
        System.out.println(manager.reserve());
        System.out.println(manager.reserve());
        manager.unreserve(1);
        manager.unreserve(2);
    }
}

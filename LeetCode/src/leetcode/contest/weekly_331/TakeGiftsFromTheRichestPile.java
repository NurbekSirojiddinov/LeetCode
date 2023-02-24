package leetcode.contest.weekly_331;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TakeGiftsFromTheRichestPile {
    public static long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int gift : gifts) {
            pq.add(gift);
        }
        System.out.println(pq);
        while (k != 0 && !pq.isEmpty()) {
            double gift = pq.poll();
            pq.add((int) Math.sqrt(gift));
            k--;
        }
        long sum = 0;

        while (!pq.isEmpty()) {
            sum += pq.poll();
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(pickGifts(new int[]{25, 64, 9, 4, 100}, 4));
    }
}

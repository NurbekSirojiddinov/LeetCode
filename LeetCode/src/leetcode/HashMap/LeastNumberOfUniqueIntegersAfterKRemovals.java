package leetcode.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class LeastNumberOfUniqueIntegersAfterKRemovals {
    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Integer> queue = new PriorityQueue<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.offer(entry.getValue());
        }

        while (k >= 1 && !queue.isEmpty()) {
            int a = queue.peek();
            queue.poll();
            if (a > 1) {
                queue.offer(--a);
            }
            k--;
        }
        return queue.size();
    }

    public static void main(String[] args) {
        System.out.println(findLeastNumOfUniqueInts(new int[]{4, 3, 1, 1, 3, 3, 2}, 3));
    }
}

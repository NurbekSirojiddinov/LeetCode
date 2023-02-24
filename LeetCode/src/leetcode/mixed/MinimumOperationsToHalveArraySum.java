package leetcode.mixed;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinimumOperationsToHalveArraySum {
    public static void main(String[] args) {

        System.out.println(halveArray(new int[]{1}));
    }
    private static int halveArray(int[] nums) {

        PriorityQueue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        double sum = 0;
        int counter = 0;

        for(double i : nums) {
            queue.add(i);
            sum += i;
        }sum = sum / 2;
        double num;

        while (true) {
            num = queue.remove() / 2;
            queue.add(num);
            sum -= num;
            counter++;
            if (sum < 0) {
                return counter;
            }
        }
    }
}

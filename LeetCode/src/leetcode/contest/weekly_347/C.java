package leetcode.contest.weekly_347;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class C {
    public long maxStrength(int[] nums) {
        long ans = 1;

        Arrays.sort(nums);
        int ind = 0;
        int count = 0;

        if (nums.length == 1) {
            return nums[nums.length - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                ans *= nums[i];
            }
            if (nums[i] < 0) {
                ind = i;
                count++;
            }
        }
        if (nums[nums.length - 1] == 0 && count <= 1) {
            return 0;
        }
        if (count % 2 == 1) {
            ans = ans / nums[ind];
        }

        return ans;
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(3);
        queue.add(8);
        queue.add(5);
        queue.add(7);

        System.out.println(queue);
    }
}


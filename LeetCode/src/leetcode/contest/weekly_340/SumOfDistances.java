package leetcode.contest.weekly_340;

import java.util.*;

public class SumOfDistances {
    public static long[] distance(int[] nums) {
        long[] arr = new long[nums.length];
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>(List.of(i)));
            } else {
                map.get(nums[i]).add(i);
            }
        }
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int counter = 0;
            long prefSum = 0;
            long sum = 0;
            int size = entry.getValue().size();

            for (int num : entry.getValue()) {
                sum += num;
            }
            for (int num : entry.getValue()) {
                long l = (long) counter * num;
                long r = Math.abs((sum - (prefSum + num)) - (long) (size - (counter + 1)) *num);
                arr[num] = l - prefSum + r;
                counter++;
                prefSum += num;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(distance(new int[]{1, 3, 1, 1, 2})));
    }
}

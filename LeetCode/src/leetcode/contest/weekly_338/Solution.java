package leetcode.contest.weekly_338;

import java.util.*;
//[47,50,97,58,87,72,41,63,41,51,17,21,7,100,69,66,79,92,84,9,57,26,26,28,83,38]
//[50,84,76,41,64,82,20,22,64,7,38,92,39,28,22,3]

public class Solution {
    public static List<Long> minOperations(int[] nums, int[] queries) {
        Map<Integer, Long> map = new HashMap<>();
        Arrays.sort(nums);
        long sum = 0;
        List<Long> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            map.put(i, sum);
        }

        for (int query : queries) {

            int j = search(nums, query);
            if (j == -1) {
                ans.add(sum - (long) nums.length * query);
                continue;
            }
            long a = (long) (j + 1) * query;
            long sum1 = a - map.get(j);
            long sum2 = (sum - map.get(j)) - (long) (nums.length - j - 1) * query;
            ans.add(sum1 + sum2);
        }
        return ans;


    }

    private static int search(int[] nums, int num) {
        int l = 0;
        int r = nums.length - 1;
        int index = -1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (nums[mid] == num) {
                return mid;
            }
            if (nums[mid] < num) {
                l = mid + 1;
                index = mid;
            } else {
                r = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{47, 50, 97, 58, 87, 72, 41, 63, 41, 51, 17, 21, 7, 100, 69, 66, 79, 92, 84, 9, 57, 26, 26, 28, 83, 38}, new int[]{3}));
    }
}

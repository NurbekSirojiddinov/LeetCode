package leetcode.mixed;

import java.util.HashMap;
import java.util.Map;

public class CountTheNumberOfGoodSubarrays {
    public static long countGood(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Long> map2 = new HashMap<>();
        int index = 0;
        long sum = 0;
        long goods = 0;

        for (int i = 0; i < nums.length; i++) {
            goods = getGoods(nums, map, map2, i, goods);

            if (goods >= k) {
                sum += nums.length - i;
                goods -= map.get(nums[index]) - 1;
                if (goods >= k) sum++;
                map2.put(nums[index], map2.get(nums[index]) - map.get(nums[index]) + 1);
                map.put(nums[index], map.get(nums[index]) - 1);
                index++;
                if (i == nums.length - 1) {
                    while (index <= i) {
                        goods = getGoods(nums, map, map2, index, goods);
                        if (goods >= k) sum++;
                        else return sum;
                        index++;
                    }
                }
            }
        }
        return sum;
    }

    private static long getGoods(int[] nums, Map<Integer, Integer> map, Map<Integer, Long> map2, int index, long goods) {
        map.put(nums[index], map.getOrDefault(nums[index], 0) + 1);
        int number1 = map.get(nums[index]);
        if (map2.containsKey(nums[index])) {
            goods -= map2.get(nums[index]);
        }
        map2.put(nums[index], (long) (number1) * (number1 - 1) / 2);
        goods += map2.get(nums[index]);
        return goods;
    }

    public static void main(String[] args) {
        System.out.println(countGood(new int[]{2,3,2,3,1,1,3,3,2,1,2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 10));
        //2, 3, 1, 3, 2, 3, 3, 3, 1, 1, 3
        //3, 1, 3, 2, 3, 3, 3, 1, 1, 3,2

    }
}

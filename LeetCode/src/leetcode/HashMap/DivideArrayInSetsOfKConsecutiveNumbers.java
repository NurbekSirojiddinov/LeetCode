package leetcode.HashMap;

import java.util.*;

public class DivideArrayInSetsOfKConsecutiveNumbers {
    public static boolean isPossibleDivide(int[] nums, int k) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int counter = 1;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            list.add(num);
        }
        int index = 0;
        int number = list.get(index);

        while (true) {
            if (map.containsKey(number)) {
                map.put(number, map.get(number) - 1);
                if (map.get(number) == 0) map.remove(number);
            } else  {
                index++;
                number = list.get(index);
                continue;
            }
            if (counter < k && map.containsKey(number + 1)) {
                number++;
                counter++;
            } else {
                if (counter == k) {
                    counter = 1;
                    index++;
                    number = list.get(index);
                } else if (index >= list.size() || counter < k) {
                    return false;
                }
            }

            if (map.size() == 0) {
                return true;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isPossibleDivide(new int[]{5,7,8,8,7,4,3,6}, 1));
    }
}

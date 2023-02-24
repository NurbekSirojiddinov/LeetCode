package leetcode.hashMap;

import java.util.*;

public class MaxSumOfAPairWithEqualSumOfDigits {
    public static int maximumSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxVal = -1;

        for (int num : nums) {
            int digitSum = getDigitsSum(num);
            if (map.containsKey(digitSum)) {
                int number = map.get(digitSum);
                maxVal = Math.max(maxVal, number + num);
                if (number < num) {
                    map.put(digitSum, num);
                }
            } else {
                map.put(digitSum, num);
            }
        }
        return maxVal;
    }

    private static int getDigitsSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(maximumSum(new int[]{18, 43, 36, 13, 7}));
    }
}

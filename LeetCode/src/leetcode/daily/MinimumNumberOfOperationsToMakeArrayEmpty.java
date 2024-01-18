package leetcode.daily;

import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfOperationsToMakeArrayEmpty {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int res = 0;

        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        for (int num : mp.keySet()) {
            int val = mp.get(num);

            if (val == 1) {
                return -1;
            }
            if (val % 3 == 0) {
                res += val / 3;
            } else {
                res += val / 3 - 1 + (val - (val / 3 - 1) * 3) / 2;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(new MinimumNumberOfOperationsToMakeArrayEmpty().minOperations(new int[]{1, 1, 1, 1}));
    }
}

package leetcode.hashMap;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfNiceSubarrays {
    private static int numberOfSubarrays(int[] nums, int k) {
        int low, high, highEven;
        int lowEven = 0;
        int odds = 0;
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                odds++;
                map.put(odds, i);
            }
        }
        if (map.size() == 0 || odds < k) return 0;
        low = map.get(1);
        int lowNum = 1;
        high = map.get(k);

        while (true) {
            highEven = map.containsKey(lowNum + k) ? map.get(lowNum + k) - 1 : nums.length - 1;
            ans += (low - lowEven + 1) * (highEven - high + 1);
            lowEven = low + 1;
            lowNum++;
            if (map.containsKey(lowNum + k - 1)) {
                low = map.get(lowNum);
                high = map.get(lowNum + k - 1);
            } else {
                return ans;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(numberOfSubarrays(new int[]{1, 1, 1, 1, 1}, 1));
        System.out.println(numberOfSubarrays(new int[]{2, 2, 1, 2, 2, 1, 2, 2, 2}, 3));
    }
}

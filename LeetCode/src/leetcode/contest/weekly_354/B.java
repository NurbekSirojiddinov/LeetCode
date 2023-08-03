package leetcode.contest.weekly_354;

import java.util.*;

public class B {

    public static int maximumBeauty(int[] nums, int k) {
        int res = 1;
        Map<Integer, Integer> mp = new HashMap<>();
        Set<Integer> st = new HashSet<>();
        st.add(nums[0]);
        mp.put(nums[0], 1);

        for(int i = 1; i < nums.length; i++) {
            int min = nums[i] - k;
            int max = nums[i] + k;

            for(Integer num : st) {
                if(num >= min && num <= max) {
                    mp.put(num, mp.get(num) + 1);
                    res = Math.max(res, mp.get(num));
                }
            }
            if(!mp.containsKey(nums[i])) mp.put(nums[i], 1);
            st.add(nums[i]);
            res = Math.max(mp.get(nums[i]), res);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(maximumBeauty(new int[]{49, 26}, 12));
    }
}

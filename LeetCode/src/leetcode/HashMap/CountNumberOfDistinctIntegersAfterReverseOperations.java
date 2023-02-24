package leetcode.HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountNumberOfDistinctIntegersAfterReverseOperations {
    public static int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(Integer.parseInt(new StringBuilder().append(num).reverse().toString()));
            set.add(num);
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(countDistinctIntegers(new int[]{1, 2, 3, 4}));
    }
}

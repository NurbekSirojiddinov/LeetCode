package leetcode.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class ReductionOperationsToMakeTheArrayElementsEqual {
    public static int reductionOperations(int[] nums) {

        Arrays.sort(nums);

        Map<Integer, Integer> treeMap = new TreeMap<>(Comparator.reverseOrder());
        int min = nums[0];
        int temp = 0;
        int operations = 0;

        for (int num : nums) {
            treeMap.put(num, treeMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            if (entry.getKey() != min) {
                temp += entry.getValue();
                operations += temp;
            }
        }
        return operations;
    }
    public static void main(String[] args) {
        System.out.println(reductionOperations(new int[]{1, 1, 2, 2, 3}));
    }
}

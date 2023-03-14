package leetcode.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortArrayByIncreasingFrequency {
    public int[] frequencySort(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Frequency[] frequencies = new Frequency[map.size()];
        int[] res = new int[nums.length];
        int index = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            frequencies[index++] = new Frequency(entry.getKey(), entry.getValue());
        }
        index = 0;

        Arrays.sort(frequencies, Comparator.comparing(Frequency::getFrequency).thenComparing(Frequency::getValue));
        System.out.println(Arrays.toString(frequencies));

        for (Frequency frequency : frequencies) {
            for (int i = 0; i < frequency.getFrequency(); i++) {
                res[index++] = frequency.getValue();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        SortArrayByIncreasingFrequency sortArrayByIncreasingFrequency = new SortArrayByIncreasingFrequency();
        System.out.println(Arrays.toString(sortArrayByIncreasingFrequency.frequencySort(new int[]{1, 1, 2, 2, 2, 3})));
    }
}

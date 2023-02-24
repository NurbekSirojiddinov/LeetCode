package leetcode.mixed;

import java.util.HashMap;
import java.util.Map;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {41, 16, 65, 7, 56, 5, 64, 14, 67, 2, 3, 20, -10, 25, -8, 10, 2, 59, 9, 6, 43, 4, 22, 50, 41, 37, 5, 21, -2, 34, 34, 60, 22, 6, 4, 27, 1, 61, 45, 38, 31, 62, 63, -10, 4, 60, 21, 4, 4, 33, 40, 26, 16, 34, 51, 1, 5, 10, 20, -1, 54, 44, 3, 21, 63, 40, 4, 4};
        System.out.println(firstMissingPositive(nums));
    }

    private static int firstMissingPositive(int[] nums) {

        int missingNum = 1;
        Map<Integer, Integer> map = new HashMap<>();
        int a = 0;

        for (int i : nums) {
            if (i > 0) {
                if (!map.containsKey(i)) {
                    map.put(i, 1);
                }
            }
        }
        for (int i = 1; i <= map.size()+1; i++) {
            if (!map.containsKey(missingNum)){
                return missingNum;
            }
            missingNum++;
        }
        return missingNum;
    }
}

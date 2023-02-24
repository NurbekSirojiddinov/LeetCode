package leetcode.contest.biweekly_97;

import java.util.HashSet;
import java.util.Set;

public class MaximumNumberOfIntegersToChooseFromARangeI {
    public static int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        int counter = 0;

        for (int num : banned) set.add(num);

        for (int i = 1; i < n; i++) {
            if (!set.contains(i)) {
                sum += i;
                counter++;
                if (maxSum <= sum) {
                    return --counter;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(maxCount(new int[]{11}, 7, 54));
    }
}

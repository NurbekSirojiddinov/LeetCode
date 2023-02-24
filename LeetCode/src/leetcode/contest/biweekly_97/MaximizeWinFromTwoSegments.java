package leetcode.contest.biweekly_97;

import java.util.HashMap;
import java.util.Map;

public class MaximizeWinFromTwoSegments {
    public static int maximizeWin(int[] prizePositions, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < prizePositions.length; i++) {
            map.put(prizePositions[i], i);
            map2.put(prizePositions[i], map2.getOrDefault(prizePositions[i], 0) + 1);
        }
        int[] arr = new int[map.size()];
        arr[0] = prizePositions[0];
        int index = 0;
        int firstLarge = 0;
        int secondLarge = 0;

        for (int i = 1; i < prizePositions.length; i++) {
            if (arr[index] != prizePositions[i]) {
                index++;
                arr[index] = prizePositions[i];
            }
        }

        int index1 = 0;
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j < arr.length && arr[j] - arr[i] != k) {
                j++;
            }
            if (j < arr.length) {
                //int sum = map.get(arr[i]) - map2.get(arr[i]) + 2 + map.get(arr[i + k]);
                int sum = map.get(arr[j]) - (map.get(arr[i]) - map2.get(arr[i]) + 1) + 1;
                if (sum >= firstLarge) {
                    secondLarge = firstLarge;
                    firstLarge = sum;
                    index1 = map.get(j);
                } else {
                    secondLarge = Math.max(secondLarge, sum);
                    if (index1 == j) secondLarge -= map2.get(j);
                }
            }
        }

        return firstLarge + secondLarge;
    }

    public static void main(String[] args) {
        System.out.println(maximizeWin(new int[]{1, 1, 2, 2, 3, 3, 5}, 2));
    }
}

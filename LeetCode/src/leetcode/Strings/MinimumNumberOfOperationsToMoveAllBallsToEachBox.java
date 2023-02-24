package leetcode.Strings;

import java.util.Arrays;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    public static int[] minOperations(String boxes) {
        int ones = 0;
        int sum = 0;
        int leftOnes = 0;
        int leftSum = 0;
        int[] ans = new int[boxes.length()];

        for (int i = 0; i < boxes.length(); i++) {
            if (boxes.charAt(i) == '1') {
                ones++;
                sum += i;
            }
        }

        for (int i = 0; i < boxes.length(); i++) {
            if (boxes.charAt(i) == '1') {
                sum -= i;
                ones--;
                ans[i] = (i * leftOnes - leftSum) + (sum - i * (ones));
                leftOnes++;
                leftSum += i;
            } else {
                ans[i] = (i * leftOnes - leftSum) + (sum - i * ones);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(minOperations("001011")));
    }
}

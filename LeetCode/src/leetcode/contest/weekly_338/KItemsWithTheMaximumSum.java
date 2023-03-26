package leetcode.contest.weekly_338;

public class KItemsWithTheMaximumSum {
    public static int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (numOnes + numZeros >= k) {
            return Math.min(numOnes, k);
        } else {
            return 2 * numOnes + numZeros - k;
        }
    }

    public static void main(String[] args) {
        System.out.println(kItemsWithMaximumSum(3, 2, 1, 2));
    }
}

package leetcode.contest.beweekly_01_21_2023;

public class MinimumOperationsToMakeArrayEqualII {
    public static long minOperations(int[] nums1, int[] nums2, int k) {
        long sum1 = 0;
        long sum2 = 0;

        for (int i = 0; i < nums1.length; i++) {
            if (k != 0 && Math.abs(nums1[i] - nums2[i]) % k != 0) return -1;
            if (nums1[i] > nums2[i]) {
                sum1 += nums1[i] - nums2[i];
            } else if (nums1[i] < nums2[i]) {
                sum2 += nums2[i] - nums1[i];
            }
        }
        if (sum1 == 0 && sum2 == 0) return 0;
        if (k == 0) return -1;
        if (sum1 == sum2 && sum1 % k == 0) return sum1 / k;
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{1, 1, 1}, new int[]{1, 1, 1}, 2));
    }
}

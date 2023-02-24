package leetcode.contest.beweekly_01_21_2023;

public class MinimumCommonValue {
    public static int getCommon(int[] nums1, int[] nums2) {
        int index = 0;
        int index2 = 0;

        while (index < nums1.length && index2 < nums2.length) {
            if (nums1[index] == nums2[index2]) {
                return nums1[index];
            } else if (nums1[index] > nums2[index2]) {
                index2++;
            } else if (nums1[index] < nums2[index2]) {
                index++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getCommon(new int[]{1, 2}, new int[]{6, 7, 8, 9}));
    }
}

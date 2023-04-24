package leetcode.arrays;

public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secondMax = firstMax;
        long thirdMax = firstMax;

        for (int num : nums) {
            if (firstMax < num) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (firstMax != num && secondMax < num) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (firstMax != num && secondMax != num && thirdMax < num) {
                thirdMax = num;
            }
        }
        return (int) (thirdMax == Long.MIN_VALUE ? firstMax : thirdMax);
    }

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{1, 2, -2147483648}));
    }
}

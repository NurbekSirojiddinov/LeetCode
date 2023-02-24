package leetcode.contest.weekly_332;

public class FindTheArrayConcatenationValue {
    public static long findTheArrayConcVal(int[] nums) {
        long concatenationValue = 0;
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            if (i == j) {
                concatenationValue += nums[i];
                return concatenationValue;
            }
            concatenationValue += Long.parseLong(String.valueOf(nums[i]) + nums[j]);
            i++;
            j--;
        }
        return concatenationValue;
    }

    public static void main(String[] args) {
        System.out.println(findTheArrayConcVal(new int[]{12}));
    }
}

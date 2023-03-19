package leetcode.contest.weekly_337;

import java.util.Arrays;

public class SmallestMissingNonNegativeInteger {
    public static int findSmallestInteger(int[] nums, int value) {
        int missingNum = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] >= value) {
                nums[i] = nums[i] % value;
            } else if(nums[i] < 0) {
                int num = (nums[i] * (-1)) % value;
                if(num == 0) {
                    nums[i]= 0;
                }else {
                    nums[i] = value- num;
                }
            }
        }
        Arrays.sort(nums);

        for (int num : nums) {
            if (num != missingNum) {
                return missingNum;
            }
            missingNum++;
        }
        return missingNum;
    }

    public static void main(String[] args) {
        System.out.println(findSmallestInteger(new int[]{1,-10,7,13,6,8}, 5));
    }
}

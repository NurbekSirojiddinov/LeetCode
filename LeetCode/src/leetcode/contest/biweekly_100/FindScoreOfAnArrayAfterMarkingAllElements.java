package leetcode.contest.biweekly_100;

public class FindScoreOfAnArrayAfterMarkingAllElements {
    public static long findScore(int[] nums) {
        long sum = 0;
        int i = 0;
        if (i + 2 < nums.length) {
            if (nums[i] > nums[i + 1] && nums[i + 1] <= nums[i + 2]) {
                sum += nums[i + 1];
                i = i + 3;
            } else if (nums[i + 2] < nums[i + 1] && nums[i + 2] < nums[i]) {
                sum += nums[i + 2];
                i = i + 4;
            } else {
                sum += nums[i];
                i += 2;
            }
        }

        while (i < nums.length) {
            if (i + 2 < nums.length) {
                if (nums[i] <= nums[i + 1] && nums[i] <= nums[i + 2]) {
                    sum += nums[i];
                    i = i + 2;
                } else if (nums[i + 1] < nums[i] && nums[i + 1] <= nums[i + 2]) {
                    sum += nums[i + 1];
                    i = i + 3;
                } else {
                    sum += nums[i + 2];
                    i = i + 4;
                }
            } else if (i + 1 < nums.length) {
                sum += Math.min(nums[i], nums[i + 1]);
                break;
            } else {
                sum += nums[i];
                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(findScore(new int[]{2, 1, 3, 4, 5, 2}));
    }
}

package leetcode.contest.biweekly_108;

public class A {
    public static int alternatingSubarray(int[] nums) {
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            int index = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if ((index % 2 == 0 && nums[j] - nums[j - 1] != -1) || (index % 2 == 1 && nums[j] - nums[j - 1] != 1)) {
                    res = Math.max(j - i, res);
                    break;
                }
                if (j == nums.length - 1) res = Math.max(j - i + 1, res);

                index++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(alternatingSubarray(new int[]{2,3,4,3,4}));
        System.out.println(alternatingSubarray(new int[]{4,5,6}));
    }
}

package leetcode.arrays;

public class RangeSumQuery {
    int[] nums;
    int sum = 0;

    public RangeSumQuery(int[] nums) {
        this.nums = nums;
    }

    public void update(int index, int val) {
        nums[index] = val;
    }

    public int sumRange(int left, int right) {
        for(int i = left; i <= right; i++) {
            sum += nums[i];
        }
        return sum;
    }
}


package leetcode.Arrays;

public class NumArray {
    public static void main(String[] args) {
        RangeSumQuery rangeSumQuery = new RangeSumQuery(new int[]{1, 3, 5});
        rangeSumQuery.update(1, 2);
        int param1 = rangeSumQuery.sumRange(0, 2);
        System.out.println(param1);
    }
}

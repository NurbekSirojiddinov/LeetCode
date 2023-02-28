package leetcode.arrays;

public class CountNegativeNumbersInASortedMatrix {
    public static int countNegatives(int[][] grid) {
        int res = 0;
        for (int[] arr : grid) {
            res += search(arr);
        }
        return res;
    }

    public static int search(int[] arr) {
        int ans = 0;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int midIndex = (left + right) / 2;

            if (arr[midIndex] < 0) {
                ans = arr.length - midIndex;
                right = midIndex;
            } else if (arr[midIndex] >= 0) {
                left = midIndex + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countNegatives(new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}}));
    }
}

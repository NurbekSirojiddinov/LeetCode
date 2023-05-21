package leetcode.contest.weekly_346;

public class C {
    public static int punishmentNumber(int n) {
        int sum = 0;
        int i = 1;

        while (i <= n) {
            int[] arr = new int[String.valueOf(i * i).length()];
            int k = arr.length - 1;
            int num = i * i;
            while (num != 0) {
                arr[k--] = num % 10;
                num = num / 10;
            }
            if (findSum(arr, i , 0, 0)) {
                sum += i * i;
            }
            i++;
        }
        return sum;
    }

    private static boolean findSum(int[] array, int target, int start, int currSum) {
        if (currSum == target) {
            return true;
        }
        if (currSum > target || start >= array.length) {
            return false;
        }
        for (int i = start; i < array.length; i++) {
            currSum += array[i];
            if (findSum(array, target, i + 1, currSum)) {
                return true;
            }
            currSum -= array[i];
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(punishmentNumber(37));
    }
}

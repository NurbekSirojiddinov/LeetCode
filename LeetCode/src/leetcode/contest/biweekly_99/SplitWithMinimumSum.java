package leetcode.contest.biweekly_99;

import java.util.Arrays;

public class SplitWithMinimumSum {
    public static int splitNum(int num) {

        int[] arr = new int[String.valueOf(num).length()];
        int index = 0;
        int num1 = 0;
        int num2 = 0;

        while (num != 0) {
            arr[index++] = num % 10;
            num = num / 10;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int j = 0;
        while (j < arr.length) {
            if (arr[j] == 0) {
                j++;
            } else {
                num1 = num1 * 10 + arr[j++];
                if (j == arr.length) break;
                num2 = num2 * 10 + arr[j++];
            }
        }
        System.out.println(Arrays.toString(arr));
        return num1 + num2;
    }

    public static void main(String[] args) {
        System.out.println(splitNum(958351976));
    }
}

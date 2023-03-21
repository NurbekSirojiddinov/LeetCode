package leetcode.sorting;

import java.util.Arrays;

public class LargestNumberAfterDigitSwapsByParity {
    public static int largestInteger(int num) {

        int[] digits = new int[10];
        int res = 0;
        String string = String.valueOf(num);
        int i = 0;
        int i2 = 9;

        Arrays.fill(digits, -1);
        while (num != 0) {
            digits[i++] = num % 10;
            num /= 10;
        }
        i = 9;
        Arrays.sort(digits);

        for (int j = 0; j < string.length(); j++) {
            int number = Integer.parseInt(String.valueOf(string.charAt(j)));
            if (number % 2 == 0) {
                while (i >= 0 && digits[i] % 2 != 0) {
                    i--;
                }
                if (i >= 0) {
                    res = res * 10 + digits[i];
                    i--;
                }
            } else {
                while (i2 >= 0 && digits[i2] % 2 != 1){
                    i2--;
                }
                if (i2 >= 0) {
                    res = res * 10 + digits[i2];
                    i2--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(largestInteger(1234));
    }
}

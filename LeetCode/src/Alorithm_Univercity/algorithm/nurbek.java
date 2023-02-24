package Alorithm_Univercity.algorithm;

import java.util.Arrays;

public class nurbek {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {-5, -6, -7, 8},
                {1, 2, 3, 4,},
                {-2, -6, -7, 9}};
        System.out.println(Arrays.toString(calculate(array)));
    }

    private static int[] calculate(int[][] array) {
        int n = array[0].length;
        int m = array.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int sum = 1;
            int counter = 0;
            for (int j = 0; j < m; j++) {
                if (array[j][i] < 0) {
                    sum *= array[j][i];
                    counter++;
                }
            }
            if (counter == 0) {
                result[i] = 0;
            } else {
                result[i] = sum;
            }
        }
        return result;
    }
}

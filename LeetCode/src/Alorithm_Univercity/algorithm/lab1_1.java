package Alorithm_Univercity.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class lab1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        System.out.println(Arrays.toString(solve(row, column)));
    }

    private static int[] solve(int row, int column) {
        Scanner scanner = new Scanner(System.in);
        int[] result = new int[column];
        int[][] matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < column; i++) {
            int num = 1;
            for (int j = 0; j < row; j++) {
                if (matrix[j][i] % 2 == 0) {
                    num *= matrix[j][i];
                }
            } if (num == 1) num = 0;
            result[i] = num;
        }
        return result;
    }
}

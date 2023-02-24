package Alorithm_Univercity.paradigm.amaliy5;

import java.util.Arrays;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("massive dagi qatorlar sonini kiriting");
        int row = scanner.nextInt();
        System.out.println("massive dagi ustun sonini kiriting");
        int column = scanner.nextInt();
        int[][] array = new int[row][column];
        var counter = 0;
        var min = Math.min(row, column);
        var max = Math.max(row, column);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] =-1000+ (int) (Math.random() * 2001);
                if (array[i][j] >= min && array[i][j] <= max) {
                    counter++;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println(counter);
    }
}

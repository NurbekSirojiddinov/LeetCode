package Alorithm_Univercity.algorithm;

public class QirralarSoniniTopish {
    private static int find(int[][] matrix) {
        int counter = 0;

        for (int[] ints : matrix) {
            for (int i1 = 0; i1 < matrix[0].length; i1++) {
                if (ints[i1] != 0) {
                    counter++;
                }
            }
        }
        return counter / 2;
    }

    public static void main(String[] args) {
        int[][] cost = {
                {0, 6, 0, 0, 7, 11},
                {6, 0, 10, 0, 0, 0},
                {0, 10, 0, 12, 0, 9},
                {0, 0, 12, 0, 10, 8},
                {7, 0, 0, 10, 0, 0},
                {11, 0, 9, 8, 0, 0}};
        System.out.println(find(cost));
    }
}

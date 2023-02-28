package leetcode.arrays;

public class CountSquareSubmatricesWithAllOnes {
    public static int countSquares(int[][] matrix) {

        int ones = 1;
        int res = 0;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(j + ones > matrix[0].length) {
                    break;
                }
                if(isSquare(matrix, i,j, ones)) {
                    res++;
                }
            }
            if(i + ones >= matrix.length) {
                i = -1;
                ones++;
                if (ones > matrix.length) {
                    return res;
                }
            }
        }
        return res;
    }
    public static boolean isSquare(int[][] matrix, int rowIndex, int colIndex, int numberOfOnes) {
        for(int i = rowIndex; i < rowIndex + numberOfOnes; i++) {
            for(int j = colIndex; j < colIndex + numberOfOnes; j++) {
                if(matrix[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(countSquares(new int[][]{{0,1,1,1},{1,1,1,1},{0,1,1,1}}));
    }
}

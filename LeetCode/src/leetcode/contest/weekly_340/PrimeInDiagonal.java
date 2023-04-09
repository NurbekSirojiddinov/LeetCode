package leetcode.contest.weekly_340;

import java.util.Arrays;

public class PrimeInDiagonal {
    public int diagonalPrime(int[][] nums) {
        int[] diagonals = new int[2 * nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            diagonals[index++] = nums[i][i];
            diagonals[index++] = nums[i][nums.length - i - 1];
        }

        Arrays.sort(diagonals);

        for (int i = diagonals.length - 1; i >= 0; i--) {
            if (isPrime(diagonals[i])) {
                return diagonals[i];
            }
        }
        return 0;
    }

    public boolean isPrime(int number) {
        int root = (int) Math.sqrt(number);
        if (number == 1) return false;

        for (int i = 2; i <= root; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeInDiagonal prime = new PrimeInDiagonal();
        System.out.println(prime.diagonalPrime(new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 11}}));
    }
}

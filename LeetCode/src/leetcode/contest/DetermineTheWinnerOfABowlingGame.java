package leetcode.contest;

public class DetermineTheWinnerOfABowlingGame {
    public int isWinner(int[] player1, int[] player2) {
        int firstSum = 0;
        int secondSum = 0;
        int i = 0;

        while (i < player1.length) {
            if (i == 1) {
                if (player1[i - 1] == 10) {
                    firstSum += 2 * player1[i];
                } else {
                    firstSum += player1[i];
                }

                if (player2[i - 1] == 10) {
                    secondSum += 2 * player2[i];
                } else {
                    secondSum += player2[i];
                }
            }
            if (i - 2 >= 0) {
                if (player1[i - 1] == 10 || player1[i - 2] == 10) {
                    firstSum += 2 * player1[i];
                } else {
                    firstSum += player1[i];
                }
                if (player2[i - 1] == 10 || player2[i - 2] == 10) {
                    secondSum += 2 * player2[i];
                } else {
                    secondSum += player2[i];
                }
            } else {
                firstSum += player1[i];
                secondSum += player2[i];
            }
            i++;
        }
        if (firstSum > secondSum) {
            return 1;
        } else if (firstSum < secondSum) {
            return 2;
        }
        return 1;
    }
}

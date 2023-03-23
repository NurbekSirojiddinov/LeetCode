package leetcode.sorting;

import java.util.Arrays;

public class MaximumMatchingOfPlayersWithTrainers {
    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {

        Arrays.sort(players);
        Arrays.sort(trainers);

        int pIndex = 0;
        int tIndex = 0;
        int numberOfMatching = 0;

        while (pIndex < players.length && tIndex < trainers.length) {
            if (players[pIndex] <= trainers[tIndex]) {
                pIndex++;
                numberOfMatching++;
            }
            tIndex++;
        }
        return numberOfMatching;
    }

    public static void main(String[] args) {
        System.out.println(matchPlayersAndTrainers(new int[]{4, 7, 9}, new int[]{8, 2, 5, 8}));
    }
}

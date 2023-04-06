package leetcode.greedy;

import java.util.Arrays;

public class MaximumNumberOfGroupsEnteringACompetition {
    public static int maximumGroups(int[] grades) {
        Arrays.sort(grades);

        int groups = 1;
        int prevStudents = 1;
        int prevSum = grades[0];
        int currSum = 0;
        int currStudents = 0;

        for (int i = 1; i < grades.length; i++) {
            currSum += grades[i];
            currStudents++;
            if (currStudents > prevStudents && currSum > prevSum) {
                prevStudents = currStudents;
                prevSum = currSum;
                currStudents = 0;
                currSum = 0;
                groups++;
            }
        }
        return groups;
    }

    public static void main(String[] args) {
        System.out.println(maximumGroups(new int[]{1, 2, 3, 4, 5}));
    }
}

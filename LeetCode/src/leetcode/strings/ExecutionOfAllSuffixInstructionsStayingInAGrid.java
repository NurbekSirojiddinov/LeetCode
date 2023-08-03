package leetcode.strings;

import java.util.Arrays;

public class ExecutionOfAllSuffixInstructionsStayingInAGrid {
    public static int[] executeInstructions(int m, int[] startPos, String s) {
        int n = s.length();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            int row = startPos[0];
            int col = startPos[1];
            for (int j = i; j < n; j++) {
                if (s.charAt(j) == 'R') col++;
                else if (s.charAt(j) == 'L') col--;
                else if (s.charAt(j) == 'U') row--;
                else row++;
                count++;
                if (col == m || col == -1 || row == -1 || row == m) {
                    count--;
                    break;
                }
            }
            arr[i] = count;
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(executeInstructions(3, new int[]{0, 1}, "RRDDLU")));
    }
}

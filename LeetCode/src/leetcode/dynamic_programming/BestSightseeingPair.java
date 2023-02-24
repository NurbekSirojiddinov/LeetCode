package leetcode.dynamic_programming;

public class BestSightseeingPair {
    private static int maxScoreSightseeingPair(int[] values) {
        int maxVal = Math.max(values[0], values[1]);
        int maxIndex = 0;
        int minIndex = 1;
        if (maxVal == values[1]) {
            maxIndex = 1;
            minIndex = 0;
        }
        int maxScore = values[0] + values[1] - 1;

        for (int i = 2; i < values.length; i++) {
            if (minIndex > maxIndex) {
                if (maxScore <= (maxVal + maxIndex + values[i] - i)) {
                    maxScore = maxVal + values[i] + maxIndex - i;
                    if (maxVal <= values[i]) {
                        minIndex = maxIndex;
                        maxVal = values[i];
                        maxIndex = i;
                    } else {
                        minIndex = i;
                    }
                }
            } else {
                if (maxScore <= (maxVal + values[i] + maxIndex - i)) {
                    maxScore = maxVal + values[i] + maxIndex - i;
                    if (maxVal <= values[i]) {
                        minIndex = maxIndex;
                        maxVal = values[i];
                        maxIndex = i;
                    } else {
                        minIndex = i;
                    }
                }
            }
        }
        return maxScore;
    }

    public static void main(String[] args) {
        System.out.println(maxScoreSightseeingPair(new int[]{2, 7, 7, 2, 1, 7, 10, 4, 3, 3}));
    }
}

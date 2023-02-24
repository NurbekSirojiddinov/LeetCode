package leetcode.mixed;

public class MinimumDominoRotationsForEqualRow {
    public static void main(String[] args) {

        int[] tops = {1, 2, 1, 1, 1, 2, 2, 2};
        int[] bottoms = {2, 1, 2, 2, 2, 2, 2, 2};
        System.out.println(minDominoRotations(tops, bottoms));
    }

    private static int minDominoRotations(int[] tops, int[] bottoms) {

        int min = 20000;
        min = getMin(tops, bottoms, min);
        int min2 = 20000;

        min2 = getMin(bottoms, tops , min2);
        return (Math.min(min, min2) != 20000) ? Math.min(min, min2) : -1;
    }

    private static int getMin(int[] tops, int[] bottoms, int min) {
        int counter;
        for (int i = 1; i <= 6; i++) {
            counter = 0;
            for (int j = 0; j < tops.length; j++) {
                if (tops[j] == i || bottoms[j] == i) {
                    if (tops[j] != i && bottoms[j] == i) {
                        counter++;
                    }
                } else {
                    counter = -1;
                    break;
                }
            }
            if (counter != -1) {
                min = Math.min(min, counter);
            }
        }
        return min;
    }
}

package leetcode.strings;

public class MinimumAmountOfTimeToCollectGarbage {
    public static int garbageCollection(String[] garbage, int[] travel) {
        int sum = 0;
        int m1 = 0;
        int p1 = 0;
        int g1 = 0;

        for (int i = 0; i < garbage.length; i++) {
            int m = 0;
            int p = 0;
            int g = 0;
            for (int j = 0; j < garbage[i].length(); j++) {
                if (garbage[i].charAt(j) == 'M') {
                    m++;
                } else if (garbage[i].charAt(j) == 'P') {
                    p++;
                } else if (garbage[i].charAt(j) == 'G') {
                    g++;
                }
            }
            if (i != 0) {
                m1 += travel[i - 1];
                p1 += travel[i - 1];
                g1 += travel[i - 1];
            }
            if (m != 0) {
                sum += m + m1;
                m1 = 0;

            }
            if (p != 0) {
                sum += p + p1;
                p1 = 0;
            }
            if (g != 0) {
                sum += g + g1;
                g1 = 0;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(garbageCollection(new String[]{"MMM","PGM","GP"}, new int[]{3,10}));
    }
}

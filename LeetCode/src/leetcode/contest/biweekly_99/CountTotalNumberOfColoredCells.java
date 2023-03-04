package leetcode.contest.biweekly_99;

public class CountTotalNumberOfColoredCells {
    public static long coloredCells(int n) {
        int len = (n - 1) * 2;
        long sum = 0;
        int first = 1;
        long sum1 = 1;
        int mid = (len) / 2 + 1;

        while(first < mid) {
            sum += sum1;
            first++;
            sum1+=2;
        }
        return sum * 2 + sum1;
    }

    public static void main(String[] args) {
        System.out.println(coloredCells(897));
        System.out.println(coloredCells(899));
    }
}

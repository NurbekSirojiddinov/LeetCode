package leetcode.Dynamic_Programming;

public class UglyNumberII {
    public static void main(String[] args) {

        int n = 13;

        System.out.println(nthUglyNumber(n));
    }

    private static int nthUglyNumber(int n) {

        int count = 1;
        int a = 2;
        int b = 3;
        int c = 5;
        int result = 0;

        while (count < n) {
            if (a <= b && a <= c) {
                if (result == a) count--;
                result = a;
                a += 2;
            } else if (b <= a && b <= c) {
                if (result == b) count--;
                result = b;
                b += 3;
            } else {
                if (result == c) count--;
                result = c;
                c += 5;
            }
            count++;
        }
        return result;
    }
}

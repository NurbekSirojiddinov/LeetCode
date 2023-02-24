package leetcode.dynamic_programming;

public class fibonacci {
    public static long fib(long n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        long[] array = new long[(int) (n + 1)];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 2] + array[i - 1];
        }

        return array[(int) n];
    }

    public static int fib1(int n) {
        if (n <= 1) return n;
        return fib1(n - 2) + fib1(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fib(150));
        System.out.println(fib1(60));
    }
}

package leetcode.dynamic_programming;

import java.util.HashMap;
import java.util.Map;

public class NthTribonacciNumber {

    static Map<Integer, Integer> memo = new HashMap<>();;
    public static int tribonacci(int n) {
        if (n <= 1) return n;
        if (n == 2) return 1;

        if (!memo.containsKey(n)) {
            memo.put(n, tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3));
        }

        return memo.get(n);
    }

    public static void main(String[] args) {
        System.out.println(tribonacci(2));
        System.out.println(tribonacci(1));
        System.out.println(tribonacci(0));
        System.out.println(tribonacci(3));
        System.out.println(tribonacci(37));
    }
}

package leetcode.contest.weekly_330;

import java.util.*;

public class CountDistinctNumbersOnBoard {
    public static int distinctIntegers(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                if (!list.contains(i)) {
                    list.add(i);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            for (int j = 2; j < num; j++) {
                if (num % j == 1 && !list.contains(j)) {
                    list.add(j);
                }
            }
        }


        return list.size() + 1;
    }
    public int monkeyMove(int n) {
        long sum = 0;
        int k = n * (n - 3) / 2;

        sum = (long) (Math.pow(2, n - 2) * k);


        return k;
    }

    public static void main(String[] args) {
        System.out.println(distinctIntegers(5));
        System.out.println(0 % 3);
    }
}

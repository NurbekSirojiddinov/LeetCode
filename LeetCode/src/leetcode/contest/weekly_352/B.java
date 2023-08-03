package leetcode.contest.weekly_352;

import java.util.ArrayList;
import java.util.List;

public class B {
    public static List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        int num = n / 2;

        for(int i = 1; i < num; i+= 2) {
            if(isPrime(i) && isPrime(n-i)) {
                l.add(i);
                l.add(n-i);
                list.add(l);
                l = new ArrayList<>();
            }
        }

        return list;
    }
    public static boolean isPrime(int n) {
        int i = 2;

        while(i * i <= n) {
            if(n % i == 0) return false;
            i++;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(findPrimePairs(10));
    }
}

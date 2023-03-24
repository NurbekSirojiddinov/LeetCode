package leetcode.sorting;

import java.util.*;

public class FairCandySwap {
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceCandies = Arrays.stream(aliceSizes).sum();
        int bobCandies = Arrays.stream(bobSizes).sum();
        int diff;

        if (aliceCandies > bobCandies) {
            diff = aliceCandies - bobCandies;
            return getAns( aliceSizes, bobSizes, diff);
        } else {
            diff = bobCandies - aliceCandies;
            int[] res = getAns( bobSizes, aliceSizes, diff);
            return new int[]{res[1], res[0]};

        }
    }

    //a > b
    public static int[] getAns( int[] a, int[] b, int diff) {
        Set<Integer> set = new HashSet<>();
        for (int candy : a) {
            set.add(candy);
        }

        for (int candy : b) {
            int expected = (diff + 2 * candy) / 2;
            if (set.contains(expected - (expected / 2))) {
                return new int[]{expected - expected / 2, candy};
            }
        }
        throw new NoSuchElementException();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fairCandySwap(new int[]{1,2}, new int[]{2,3})));
    }
}

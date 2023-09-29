package leetcode.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumCoinsHeroesCanCollect {
    public long[] maximumCoins(int[] heroes, int[] monsters, int[] coins) {
        long[] ans = new long[heroes.length];
        IndexValue[] indexValues = new IndexValue[heroes.length];
        IndexValue[] monstersValIndex = new IndexValue[monsters.length];
        int m = 0;

        for (int i = 0; i < heroes.length; i++) {
            indexValues[i] = new IndexValue(heroes[i], i);
        }

        for (int j = 0; j < monsters.length; j++) {
            monstersValIndex[j] = new IndexValue(monsters[j], j);
        }

        Arrays.sort(indexValues, Comparator.comparing(IndexValue::getVal));
        Arrays.sort(monstersValIndex, Comparator.comparing(IndexValue::getVal));

        for (int i = 0; i < heroes.length; i++) {
            long sum = 0;
            while (m < monsters.length && monstersValIndex[m].val <= indexValues[i].val) {
                sum += coins[monstersValIndex[m].index];
                m++;
            }
            if (i - 1 >= 0) sum += indexValues[i - 1].val;
            indexValues[i].val = sum;
            ans[indexValues[i].index] = sum;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] heroes = {1, 4, 2};
        int[] monsters = {1, 1, 5, 2, 3};
        int[] coins = {2, 3, 4, 5, 6};

        System.out.println(Arrays.toString(new MaximumCoinsHeroesCanCollect().maximumCoins(heroes, monsters, coins)));
    }
}

class IndexValue {
    long val;

    int index;

    public IndexValue(int val, int index) {
        this.val = val;
        this.index = index;
    }

    public long getVal() {
        return val;
    }

    public void setVal(long val) {
        this.val = val;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}

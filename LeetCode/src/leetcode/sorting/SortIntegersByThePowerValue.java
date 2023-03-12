package leetcode.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortIntegersByThePowerValue {
    Map<Integer, Integer> map = new HashMap<>();

    public int getKth(int lo, int hi, int k) {

        MyClass[] myClasses = new MyClass[hi - lo + 1];
        int[] res = new int[myClasses.length];
        int index = 0;

        while (lo <= hi) {
            myClasses[index++] = new MyClass(lo, getPower(lo));
            lo++;
        }
        Arrays.sort(myClasses, Comparator.comparing(MyClass::getSteps).thenComparing(MyClass::getNumber));

        for (int i = 0; i < myClasses.length; i++) {
            res[i] = myClasses[i].getNumber();
        }

        return res[k];

    }

    public int getPower(int n) {
        if (n == 1) return 0;

        if (map.containsKey(n)) return map.get(n);

        int power = 1 + ((n % 2 == 0) ? getPower(n / 2) : getPower((3 * n) + 1));

        map.put(n, power);

        return power;
    }

    public static void main(String[] args) {
        SortIntegersByThePowerValue integers = new SortIntegersByThePowerValue();
        System.out.println(integers.getKth(12, 15, 2));
    }
}

package leetcode.contest.weekly_344;

import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;

public class A {

    Map<Integer, Integer> map;
    Map<Integer, Integer> map2;

    public A() {
        this.map = new HashMap<>();
        this.map2 = new HashMap<>();
    }

    public void add(int number) {
        if (map.containsKey(number)) {
            int num = map.get(number);
            if (map2.get(num) == 1) {
                map2.remove(num);
            } else {
                map2.put(num, map2.get(num) - 1);
            }
        }
        map.put(number, map.getOrDefault(number, 0) + 1);
        map2.put(map.get(number), map2.getOrDefault(map.get(number), 0) + 1);
    }

    public void deleteOne(int number) {
        if (map.containsKey(number)) {
            int num = map.get(number);
            if (num == 1) {
                map.remove(number);
            } else {
                map.put(number, map.get(number) - 1);
            }
            if (map2.containsKey(num)) {
                if (map2.get(num) == 1) {
                    map2.remove(num);
                } else {
                    map2.put(num, map2.get(num) - 1);
                }
                num--;
                map2.put(num, map2.getOrDefault(num, 0) + 1);
            }
        }
    }

    public boolean hasFrequency(int frequency) {
        return map2.containsKey(frequency);
    }

    public static void main(String[] args) {
        A a = new A();
        a.add(3);
        a.add(6);
        a.add(2);
        a.add(6);
        a.deleteOne(6);
        a.deleteOne(6);
        a.add(2);
        System.out.println(a.hasFrequency(1));
    }
}

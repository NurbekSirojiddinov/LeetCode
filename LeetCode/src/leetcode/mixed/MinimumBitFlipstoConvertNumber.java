package leetcode.mixed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumBitFlipstoConvertNumber {
    public static void main(String[] args) {

        int start = 10;
        int goal = 7;

        System.out.println(minBitFlips(start, goal));
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int constant = 10;
        for (int i = 0; i < 15; i++) {
            list.add(i);
            map.put(i, i);
        }
        System.out.println(map);
        System.out.println(list);
        list = list.subList(constant, list.size());
        list.forEach(map.keySet()::remove);
        System.out.println(list);
        System.out.println(map);
    }
    private static int minBitFlips(int start, int goal) {

        String result = Integer.toBinaryString(start);
        String result1 = Integer.toBinaryString(goal);
        int counter = 0;
        int index = result.length()-1;

        for(int i = result1.length()-1; i >=0; i--) {
            if(result.charAt(index) != result1.charAt(i)) {
                counter++;
            }index--;
        }
        return counter;
    }
}

package leetcode.sorting;

import java.util.HashMap;
import java.util.Map;

public class ReorderedPowerOf2 {
    public static boolean reorderedPowerOf2(int n) {

        Map<Integer, Integer> map = new HashMap<>();
        long powOf2 = 1;

        while (n != 0) {
            map.put(n % 10, map.getOrDefault(n % 10, 0) + 1);
            n = n / 10;
        }

        while (powOf2 < 1000000000) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(powOf2);
            Map<Integer, Integer> map1 = new HashMap<>(map);
            boolean flag = true;

            for (int i = 0; i < stringBuilder.length(); i++) {
                int c = stringBuilder.charAt(i) - 48;
                if (!map1.containsKey(c)) {
                    flag = false;
                    break;
                } else {
                    map1.put(c, map1.get(c) - 1);
                    if (map1.get(c) == 0) map1.remove(c);
                }
            }
            if (flag && map1.size() == 0) return true;
            powOf2 = powOf2 * 2;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(reorderedPowerOf2(526));
    }
}

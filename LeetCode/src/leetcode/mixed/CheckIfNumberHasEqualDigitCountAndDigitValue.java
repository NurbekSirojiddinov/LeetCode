package leetcode.mixed;

import java.util.HashMap;
import java.util.Map;

public class CheckIfNumberHasEqualDigitCountAndDigitValue {
    private static boolean digitCount(String num) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < num.length(); i++) {
            if (!map.containsKey((int) num.charAt(i)-48)) {
                map.put((int) num.charAt(i)-48, 0);
            }
            map.put((int) num.charAt(i)-48, map.get((int) num.charAt(i)-48) + 1);
        }

        for (int i = 0; i < num.length(); i++) {
            if (!map.containsKey(i) && (int) num.charAt(i)-48 != 0) {
                return false;
            }
            if (map.containsKey(i) && map.get(i) !=(int) num.charAt(i)-48) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(digitCount("1210"));
    }
}

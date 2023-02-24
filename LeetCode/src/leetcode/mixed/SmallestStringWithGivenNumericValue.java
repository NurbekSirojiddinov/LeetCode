package leetcode.mixed;

import java.util.HashMap;
import java.util.Map;

public class SmallestStringWithGivenNumericValue {
    public static void main(String[] args) {
        int n = 5;
        int k = 31;
        System.out.println(getSmallestString(n, k));
    }

    private static String getSmallestString(int n, int k) {

        int letter = 'a';
        Map<Integer, Character> map = new HashMap<>();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            map.put(i + 1, (char) (letter + i));
        }
        int highest = 26;
        int divided, reminded;
        while (k != 0) {
            reminded = k % highest;
            divided = k / highest;
            while (divided != 0) {
                if (reminded >= n - divided) {
                    builder.append(map.get(highest).toString().repeat(divided));
                    n = n - divided;
                    k = reminded;
                    divided = 0;
                    break;
                }divided--;
                reminded = k - divided * highest;
            }
            if (reminded == n - divided) {
                builder.append(map.get(1).toString().repeat(reminded));
                k = 0;
            }
            highest--;
        }
        builder.reverse();
        return builder.toString();
    }
}

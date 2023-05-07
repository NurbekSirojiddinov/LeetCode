package leetcode.daily;

import java.util.HashSet;
import java.util.Set;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public static int maxVowels(String s, int k) {
        if (k > s.length()) {
            return 0;
        }
        int l = 0;
        int r = k - 1;
        int temp = 0;
        for (int i = 0; i <= r; i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') temp++;
        }
        int max = temp;


        while (r < s.length() - 1) {
            char c = s.charAt(l);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                temp--;
            }
            l++;
            r++;
            c = s.charAt(r);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                temp++;
            }
            max = Math.max(max, temp);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3));
    }
}

package leetcode.top_interview_150;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        int sum = 0;
        Map<Character, Integer> mp = new HashMap<>(
                Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000));

        char prev = ' ';
        for (char c : s.toCharArray()) {
            sum += mp.get(c);
            if(c == 'X' && prev == 'I' || c == 'V' && prev == 'I') {
                sum -= 2;
            }else if (c == 'L' && prev == 'X' || c == 'C' && prev == 'X') {
                sum -= 20;
            }else if (c == 'M' && prev == 'C' || c == 'D' && prev == 'C') {
                sum -= 200;
            }
            prev = c;
        }
        return sum;
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("MCMXCIV"));
        System.out.println(romanToInteger.romanToInt("MCDLXXVI"));
    }
}

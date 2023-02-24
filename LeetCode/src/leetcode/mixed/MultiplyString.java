package leetcode.mixed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MultiplyString {
    public static void main(String[] args) {
        String num1 = "978";
        String num2 = "978";
        System.out.println(multiply(num1, num2));
        int max = 12;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 12; i++) {
            map.put(i,i);
        }
        if (map.size() >= max) {
            System.out.println(
                    map.values().stream()
                            .limit(max).collect(Collectors.toList())
            );
        }
        System.out.println(
                map.values().stream()
                        .skip(1).collect(Collectors.toList())
        );
    }

    private static String multiply(String num1, String num2) {

        StringBuilder stringBuilder1 = new StringBuilder(num1);
        StringBuilder stringBuilder2 = new StringBuilder(num2);
        StringBuilder result;
        List<StringBuilder> list = new ArrayList<>();
        while (stringBuilder2.length() != 0) {
            int num = stringBuilder2.charAt(0) - 48;
            int num3;
            int div = 0;
            result = new StringBuilder();
            for (int i = stringBuilder1.length() - 1; i >= 0; i--) {
                num3 = stringBuilder1.charAt(i) - 48;
                result.append((num3 * num + div) % 10);
                div = (num3 * num + div) / 10;
            }
            if (div != 0) {
                result.append(div);
            }
            result.reverse().append("0".repeat(stringBuilder2.length() - 1));
            list.add(result);
            stringBuilder2.deleteCharAt(0);
        }
        int length = list.get(0).length();
        int a = 1;
        result = new StringBuilder();
        int div = 0;
        for (int i = 0; i < length; i++) {
            int result1 = 0;
            for (StringBuilder stringBuilder : list) {
                if (a <= stringBuilder.length()) {
                    result1 += (stringBuilder.charAt(stringBuilder.length() - a) - 48);
                }
            }result.append((result1+div)%10);
            div = (div + result1) / 10;
            a++;
        }if (div != 0) {
            result.append(div);
        }result.reverse();
        while(result.length() > 1 && result.charAt(0) - 48 == 0) {
            result.deleteCharAt(0);
        }
        return result.toString();
    }

}

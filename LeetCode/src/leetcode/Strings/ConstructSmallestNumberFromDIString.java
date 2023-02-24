package leetcode.Strings;

import java.util.ArrayList;
import java.util.List;

public class ConstructSmallestNumberFromDIString {
    static List<String> strings = new ArrayList<>();

    public String smallestNumber(String pattern) {
        generateNumbersRecursive("", pattern.length() + 1);
        System.out.println(strings.size());
        return "";
    }

    private void generateNumbersRecursive(String prefix, int n) {
        if (n == 0) {
            strings.add(prefix);
        } else {
            for (int i = 1; i < 10; i++) {
                generateNumbersRecursive(prefix + i, n - 1);
            }
        }
    }

    public static void main(String[] args) {
        ConstructSmallestNumberFromDIString string = new ConstructSmallestNumberFromDIString();
        System.out.println(string.smallestNumber("IIIIIIII"));
    }
}

package leetcode.Dynamic_Programming;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(n, n, result, "");
        return result;
    }

    public static void generate(int left, int right, List<String> result, String temp) {
        if (left == 0 && right == 0) {
            result.add(temp);
            return;
        }
        if (left > 0) {
            String str = temp + "(";
            generate(left - 1, right, result, str);
        }
        if (right > left) {
            String str = temp + ")";
            generate(left, right - 1, result, str);
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(1));
    }
}

package leetcode.HashMap;

import java.util.*;

public class EvaluateTheBracketPairsOfAString {
    public static String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> knowledgeMap = new HashMap<>();
        StringBuilder answer = new StringBuilder();

        for (List<String> list : knowledge) {
            knowledgeMap.put(list.get(0), list.get(1));
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                i++;
                StringBuilder str = new StringBuilder();
                while (s.charAt(i) != ')') {
                    str.append(s.charAt(i));
                    i++;
                }
                answer.append(knowledgeMap.getOrDefault(str.toString(), "?"));
            } else {
                answer.append(s.charAt(i));
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        List<List<String>> lists = Arrays.asList(Arrays.asList("name","bob"), Arrays.asList("age","two"));
        System.out.println(evaluate("(name)is(age)yearsold", lists));
    }
}

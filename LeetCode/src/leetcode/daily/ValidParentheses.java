package leetcode.daily;

public class ValidParentheses {
    public static boolean isValid(String s) {
        StringBuilder str = new StringBuilder().append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char bracket = s.charAt(i);
            char openBracket = ' ';
            if (str.length() > 0) {
                openBracket = str.charAt(str.length() - 1);
            }
            if (str.length() == 0 || bracket == '(' || bracket == '[' || bracket == '{') {
                str.append(bracket);
            } else if ((openBracket == '(' && bracket == ')') || (openBracket == '[' && bracket == ']') || (openBracket == '{' && bracket == '}')) {
                str.deleteCharAt(str.length() - 1);
            } else {
                return false;
            }
        }
        return str.length() == 0;
    }

    public static void main(String[] args) {
        System.out.println(isValid("((([[[]]])))"));
    }
}

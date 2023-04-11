package leetcode.daily;

public class RemovingStarsFromAString {
    public static String removeStars(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char element = s.charAt(i);
            if (element == '*') {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            } else {
                stringBuilder.append(element);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeStars("hello***"));
    }
}

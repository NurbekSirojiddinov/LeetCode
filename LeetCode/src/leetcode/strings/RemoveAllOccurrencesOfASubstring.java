package leetcode.strings;

public class RemoveAllOccurrencesOfASubstring {
    public static String removeOccurrences(String s, String part) {
        String temp;

        while (true) {
            int index = s.indexOf(part);
            if (index == -1) {
                return s;
            } else {
                temp = s.substring(0, index);
                temp += s.substring(index + part.length());
                s = temp;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(removeOccurrences("axxxxyyyyb", "xy"));
    }
}

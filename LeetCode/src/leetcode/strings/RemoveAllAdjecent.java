package leetcode.strings;

public class RemoveAllAdjecent {
    public static int removeAlmostEqualCharacters(String word) {
        int res = 0;

        for (int i = 1; i < word.length(); i++) {
            char a = word.charAt(i);
            if (Math.abs(a - word.charAt(i - 1)) <= 1) {
                res++;
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(removeAlmostEqualCharacters("acb"));
    }
}

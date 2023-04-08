package leetcode.hash_map;

public class FirstLetterToAppearTwice {
    public static char repeatedCharacter(String s) {
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arr[c - 'a']++;
            if (arr[c - 'a'] == 2) {
                return c;
            }
        }
        return 'a';
    }

    public static void main(String[] args) {
        System.out.println(repeatedCharacter("hello"));
    }
}

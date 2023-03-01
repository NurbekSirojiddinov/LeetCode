package leetcode.arrays;

public class CountPrefixesOfAGivenString {
    public static int countPrefixes(String[] words, String s) {
        int prefixes = 0;
        for (String word : words) {
            if (s.startsWith(word)) {
                prefixes++;
            }
        }
        return prefixes;
    }

    public static void main(String[] args) {
        System.out.println(countPrefixes(new String[]{"a", "b", "ab", "abc"}, "abc"));
    }
}

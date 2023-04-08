package leetcode.hash_map;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public static boolean areOccurrencesEqual(String s) {
        int[] arr = new int[26];
        for(int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'a']++;
        }

        for(int i = 0; i < 26; i++) {
            for(int j = 1; j < 26; j++) {
                if (arr[j] != 0 && arr[i] != 0 && arr[j] != arr[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(areOccurrencesEqual("abacbc"));
    }
}

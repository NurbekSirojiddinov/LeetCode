package leetcode.HashMap;

public class SumOfBeautyOfAllSubstrings {
    public static int beautySum(String s) {
        int[] arr;
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String str = s.substring(i, j+1);
                arr = new int[26];
                int min = 500;
                int max = 0;
                for (int k = 0; k < str.length(); k++) {
                    arr[str.charAt(k) - 'a']++;
                }
                for (int k = 0; k < 26; k++) {
                    if (arr[k] != 0) min = Math.min(min, arr[k]);
                    max = Math.max(max, arr[k]);
                }
                sum += max - min;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(beautySum("a"));
    }
}

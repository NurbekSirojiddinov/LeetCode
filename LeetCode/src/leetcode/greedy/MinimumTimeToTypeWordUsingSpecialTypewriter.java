package leetcode.greedy;

public class MinimumTimeToTypeWordUsingSpecialTypewriter {
    public static int minTimeToType(String word) {
        int cnt = word.length();
        char prev = 'a';
        for (int i = 0; i < word.length(); ++i) {
            char cur = word.charAt(i);
            int diff = Math.abs(cur - prev);
            cnt += Math.min(diff, 26 - diff);
            prev = cur;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(minTimeToType("zjpc"));
    }
}

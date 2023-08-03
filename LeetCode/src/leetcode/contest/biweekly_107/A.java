package leetcode.contest.biweekly_107;

public class A {
    public int maximumNumberOfStringPairs(String[] words) {
        int c = 0;

        for(int i = 0; i < words.length; i++) {
            for(int j = i + 1; j < words.length; j++) {
                if(words[i].equals(reverse(words[j]))) {
                    c++;
                    break;
                }
            }
        }
        return c;

    }
    public String reverse(String s) {
        StringBuilder str = new StringBuilder();

        for(int i = s.length() - 1; i >= 0; i--) {
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}


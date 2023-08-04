package leetcode.dynamic_programming;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {
    boolean ans = false;

    public boolean wordBreak(String s, List<String> wordDict) {
        dp(s, wordDict);
        return ans;
    }

    public void dp(String word, List<String> wordDict) {
        StringBuilder str = new StringBuilder();
        if (word.isEmpty()) {
            ans = true;
            return;
        }

        for (int i = 0; i < wordDict.size(); i++) {
            if (word.startsWith(wordDict.get(i))) {
                dp(word.substring(wordDict.get(i).length()), wordDict);
            }
        }
    }

    public static void main(String[] args) {
        WordBreak obj = new WordBreak();
        System.out.println("lelele".substring(1));
        System.out.println(obj.wordBreak("leettcode", new ArrayList<>(List.of("leet", "code"))));
    }
}

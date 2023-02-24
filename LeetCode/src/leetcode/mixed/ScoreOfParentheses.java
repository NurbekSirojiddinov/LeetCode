package leetcode.mixed;

import java.util.*;

public class ScoreOfParentheses {
    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("(((()(())))(()))"));
    }

    private static String removeDuplicateLetters(String s) {

        Set<Character> characters = new HashSet<>();
        List<Character> list = new ArrayList<>();
        List<Character> list1 = new ArrayList<>();
        Map<Integer, List<Character>> map = new HashMap<>();
        int totalCharacters = 0;

        for(int i = 0; i < s.length(); i++) {
            characters.add(s.charAt(i));
        }
        totalCharacters = characters.size();

        for (int i = 0; i < s.length(); i++) {
            characters = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                characters.add(s.charAt(j));
                if (characters.size() == totalCharacters){

                    break;
                }
            }
        }
        return "";
    }
}

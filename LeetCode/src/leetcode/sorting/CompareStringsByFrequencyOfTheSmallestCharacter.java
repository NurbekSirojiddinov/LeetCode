package leetcode.sorting;

import java.util.Arrays;

public class CompareStringsByFrequencyOfTheSmallestCharacter {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {

        int[] answer = new int[queries.length];
        int index = 0;

        for (String query : queries) {
            char[] chars = query.toCharArray();
            Arrays.sort(chars);
            int count = getCount(chars);
            int counter = 0;

            for (String word : words) {
                char[] chars1 = word.toCharArray();
                Arrays.sort(chars1);
                if (count < getCount(chars1)) {
                    counter++;
                }
            }
            answer[index++] = counter;
        }
        return answer;
    }

    public static int getCount(char[] chars) {
        int count = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CompareStringsByFrequencyOfTheSmallestCharacter compareStringsByFrequencyOfTheSmallestCharacter = new CompareStringsByFrequencyOfTheSmallestCharacter();
        System.out.println(Arrays.toString(compareStringsByFrequencyOfTheSmallestCharacter.numSmallerByFrequency(new String[]{"bbb", "cc"}, new String[]{"a", "aa", "aaa", "aaaa"})));
    }
}

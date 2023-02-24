package leetcode.contest.biweekly_97;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparateTheDigitsInAnArray {
    public static int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();

        for (int num : nums) {
            str.append(num);
            for (int i = 0; i < str.length(); i++) {
                list.add((int) str.charAt(i) - 48);
            }
            str = new StringBuilder();
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(separateDigits(new int[]{13,25,83,77})));
    }
}

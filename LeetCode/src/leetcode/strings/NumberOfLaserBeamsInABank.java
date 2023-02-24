package leetcode.strings;

public class NumberOfLaserBeamsInABank {
    public static int numberOfBeams(String[] bank) {
            int answer = 0;
            int current = 0;
            int prev = 0;

            for (String s : bank) {
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == '1') {
                        current++;
                    }
                }
                if (current != 0) {
                    answer += current * prev;
                    prev = current;
                    current = 0;
                }
            }
            return answer;
    }

    public static void main(String[] args) {
        System.out.println(numberOfBeams(new String[]{"011001", "000000", "010100", "001000"}));
    }
}

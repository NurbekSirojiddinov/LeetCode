package leetcode.contest.weekly_341;

public class MinimumAdditionsToMakeValidString {
    public static int addMinimum(String word) {
        StringBuilder stringBuilder = new StringBuilder().append(word);
        int numberOfLetters = 0;
        int length = stringBuilder.length();

        for (int i = 0; i < length; i++) {
            if (stringBuilder.charAt(i) == 'a') {
                if (i + 2 < length && stringBuilder.substring(i+1, i + 3).equals("bc")) {
                    i = i + 2;
                } else if (i + 1 < length && (stringBuilder.charAt(i + 1) == 'b' || stringBuilder.charAt(i + 1) == 'c')) {
                    numberOfLetters++;
                    i++;
                } else {
                    numberOfLetters += 2;
                }
            } else if (stringBuilder.charAt(i) == 'b') {
                if (i + 1 < length && stringBuilder.charAt(i + 1) == 'c') {
                    i++;
                    numberOfLetters++;
                } else {
                    numberOfLetters += 2;
                }
            } else {
                numberOfLetters += 2;
            }
        }
        return numberOfLetters;
    }

    public static void main(String[] args) {
        System.out.println(addMinimum("abc"));
    }
}

package leetcode.contest.weekly_01_05_2022;

public class RemoveDigitFromNumberToMaximizeResult {
    public static void main(String[] args) {

    }

    public String removeDigit(String number, char digit) {
        StringBuilder stringBuilder = new StringBuilder(number);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == digit &&
                    i + 1 < stringBuilder.length()
                    && stringBuilder.charAt(i) < stringBuilder.charAt(i+1)) {
                stringBuilder.deleteCharAt(i);
                return stringBuilder.toString();
            }
        }
        for (int i = stringBuilder.length()-1; i >= 0; i--) {
            if (stringBuilder.charAt(i) == digit) {
                stringBuilder.deleteCharAt(i);
                break;
            }
        }
        return stringBuilder.toString();
    }
}

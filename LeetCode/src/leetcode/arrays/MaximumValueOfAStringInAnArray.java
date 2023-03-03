package leetcode.arrays;

public class MaximumValueOfAStringInAnArray {
    public static int maximumValue(String[] strs) {

        int maxVal = 0;

        for (String str : strs) {
            boolean isDigit = false;
            boolean isLetter = false;
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i))) {
                    isLetter = true;
                } else {
                    isDigit = true;
                }
                if (isDigit && isLetter) {
                    break;
                }
            }
            if (isLetter) {
                maxVal = Math.max(maxVal, str.length());
            } else {
                maxVal = Math.max(maxVal, Integer.parseInt(str));
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        System.out.println(maximumValue(new String[]{"alic3", "bob", "3", "4", "00000"}));
    }
}

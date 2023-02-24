package leetcode.mixed;

public class DecodeString {
    public static String decodeString(String s) {
        StringBuilder finalResult = new StringBuilder();
        StringBuilder builder = new StringBuilder();
        int counter = 0;
        int i = s.length() - 1;

        while (i > 0) {
            if (s.charAt(i) == ']') {
                counter++;
            } else if (s.charAt(i) == '[') {
                counter--;
            } else if (Character.isLetter(s.charAt(i))){
                builder.append(s.charAt(i));
            }
            if (counter == 0) {

            }
        }
        return " ";
        //"3[a2[bs2[d]fc]]"
    }
}

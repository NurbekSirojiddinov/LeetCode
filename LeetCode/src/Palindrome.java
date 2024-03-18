import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Palindrome {
    public static Boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            //According to the description we need to select only letters
            if (Character.isLetter(c)) {
                stringBuilder.append(c);
            }
        }
        s = stringBuilder.toString();

        return s.contentEquals(stringBuilder.reverse());
    }

    public static void main(String[] args) {
        Set<Integer> se = new HashSet<>(List.of(1,2,3,4,5,6));
        se.add(1);
        System.out.println(se);
        System.out.println(isPalindrome("@#!@!a   b  a789787889"));
    }
}

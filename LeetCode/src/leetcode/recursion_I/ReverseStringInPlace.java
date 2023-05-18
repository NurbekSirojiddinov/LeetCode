package leetcode.recursion_I;

public class ReverseStringInPlace {
    public static void reverseString(char[] s) {
        char temp;

        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e','f'};
        reverseString(chars);
        System.out.println(chars);
    }
}

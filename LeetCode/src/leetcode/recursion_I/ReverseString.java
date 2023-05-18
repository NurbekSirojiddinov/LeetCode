package leetcode.recursion_I;

public class ReverseString {
    public static void printReverse(int index, char[] str) {
        if (str == null || index >= str.length) {
            return;
        }
        printReverse(index+1, str);
        System.out.print(str[index]);
    }

    public static void main(String[] args) {
        printReverse(0, "test".toCharArray());
    }
}

package leetcode.tree;

public class MaximumOddBinaryNumber {
    public String maximumOddBinaryNumber(String s) {
        int ones = -1;
        int zeros = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') ones++;
            else zeros++;
        }
        return "1".repeat(ones) + "0".repeat(zeros) + "1";
    }

    public static void main(String[] args) {
        System.out.println(new MaximumOddBinaryNumber().maximumOddBinaryNumber("10010101"));
    }
}

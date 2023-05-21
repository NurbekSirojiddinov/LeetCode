package leetcode.contest.weekly_346;

public class A {
    public static int minLength(String s) {
        StringBuilder stringBuilder = new StringBuilder().append(s);

        while (stringBuilder.length() != 0) {
            int i = 1;
            boolean flag = false;
            while (i < stringBuilder.length()) {
                if (stringBuilder.substring(i - 1, i + 1).equals("AB") || stringBuilder.substring(i - 1, i + 1).equals("CD")) {
                    stringBuilder.delete(i - 1, i + 1);
                    flag = true;
                }
                i++;
            }
            if (!flag) {
                break;
            }
        }
        return stringBuilder.length();
    }

    public static void main(String[] args) {
        System.out.println(minLength("ABFCACDB"));
    }
}

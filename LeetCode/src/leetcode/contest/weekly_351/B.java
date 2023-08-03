package leetcode.contest.weekly_351;

public class B {
    public static int makeTheIntegerZero(int num1, int num2) {
        if (num2 > num1) return -1;
        int c = 0;

        while (num1 != 0) {
            int ans = 0;
            for (int i = 0; i <= 60; i++) {
                ans = i;
                int sub = (int) (Math.pow(2, ans) + num2);
                if (num1 < 0) {
                    if (num1 > sub) {
                        break;
                    } if (num1 == sub) {
                        break;
                    }
                } else {
                    if (num1 - sub < 0) {
                        ans--;
                        break;
                    }
                }
            }
            int s = (int) (Math.pow(2, ans)) + num2;
            if (s == 0 && ans < 60) {
                s = (int) (Math.pow(2, ans + 1)) + num2;
            } else if (s == 0) break;
            num1 -= s;
            c++;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(makeTheIntegerZero(3, -4));
    }
}

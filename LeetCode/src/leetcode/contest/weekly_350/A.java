package leetcode.contest.weekly_350;

public class A {
    public static int distanceTraveled(int mainTank, int additionalTank) {
        int total = 0;

        while (mainTank > 0) {
            if (mainTank >= 5) {
                mainTank -= 5;
                if (additionalTank > 0) {
                    mainTank++;
                    additionalTank--;
                }
                total += 50;
            } else {
                total += mainTank * 10;
                mainTank = 0;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(distanceTraveled(5, 10));
        System.out.println(2 % 6);
    }
}



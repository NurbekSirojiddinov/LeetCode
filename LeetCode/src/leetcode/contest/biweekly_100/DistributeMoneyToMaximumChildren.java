package leetcode.contest.biweekly_100;

public class DistributeMoneyToMaximumChildren {
    public static int distMoney(int money, int children) {
        if (children > money) {
            return -1;
        }

        int counter = 0;

        while (money > 0) {
            if (money - 8 >= (children - 1) && !(money - 8 == 4 && children == 2)) {
                if (money - 8 > 0 && children - 1 == 0) break;
                counter++;
                children--;
                money -= 8;
            } else {
                break;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(distMoney(23, 3));
    }
}

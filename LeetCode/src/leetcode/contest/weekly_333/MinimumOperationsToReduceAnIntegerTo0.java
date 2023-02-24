package leetcode.contest.weekly_333;

public class MinimumOperationsToReduceAnIntegerTo0 {
    public static int minOperations(int n) {
        int counter = 0;

        while (n != 0) {
            int index = 0;
            int sub = 0;
            while (sub < n) {
                sub = (int) Math.pow(2, index);
                index++;
                if (sub == n) {
                    return ++counter;
                } else if (sub > n) {
                    if (n - (sub / 2) < sub - n) {
                        if (n - (sub / 2) == 1) {
                            counter += 2;
                            return counter;
                        } else {
                            n = n - (sub / 2);
                            counter++;
                        }
                    } else {
                        if (sub - n == 1) {
                            counter += 2;
                            return counter;
                        } else {
                            n = sub - n;
                            counter++;
                        }
                    }
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(minOperations(1));
    }
}

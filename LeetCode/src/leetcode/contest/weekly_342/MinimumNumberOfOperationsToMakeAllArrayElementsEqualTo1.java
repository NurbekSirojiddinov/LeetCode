package leetcode.contest.weekly_342;

public class MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1 {
    public int minOperations(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != 1 && nums[i+1] == 1) {
                nums[i] = 1;
                counter++;
            }
             else if (nums[i] != 1) {
                for (int j = i; j < nums.length - 1; j++) {
                    if (nums[j] != 1 && nums[j + 1] == 1) {
                        nums[j] = 1;
                        counter++;
                    } else if (nums[j] == 1 && nums[j + 1] != 1) {
                        nums[j + 1] = 1;
                        counter++;
                    } else {
                        int gcd = findGCD(nums[j], nums[j + 1]);
                        if (gcd != nums[j] && gcd != nums[j + 1]) {
                            if (gcd == 1) {
                                nums[j + 1] = 1;
                            } else {
                                nums[j + 1] = gcd;
                                j--;
                            }
                            counter++;
                        }
                    }
                }
            }
        }
        return counter;
    }

    public int findGCD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public int gcd(int p, int q) {
        if(q == 0) return p;
        int r = p % q;

        return gcd(q, r);
    }

    public static void main(String[] args) {
        MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1 to1 = new MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1();
        System.out.println(to1.minOperations(new int[]{2, 6, 3, 4}));
        System.out.println(new MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1().findGCD(40, 24));
        System.out.println(new MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1().gcd(40, 24));
    }
}

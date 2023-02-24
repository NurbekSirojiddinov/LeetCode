package leetcode.mixed;

public class BrokenCalculator {
    public static void main(String[] args) {

        int startValue = 5;
        int target = 8;
        System.out.println(brokenCalc(startValue, target));
    }

    private static int brokenCalc(int startValue, int target) {

        int result = 0;

        while(startValue != target) {
            if (startValue > target) {
                target++;
                result++;
                continue;
            }
            if(target % 2 == 1) {
                startValue++;
            }else{
                target = target / 2;
            }
            result++;
        }

        return result;
    }
}

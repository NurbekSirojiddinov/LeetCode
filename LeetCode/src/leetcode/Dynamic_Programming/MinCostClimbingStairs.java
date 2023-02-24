package leetcode.Dynamic_Programming;

public class MinCostClimbingStairs {
    public static int minCostClimbingStairs(int[] cost) {
        int i = -1;
        int sum = 0;

        while(i != cost.length-1) {
            if(i + 2 > cost.length - 1) {
                return sum;
            }
            if(cost[i+2] > cost[i+1] && i + 3 == cost.length-1 && cost[i+2] < (cost[i+1] + cost[i+3])) {
                return sum + cost[i + 2];
            }
            if(cost[i+1] == cost[i+2]) {
                sum+=cost[i+2];
                i += 2;
            } else {
                if(cost[i+1] > cost[i+2]) {
                    sum += cost[i+2];
                    i += 2;
                }else {
                    sum += cost[i+1];
                    i++;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[] {10,15,20}));
        System.out.println(minCostClimbingStairs(new int[] {10,15,21,2,3}));
    }
}

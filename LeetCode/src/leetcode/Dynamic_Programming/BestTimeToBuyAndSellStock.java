package leetcode.Dynamic_Programming;

public class BestTimeToBuyAndSellStock {
    private static int maxProfit(int[] prices) {
        int answer = 0;
        int buy = prices[0];
        int sell;

        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            } else {
                sell = prices[i];
                answer = Math.max(answer, sell - buy);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}

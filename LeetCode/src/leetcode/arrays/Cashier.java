package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class Cashier {
    private final int n;
    private final int discount;
    private final Map<Integer, Integer> map = new HashMap<>();
    private int counter = 0;

    public Cashier(int n, int discount, int[] products, int[] prices) {
        this.n = n;
        this.discount = discount;

        for (int i = 0; i < prices.length; i++) {
            map.put(products[i], prices[i]);
        }
    }

    public double getBill(int[] product, int[] amount) {
        double totalCost = 0;
        counter++;

        for (int i = 0; i < product.length; i++) {
            totalCost += (amount[i] * map.get(product[i]));
        }

        if (counter == n) {
            counter = 0;
            return totalCost * (100 - discount) / 100;
        }
        return totalCost;
    }

    public static void main(String[] args) {
        Cashier cashier = new Cashier(3, 500, new int[]{}, new int[]{});
        System.out.println(cashier.getBill(new int[]{}, new int[]{}));
    }
}

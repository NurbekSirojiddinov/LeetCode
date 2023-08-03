package leetcode.contest.weekly_350;

import java.util.Arrays;
import java.util.Comparator;

public class D {
    public static int paintWalls(int[] cost, int[] time) {
        Painting[] painting = new Painting[cost.length];

        for (int i = 0; i < cost.length; i++) {
            painting[i] = new Painting(cost[i], time[i]);
        }
        Arrays.sort(painting, Comparator.comparing(Painting::getCost).thenComparing(Comparator.comparing(Painting::getTime).reversed()));

        int left = 0;
        int right = painting.length - 1;
        int totalCost = painting[0].cost;
        int previousTime = painting[0].getTime();

        while (left < right) {
            if (previousTime != 0) {
                previousTime--;
            } else {
                left++;
                if (left < painting.length) {
                    totalCost += painting[left].cost;
                    previousTime = painting[left].time;
                    previousTime--;
                }
            }
            right--;
        }
        return totalCost;
    }

    public static void main(String[] args) {
        System.out.println(paintWalls(new int[]{26, 53, 10, 24, 25, 20, 63, 51}, new int[]{1, 1, 1, 1, 2, 2, 2, 1}));
    }
}

//10,20,24,25,26
class Painting {

    public Painting(int cost, int time) {
        this.cost = cost;
        this.time = time;
    }

    int cost;
    int time;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}

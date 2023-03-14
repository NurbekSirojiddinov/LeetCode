package leetcode.sorting;

import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Math.sqrt;

public class KClosestPointsToOrigin {
    public static int[][] kClosest(int[][] points, int k) {

        int[][] result = new int[k][points[0].length];
        CustomClass[] customClasses = new CustomClass[points.length];
        int index = 0;

        for (int[] point : points) {
            customClasses[index++] = new CustomClass(getDistance(point[0], point[1]), point);
        }

        Arrays.sort(customClasses, Comparator.comparing(CustomClass::getDistance));

        for (int i = 0; i < k; i++) {
            result[i][0] = customClasses[i].getArr()[0];
            result[i][1] = customClasses[i].getArr()[1];
        }

        return result;
    }

    public static double getDistance(int x, int y) {
        return sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(kClosest(new int[][]{{1, 3}, {-2, 2}}, 1)));
    }
}

class CustomClass {

    private double distance;
    private int[] arr;

    public CustomClass(double distance, int[] arr) {
        this.distance = distance;
        this.arr = arr;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}

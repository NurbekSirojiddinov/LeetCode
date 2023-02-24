package Alorithm_Univercity.algorithm;

public class CrucialAlgorithm {
    private static int findShortestWay(int[][] graph) {
        int totalDistance = 0;int row = 0;int column = 0;
        for (int i = 0; i < graph.length - 1; i++) {
            int min = Integer.MAX_VALUE;
            int index = 0;
            if (i % 2 == 0) {
                for (int j = 0; j < graph.length; j++) {
                    if (graph[row][j] < min && graph[row][j] !=0) {
                        min = graph[row][j];
                        index = j;
                        graph[row][j] = 0;
                    }
                }graph[row][index] = 0;
                totalDistance += min;
                column = index;
            } else {
                for (int j = 0; j < graph.length; j++) {
                    if (graph[j][column] < min && graph[j][column] != 0) {
                        min = graph[j][column];
                        index = j;
                        graph[j][column] = 0;
                    }
                } graph[index][column] = 0;
                totalDistance += min;
                row = index;
            }
        }
        return totalDistance;
    }
    public static void main(String[] args) {
        int[][] cost = {
                {0,9,11,0,0,10},
                {9,0,7,0,0,0},
                {11,7,0,6,8,13},
                {0,0,6,0,7,0},
                {0,0,8,7,0,10},
                {10,0,13,0,10,0}
        };
        System.out.println(findShortestWay(cost));
    }
}

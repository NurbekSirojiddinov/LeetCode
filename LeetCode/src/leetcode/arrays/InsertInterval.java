package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
intervals = [[1,5],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
Output: [[6,8],[3,10],[12,16]]
* */
public class InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> integers = new ArrayList<>();
        boolean oneTime = true;
        if (intervals.length == 0) {
            return new int[][]{{newInterval[0], newInterval[1]}};
        }

        for (int i = 0; i < intervals.length; i++) {
            if(intervals[i][1] < newInterval[0] || !oneTime) {
                integers.add(intervals[i]);
            } else if(intervals[i][0] > newInterval[1]) {
                integers.add(newInterval);
                oneTime = false;
                i--;
            }
            else if (intervals[i][1] >= newInterval[0]) {
                int[] interval = new int[2];
                interval[0] = Math.min(intervals[i][0], newInterval[0]);
                i++;
                while (true) {
                    if (i >= intervals.length) {
                        interval[1] = Math.max(newInterval[1], intervals[i-1][1]);
                        oneTime = false;
                        break;
                    }
                    if(intervals[i][0] == newInterval[1]) {
                        interval[1] = intervals[i][1];
                        oneTime = false;
                        break;
                    } else if (intervals[i][0] > newInterval[1]) {
                        interval[1] = Math.max(newInterval[1], intervals[i-1][1]);
                        oneTime = false;
                        i--;
                        break;
                    } i++;
                }
                integers.add(interval);
            }
        }
        if (intervals[intervals.length-1][1] < newInterval[0]) {
            integers.add(newInterval);
        }
        int[][] result = new int[integers.size()][2];

        for (int i = 0; i < integers.size(); i++) {
            result[i][0] = integers.get(i)[0];
            result[i][1] = integers.get(i)[1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,5},{6,7}};
        int[] newInterval = {8, 9};
        System.out.println(Arrays.deepToString(insert(intervals, newInterval)));
    }
}

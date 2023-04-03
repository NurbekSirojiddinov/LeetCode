package leetcode.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.lang.Integer.*;

public class MinimumTimeDifference {
    public static int findMinDifference(List<String> timePoints) {
        CustomTime[] customTimes = new CustomTime[timePoints.size()];
        int index = 0;
        int min = MAX_VALUE;

        for (String time : timePoints) {
            customTimes[index++] = new CustomTime(parseInt(time.substring(0, 2)), parseInt(time.substring(3)));
        }

        Arrays.sort(customTimes, Comparator.comparing(CustomTime::getHour).thenComparing(CustomTime::getMinute));

        for (int i = 1; i < customTimes.length; i++) {
            int curr = customTimes[i].getHour();
            int prev = customTimes[i - 1].getHour();
            int currM = customTimes[i].getMinute();
            int prevM = customTimes[i - 1].getMinute();
            int minute = currM - prevM;
            int hour = (curr - prev) * 60;

            if (curr - prev == 23) {
                prev = 23;
                if (currM > prevM) {
                    minute = 60 - currM + prevM;
                }
            }
            min = Math.min(min, (hour + minute));
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println(findMinDifference(new ArrayList<>(List.of("00:00", "04:00", "22:00"))));
    }
}

class CustomTime {
    private int hour;
    private int minute;

    public CustomTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}

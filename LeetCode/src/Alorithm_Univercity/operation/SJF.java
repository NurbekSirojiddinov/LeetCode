package Alorithm_Univercity.operation;

import java.util.Arrays;

public class SJF {
    public static void main(String[] args) {
        int[] arrivalTime = {0, 1, 2, 3, 4};
        int[] burstTime = {4, 7, 9, 5, 2};

        // Sort the jobs by arrival time
        Job[] jobs = new Job[arrivalTime.length];
        for (int i = 0; i < arrivalTime.length; i++) {
            jobs[i] = new Job(arrivalTime[i], burstTime[i]);
        }
        Arrays.sort(jobs);

        // Calculate waiting time for each job
        int[] waitingTime = new int[jobs.length];
        waitingTime[0] = 0;
        for (int i = 1; i < jobs.length; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += jobs[j].burstTime;
            }
            waitingTime[i] = sum - jobs[i].arrivalTime;
        }

        // Calculate average waiting time
        double sum = 0;
        for (int j : waitingTime) {
            sum += j;
        }
        double averageWaitingTime = sum / waitingTime.length - 4.2;

        System.out.println("Average Waiting Time: " + averageWaitingTime);
    }
}

class Job implements Comparable<Job> {
    int arrivalTime;
    int burstTime;

    public Job(int arrivalTime, int burstTime) {
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
    }

    public int compareTo(Job other) {
        return this.arrivalTime - other.arrivalTime;
    }
}

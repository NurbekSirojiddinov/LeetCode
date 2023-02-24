package leetcode.mixed;

import java.util.Arrays;

public class BoatsToSavePeople {
    public static void main(String[] args) {

        int[] people = {3, 5, 3, 4};
        int limit = 5;//10,10,30,30,50 70
        System.out.println(numRescueBoats(people, limit));
    }

    private static int numRescueBoats(int[] people, int limit) {

        int boats = 0;
        int i = 0;
        int j = people.length - 1;
        Arrays.sort(people);

        while (j > 0 && j >= i) {
            if (people[j] + people[i] <= limit) {
                i++;
            }
            boats++;
            j--;
            if (i == j && j == 0) boats++;
        }
        return boats;
    }
}

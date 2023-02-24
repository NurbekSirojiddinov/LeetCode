package leetcode.mixed;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MinimumDeletions {
    public static void main(String[] args) {

        int[] nums = {1,2,2,3,3,4,4};
        System.out.println(minDeletion(nums));
    }
    private static int minDeletion(int[] nums) {

        List<Integer> list = new ArrayList<>();
        int counter = 0;

        for (int i : nums) {
            list.add(i);
        }

        for (int i = 0; i < list.size() - 1; i++) {
            if (Objects.equals(list.get(i + 1), list.get(i)) && (i % 2 == 0)) {
                list.remove(i);
                i--;
                counter++;
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.size() % 2 == 1) {
                counter++;
                return counter;
            }
        }
        return counter;//1,1,2,2,3,3,4,4: 1,
        //1
    }

}

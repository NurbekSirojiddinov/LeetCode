package leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOperations {
    public static List<String> buildArray(int[] target, int n) {
        List<String> operations = new ArrayList<>();
        int index = 0;
        int i = 1;

        while (index < target.length && i <= n) {
            if (i == target[index]) {
                operations.add("Push");
                index++;
            } else {
                operations.add("Push");
                operations.add("Pop");
            }
            i++;
        }
        return operations;
    }

    public static void main(String[] args) {
        System.out.println(buildArray(new int[]{1, 3}, 3));
    }
}

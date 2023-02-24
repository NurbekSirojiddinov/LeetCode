package leetcode.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrickWall {
    public static int leastBricks(List<List<Integer>> wall) {


        Map<Integer, Integer> map = new HashMap<>();
        int minCrossedBricks = 0;

        for (List<Integer> integers : wall) {
            int sum = 0;
            for (int j = 0; j < integers.size() - 1; j++) {
                sum += integers.get(j);
                map.put(sum, map.getOrDefault(sum, 0) + 1);
                minCrossedBricks = Math.max(minCrossedBricks, map.get(sum));
            }
        }
        return wall.size() - minCrossedBricks;
    }

    public static void main(String[] args) {
        System.out.println(leastBricks(new ArrayList<>(
                List.of(
                        List.of(1, 2, 2, 1),
                        List.of(3, 1, 2),
                        List.of(1, 3, 2),
                        List.of(2, 4),
                        List.of(3, 1, 2),
                        List.of(1, 3, 1, 1)))));
    }
}

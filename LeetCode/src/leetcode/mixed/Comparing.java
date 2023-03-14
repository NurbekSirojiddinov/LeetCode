package leetcode.mixed;

import java.time.Instant;
import java.util.*;

public class Comparing {
    public static void main(String[] args) {
        Map<Integer, Instant> map = new HashMap<>();

        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0)
                map.put(i, Instant.now());
            else map.put(i + 2, Instant.now());
        }map = sort(map);
        System.out.println(map);
    }

    private static Map<Integer, Instant> sort(Map<Integer, Instant> joinRequests) {
        Map<Integer, Instant> map = new LinkedHashMap<>();

        joinRequests
                .entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .forEachOrdered(entry ->map.put(entry.getKey(), entry.getValue()));

        return map;
    }
}

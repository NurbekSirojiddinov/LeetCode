package leetcode.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {
    public static String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();

        for (List<String> list : paths) {
            set.add(list.get(0));
        }

        for (List<String> list : paths) {
            if (!set.contains(list.get(1))) {
                return list.get(1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>(List.of(List.of("A", "B"), List.of("B", "C")));
        System.out.println(destCity(list));
    }
}

package leetcode.arrays;

import java.util.*;

public class DisplayTableOfFoodOrdersInRestaurant {
    public static List<List<String>> displayTable(List<List<String>> orders) {

        Set<Integer> treeMap = new TreeSet<>();
        Map<String, Map<Integer, Integer>> ordersMap = new TreeMap<>();
        List<List<String>> list = new ArrayList<>();
        List<String> stringList = new ArrayList<>(List.of("Table"));
        boolean flag = true;

        for (List<String> order : orders) {
            int val = Integer.parseInt(String.valueOf(order.get(1)));
            treeMap.add(val);
            if (ordersMap.containsKey(order.get(2))) {
                Map<Integer, Integer> map = new HashMap<>(ordersMap.get(order.get(2)));
                map.put(val, map.getOrDefault(val, 0) + 1);
                ordersMap.put(order.get(2), map);
            } else {
                ordersMap.put(order.get(2), Map.of(val, 1));
            }
        }

        for (int val : treeMap) {
            List<String> list1 = new ArrayList<>(List.of(String.valueOf(val)));
            for (Map.Entry<String, Map<Integer, Integer>> entry : ordersMap.entrySet()) {
                if (flag) {
                    stringList.add(entry.getKey());
                }
                if (entry.getValue().containsKey(val)) {
                        list1.add(String.valueOf(entry.getValue().get(val)));
                } else {
                    list1.add(String.valueOf(0));
                }
            }
            list.add(list1);
            flag = false;
        }
        list.add(0, stringList);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(displayTable(new ArrayList<>()));
    }
}

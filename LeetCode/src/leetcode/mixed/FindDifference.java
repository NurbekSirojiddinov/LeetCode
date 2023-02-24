package leetcode.mixed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDifference {
    public static void main(String[] args) {

        int[] num1 = {1,2,3};
        int[] num2 = {2,4,6};
        System.out.println(findDifference(num1, num2));
    }

    private static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<List<Integer>> list3 = new ArrayList<>();

        for (int i : nums1) {
            map.put(i, 0);
        }
        for (int i : nums2) {
            if (!map.containsKey(i))
            map1.put(i, 0);
        }
        map = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : map1.entrySet()){
            list.add(entry.getKey());
        } map1 = new HashMap<>();
        for (int i : nums2) {
            map1.put(i, 0);
        }for (int i : nums1) {
            if (!map1.containsKey(i))
                map.put(i, 0);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            list1.add(entry.getKey());
        }
        list3.add(list1);
        list3.add(list);
        return list3;
    }
}

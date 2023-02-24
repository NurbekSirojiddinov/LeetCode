package leetcode.hashMap;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class SortThePeople {
    public static String[] sortPeople(String[] names, int[] heights) {

        Map<Integer, String> sortedNames = new TreeMap<>();
        String[] sortedArr = new String[names.length];
        int index = names.length - 1;

        for (int i = 0; i < heights.length; i++) {
            sortedNames.put(heights[i], names[i]);
        }
        for (Map.Entry<Integer,String> entry : sortedNames.entrySet()) {
            sortedArr[index--] = entry.getValue();
        }
        return sortedArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortPeople(new String[]{"simon", "simon1"}, new int[]{21, 22})));
    }
}

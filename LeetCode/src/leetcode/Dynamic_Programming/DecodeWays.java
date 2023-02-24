package leetcode.Dynamic_Programming;

import java.util.*;

public class DecodeWays {
    public static void main(String[] args) {

        int[][] num = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        System.out.println(numDecoding(num));
    }
    private static List<Integer> numDecoding(int[][] num) {
       Map<Integer, Integer> map = new HashMap<>();

       for (int i = 0; i < num[0].length; i++) {
           map.put(num[0][i], 0);
       }
       for (int i = 1; i < num.length; i++) {
           Map<Integer, Integer> map1 = new HashMap<>();
           for (int j = 0; j < num[i].length; j++) {
               if(map.containsKey(num[i][j])) {
                   map1.put(num[i][j], 0);
               }
           }map = map1;
       }
       List<Integer> list = new ArrayList<>();
       for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
           list.add(entry.getKey());
       }
       Collections.sort(list);
       return list;
    }
}

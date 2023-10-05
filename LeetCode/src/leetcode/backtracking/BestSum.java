package leetcode.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestSum {
    Map<Integer, List<Integer>> memo;
    int[] arr;
    int len = Integer.MAX_VALUE;
    List<Integer> ans;

    public List<Integer> findBestSum(int[] arr, int target) {
        this.ans = new ArrayList<>();
        this.arr = arr;
        this.memo = new HashMap<>();

        return backtrack(new ArrayList<>(), target);
    }

    public List<Integer> backtrack(List<Integer> list, int target) {
        if (memo.containsKey(target)) {
            return memo.get(target);
        }
        if (target == 0) {
            return list;
        }
        if (target < 0) return null;
        List<Integer> list1 = null;

        for (int j : arr) {
            list.add(j);
            List<Integer> res  = backtrack(list, target - j);
            if (res != null && (list1 == null || res.size() < list1.size())) {
                list1 = new ArrayList<>(res);
            }
        }
        memo.put(target, list1);

        return list1;
    }

    public static void main(String[] args) {
        BestSum obj = new BestSum();

        System.out.println(obj.findBestSum(new int[]{2, 3, 5}, 8));
    }
}

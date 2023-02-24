package leetcode.HashMap;

import java.util.*;

public class PeopleWhoseListOfFavoriteCompaniesIsNotASubsetOfAnotherList {
    public static List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {

        Map<String, Integer> map = new HashMap<>();
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int num = 1;

        for (List<String> list : favoriteCompanies) {
            List<Integer> integerList = new ArrayList<>();
            for (String str : list) {
                if (!map.containsKey(str)) {
                    map.put(str, num++);
                }
                integerList.add(map.get(str));
            }
            lists.add(integerList);
        }
        for (int i = 0; i < lists.size(); i++) {
            List<Integer> list = lists.get(i);
            boolean isSubset = false;
            for (int j = 0; j < lists.size(); j++) {
                if (i != j) {
                    isSubset = isSubset(list, lists.get(j));
                    if (isSubset) {
                        break;
                    }
                }
            }
            if (!isSubset) {
                result.add(i);
            }
        }
        return result;
    }

    private static boolean isSubset(List<Integer> firstList, List<Integer> secondList) {
        int left = 0;
        int right = firstList.size() - 1;

        while (left <= right) {
            if (!secondList.contains(firstList.get(left++)) || !secondList.contains(firstList.get(right--))) {
                return false;
            }
            if (left > right) {
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<List<String>> lists = new ArrayList<>(List.of(
                List.of("pucrokqzrafklgesesdm", "sqcsmcmzqsujmilpbrpa", "zassdbsqadkklyrbulsc"),
                List.of("njsxkzetsrictzzylnmq"),
                List.of("pucrokqzrafklgesesdm"),
                List.of("njsxkzetsrictzzylnmq", "pucrokqzrafklgesesdm", "zassdbsqadkklyrbulsc"),
                List.of("sqcsmcmzqsujmilpbrpa", "zassdbsqadkklyrbulsc")));
        System.out.println(peopleIndexes(lists));
    }
}

package leetcode.dynamic_programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInAString {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> helperMap;

        for (int i = 0; i < p.length(); i++) {
            map.put(p.charAt(i), map.getOrDefault(p.charAt(i), 0) + 1);
        }
        char temp = ' ';
        boolean bool = false;
        int index = 0;


        for (int i = 0; i < s.length(); i++) {
            char temp1 = s.charAt(i);
            if (bool && temp1 == temp) {
                index++;
                ans.add(index);
                temp = s.charAt(index);
            } else {
                if (bool) {
                    index++;
                    i = index;
                }

                //  if (index > 0 && temp1 != temp && i + p.length() - 1 >= s.length()) i--;
                if (i + p.length() - 1 < s.length()) {
                    boolean flag = true;
                    helperMap = new HashMap<>(map);
                    for (int j = i; j < i + p.length(); j++) {
                        if (!helperMap.containsKey(s.charAt(j))) {
                            flag = false;
                            break;
                        } else helperMap.put(s.charAt(j), helperMap.get(s.charAt(j)) - 1);
                        if (helperMap.get(s.charAt(j)) == 0) helperMap.remove(s.charAt(j));
                    }
                    if (helperMap.size() != 0) flag = false;
                    if (flag) {
                        ans.add(i);
                        bool = true;
                        temp = s.charAt(i);
                        index = i;
                        i = i + p.length() - 1;
                    } else {
                        bool = false;
                    }
                }
            }
        }//sabcabc abc
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(findAnagrams("ababababab", "aab"));
    }
}

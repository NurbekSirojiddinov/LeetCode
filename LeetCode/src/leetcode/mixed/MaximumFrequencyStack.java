package leetcode.mixed;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MaximumFrequencyStack {

    Map<Integer, Integer> map = new HashMap<>();
    Stack<Integer> stack = new Stack<>();

    public void push(int val) {
        stack.push(val);
        if (!map.containsKey(val)){
            map.put(val, 0);
        }map.put(val, map.get(val) +1);
    }
//
    public int pop() {
        int key = -1;
        int value = 0;

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() > value) {
                value = entry.getValue();
                key = entry.getKey();
            }
        }
        map.put(key, map.get(key)-1);
        return key;
    }
}

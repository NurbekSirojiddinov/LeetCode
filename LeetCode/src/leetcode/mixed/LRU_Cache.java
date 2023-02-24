package leetcode.mixed;

import java.util.*;

public class LRU_Cache {

    Map<Integer, Integer> map;
    int capacity;
    Deque<Integer> deque;

    public LRU_Cache(int capacity) {
        map = new HashMap<>();
        this.capacity = capacity;
        deque = new ArrayDeque<>();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }deque.remove(key);
        deque.addLast(key);
        return map.get(key);
    }

    public void put(int key, int value) {
        map.put(key, value);
        deque.add(key);
        if (map.size() > capacity) {
            map.remove(deque.removeFirst());
        }
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, i);
        }
        map.put(3, 3);
        map2 = new HashMap<>(map);
        map2.remove(3);
        map = new HashMap<>(map2);
        map.put(3, 3);
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

    }
}

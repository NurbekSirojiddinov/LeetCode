package leetcode.hash_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DesignMemoryAllocator {
    int[] arr;
    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();

    public DesignMemoryAllocator(int n) {
        arr = new int[n];
    }

    public int allocate(int size, int mID) {
        if (size > arr.length) {
            return -1;
        }
        if (map.size() == 0) {
            map.put(0, size);
            arr[0] = mID;
            list.add(mID);
            return 0;
        }
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                if (i <= lastIndex) {
                    continue;
                }
                int j = i;
                if (j + size > arr.length) {
                    return -1;
                }
                while (j < arr.length) {
                    if (arr[j] != 0) {
                        if (i + size < j) {
                            arr[i] = mID;
                            map.put(i, size);
                            return i;
                        }
                        i = j + map.get(j);
                        j = i;
                        j--;
                    }
                    j++;
                    if (j - i == size + 1) {
                        arr[i] = mID;
                        map.put(i, size);
                        return i;
                    }
                }
            } else {
                lastIndex = i + map.get(i) - 1;
            }
        }
        return -1;
    }

    public int free(int mID) {
        int numberOfMemoryUnits = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mID) {
                numberOfMemoryUnits += map.get(i);
                arr[i] = 0;
                map.remove(i);
            }
        }
        return numberOfMemoryUnits;
    }

    public static void main(String[] args) {
        DesignMemoryAllocator allocator = new DesignMemoryAllocator(96);
        System.out.println(allocator.allocate(12, 9));
        System.out.println(allocator.allocate(40, 46));
        System.out.println(allocator.allocate(31, 28));
        System.out.println(allocator.free(28));
        System.out.println(allocator.free(9));
        System.out.println(allocator.allocate(22, 14));
        System.out.println(allocator.allocate(29, 70));
    }
}

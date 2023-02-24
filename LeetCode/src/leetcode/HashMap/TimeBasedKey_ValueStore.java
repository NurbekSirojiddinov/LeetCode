package leetcode.HashMap;

import java.util.HashMap;
import java.util.Map;

public class TimeBasedKey_ValueStore {

    Map<String, Map<Integer, String>> map;

    public TimeBasedKey_ValueStore() {
        this.map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            Map<Integer, String> innerMap = new HashMap<>();
            innerMap.put(timestamp, value);
            map.put(key, innerMap);
        } else {
            map.get(key).put(timestamp, value);
        }
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }
        Map<Integer, String> stringMap = map.get(key);
        while (timestamp >= 0) {
            if (stringMap.containsKey(timestamp)) {
                return stringMap.get(timestamp);
            }
            timestamp--;
        }
        return "";
    }

    public static void main(String[] args) {
        TimeBasedKey_ValueStore obj = new TimeBasedKey_ValueStore();
        obj.set("love", "high", 10);
        obj.set("love", "low", 20);
        System.out.println(obj.get("love", 5));
        System.out.println(obj.get("love", 10));
        System.out.println(obj.get("love", 15));
    }
}

package leetcode.hash_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SQL {
    Map<String, Map<Integer, List<String>>> mp = new HashMap<>();
    Map<String, Integer> map = new HashMap<>();

    public SQL(List<String> names, List<Integer> columns) {
        for (String name : names) {
            map.put(name, 0);
        }
    }

    public void insertRow(String name, List<String> row) {
        map.put(name, map.get(name) + 1);
        if (!mp.containsKey(name)) {
            Map<Integer, List<String>> m = new HashMap<>();
            m.put(map.get(name), row);
            mp.put(name, m);
        } else {
            mp.get(name).put(map.get(name), row);
        }
    }

    public void deleteRow(String name, int rowId) {
        mp.get(name).remove(rowId);
    }

    public String selectCell(String name, int rowId, int columnId) {
        return mp.get(name).get(rowId).get(columnId);
    }

    public static void main(String[] args) {
        SQL sql = new SQL(new ArrayList<>(), new ArrayList<>());
    }
}
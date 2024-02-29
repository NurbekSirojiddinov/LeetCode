package leetcode.daily;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        StringBuilder res = new StringBuilder();
        Map<Character, Integer> mp = new HashMap<>();

        for (char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        mp.keySet().stream().sorted().forEach(character -> {
            res.append(character.toString().repeat(mp.get(character)));
        });
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.add(Calendar.DAY_OF_MONTH, -1);

        Date yesterday = calendar.getTime();

        System.out.println(new SortCharactersByFrequency().frequencySort("Hello"));
        System.out.println(yesterday.before(new Date()));
    }
}

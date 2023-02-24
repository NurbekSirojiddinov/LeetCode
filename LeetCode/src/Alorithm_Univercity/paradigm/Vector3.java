package Alorithm_Univercity.paradigm;

import java.util.*;

public class Vector3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println("Elementlar sonini kirirting:");
        int num = scanner.nextInt();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int number = scanner.nextInt();
            integers.add(number);
            if (map.containsKey(number)) {
                int n = map.get(number);
                map.put(number, n+1);
            } else {
                map.put(number, 1);
            }
        }
        int max = map.values().stream().sorted().toList().get(map.size()-1);

        List<Integer> list = new ArrayList<>();
        int searching = 0;

        for (Integer integer : integers) {
            if (!Objects.equals(max, map.get(integer))) {
                list.add(integer);
            }else {
                searching = integer;
            }
        }
        System.out.println("Eng ko`p takrorlangan element : " + searching + ": " + max + " marta takrorlandi");
        System.out.println(list);
    }
}

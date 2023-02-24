package Alorithm_Univercity.Graphic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Vecot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < number; i++) {
            int number1 = scanner.nextInt();
            if (map.containsKey(number1)) {
                int a = map.get(number1);
                map.put(number1, a + 1);
            } else {
                map.put(number1, 1);
            }
        }
        System.out.println("Ixtoyoriy son kirirting");
        int number2 = scanner.nextInt();
        System.out.println(map.get(number2));
        map.remove(number2);
        System.out.println(map);
    }
}

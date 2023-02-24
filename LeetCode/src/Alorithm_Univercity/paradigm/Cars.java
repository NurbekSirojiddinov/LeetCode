package Alorithm_Univercity.paradigm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Automobile automobile = new Automobile("Damas", 100, "Daewo");
        Map<String, Automobile> map = new HashMap<>();
        map.put("Damas", automobile);
        automobile = new Automobile("Nexia", 200, "Chevrolet");
        map.put("Nexi", automobile);
        automobile = new Automobile("Cobalt", 300, "Chavrolet");
        map.put("Cobalt", automobile);

        System.out.print("Avtomobil nomini kiriting : ");
        String name = scanner.next();

        if (map.containsKey(name)) {
            System.out.println(map.get(name));
        }else {
            System.out.println("Bunday mashina mavjud emas");
        }
    }
}

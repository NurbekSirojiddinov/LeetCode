package Alorithm_Univercity.paradigm.amaliy5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindStudent {
    public static void main(String[] args) {
        Map<Integer, Student> map = new HashMap<>();
        map.put(123456789, new Student("Nurbek", "Sirojiddinov", 123456789));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ismni kiriting: ");
        String name = scanner.next();
        System.out.print("Familyani kiriting: ");
        String surname = scanner.next();
        int id = scanner.nextInt();
        if (map.containsKey(id)) {
            System.out.println("Generating questions.....");
            System.out.println(map);
        } else {
            System.out.println("There is no such user!!!");
        }
    }
}

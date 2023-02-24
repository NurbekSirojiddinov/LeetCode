package Alorithm_Univercity.paradigm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("O`quchilar sonini kiriting :");
        int numberOfStudents = scanner.nextInt();
        calculate(numberOfStudents);
    }

    private static void calculate(int numberOfStudents) {
        final Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        map.put("5: ", 0);
        map.put("4: ", 0);
        map.put("3: ", 0);
        Map<String, Integer> students = new HashMap<>();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("O`quvchining ismi: ");
            String name = scanner.next();
            System.out.print("O`quvchining familyasi: ");
            String surname = scanner.next();
            System.out.print("Bahosi: ");

            int grade = scanner.nextInt();
            surname += " " + name;
            students.put(surname, grade);

            switch (grade) {
                case 5 -> {
                    int b = map.get("5: ") + 1;
                    map.put("5: ", b);
                }
                case 4 -> {
                    int t = map.get("4: ") + 1;
                    map.put("4: ", t);
                }
                case 3 -> {
                    int u = map.get("3: ") + 1;
                    map.put("3: ", u);
                }
            }
        }
        for (Map.Entry<String, Integer> entry:students.entrySet()) {
            System.out.println("          " + entry.getKey() + " "+entry.getValue());
        }
        System.out.println();
        System.out.println("          Besh baho oluvchi talabalar soni: "+map.get("5: "));
        System.out.println("          To`rt baho oluvchi talabalar soni: "+map.get("4: "));
        System.out.println("          Uch baho oluvchi talabalar soni: "+map.get("3: "));
    }
}

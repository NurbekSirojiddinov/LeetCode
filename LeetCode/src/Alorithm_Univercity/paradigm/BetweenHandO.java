package Alorithm_Univercity.paradigm;

import java.util.Arrays;
import java.util.Scanner;

public class BetweenHandO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Massiv uzulnligini kiriting:");
        int number = scanner.nextInt();
        String[] massive = new String[number];
        System.out.println("String tipidagi elementlarni kirirting");
        for (int i = 0; i < number; i++) {
            massive[i] = scanner.next();
        }
        System.out.println(Arrays.toString(clearChars(massive)));

    }
    public static String[] clearChars(String[] massive) {
        for (int i = 0; i < massive.length; i++) {
            if (massive[i].length() > 2) {
                int begin = 0;
                int end = massive[i].length()-1;
                StringBuilder collector = new StringBuilder(new String());
                StringBuilder str = new StringBuilder();
                while (begin <= end) {
                    if (massive[i].charAt(begin) != 'H') {
                        begin++;
                    }
                    if (massive[i].charAt(end) != 'O') {
                        end--;
                    }
                    if (massive[i].charAt(begin) == 'H' && massive[i].charAt(end) == 'O') {
                        collector.append(" ".repeat(Math.max(0, end - (begin + 1))));
                        str.append(massive[i], 0, massive[i].indexOf('H')+1);
                        str.append(collector);
                        str.append(massive[i], end, massive[i].length());
                        massive[i] = str.toString();
                        break;
                    }
                }
            }
        }
        return massive;
    }
}
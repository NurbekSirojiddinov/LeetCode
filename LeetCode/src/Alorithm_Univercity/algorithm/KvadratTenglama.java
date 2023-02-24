package Alorithm_Univercity.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class KvadratTenglama {
    public static void main(String[] args) {

        Simplex simplex = new Simplex(2,4);
        System.out.println(Arrays.deepToString(simplex.getTable()));

        Scanner scanner = new Scanner(System.in);

        System.out.print("a ni kiriting ");
        double a = scanner.nextDouble();
        System.out.print("b ni kirirting ");
        double b = scanner.nextDouble();
        System.out.print("c ni kiriting ");
        double c = scanner.nextDouble();

        double x, x1, x2;
        double D = b * b - 4 * a * c;

        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Cheksiz yechimga ega");
        } else if (a == 0 && c == 0) {
            System.out.println(0);
        } else if (a == 0 && b != 0) {
            x = (-1) * c / b;
            System.out.println("x = " + x);
        } else if (a != 0 && b != 0 && c == 0){
            x1 = 0;
            x2 = (-1) * b / (a);
            System.out.println("x1 = " + x1 + "\n" + "x2 = " + x2);
        } else if (b == 0 && c > 0 && a > 0) {
            System.out.println("Tenglama yechimga ega emas!");
        } else if (b == 0 && c < 0 && a < 0) {
            System.out.println("Tenglama yechimga ega emas!");
        } else if ( a != 0 && b == 0 && c < 0) {
            x1 = Math.sqrt((-1)*c / a);
            x2 = -1 * x1;
            System.out.println("x1 = " + x1 + "\n" + "x2 = " + x2);
        } else if (a == 0) {
            System.out.println("Yechimga ega emas");
        }else if (b == 0 && c == 0) {
            System.out.println("x = " + 0);
        } else if (D < 0) {
            System.out.println("Tenglama yechimga ega emas!");
        } else if (D == 0) {
            x = (-1 * b) / (2 * a);
            System.out.println("x " + x);
        } else {
            x1 = (-1 * b + Math.sqrt(D)) / (2 * a);
            x2 = (-1 * b - Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + "\n" + "x2 = " + x2);
        }
    }
}

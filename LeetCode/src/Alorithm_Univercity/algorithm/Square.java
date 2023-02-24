package Alorithm_Univercity.algorithm;

import java.util.Scanner;

import static java.lang.Math.sin;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("x1-> ");
//        int x1 = scanner.nextInt();
//        System.out.print("y1-> ");
//        int y1 = scanner.nextInt();
//        System.out.print("x3-> ");
//        int x3 = scanner.nextInt();
//        System.out.print("y3-> ");
//        int y3 = scanner.nextInt();
////
//      findCoordinate(x1, y1, x3, y3);
        int number = scanner.nextInt();
//     //6
         //calculatePatternIV(number);
     calculatePatternIII(number);
        System.out.print("a ni kiriting-> ");
        double a = scanner.nextDouble();
        System.out.print("b ni kiriting-> ");
        double b = scanner.nextDouble();
        System.out.print("h ni kiriting-> ");
        double h = scanner.nextDouble();
        System.out.print("alfa burchakni kiriting-> ");
        double alfa = scanner.nextDouble();
//
        calculatePrism(a, b, h, alfa);
//        String day = scanner.nextLine();
//        findNumberOfDays(day);
    }

//    private static void findCoordinate(int x1, int y1, int x3, int y3) {
//        int a = Math.abs(y1 - y3);
//        int b = Math.abs(x3 - x1);
//
//        System.out.println("a-> " + a);
//        System.out.println("b-> " + b);
//        System.out.println("D(x4;y4)-> " + "(" + x3 + ";" + y1 + ")");
//        System.out.println("B(x2;y2)-> " + "(" + x1 + ";" + y3 + ")");
//    }

//    private static void calculatePatternII(int number) {
//        System.out.println("P A T T E R N II");
//        while (number != 0) {
//            for (int i = 1; i <= number; i++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//            number--;
//        }
//    }

//    private static void calculatePatternIV(int number) {
//        System.out.println("PATTERN  IV");
//        int b = 0;
//        while (number != 0) {
//            for (int i = 1; i <= number; i++) {
//                System.out.print(i + " ");
//            }
//            number--;
//            b++;
//            System.out.println();
//            for (int j = 0; j < b; j++) {
//                System.out.print("  ");
//            }
//        }
//    }

    private static void calculatePatternIII(int number) {
        System.out.println("PATTERN  III");
        int b = 6;
        int counter = 1;
        System.out.print("            ");
        while (counter != number) {
            for (int i = 1; i <= counter; i++) {
                System.out.print(i + " ");
            }
            counter++;
            b--;
            System.out.println();
            for (int j = 0; j < b; j++) {
                System.out.print("  ");
            }
        }
    }

    private static void calculatePrism(double a, double b, double h, double alfa) {
        final double V = a * b * sin(alfa) * h;
        final double S = 2 * a * b * sin(alfa) + 2 * h * (a + b);

        System.out.println("To`rtburchakli prizmaning hajmi: " + V);
        System.out.println("To`rtburchakli prizmaning sirti: " + S);
    }

    private static void findNumberOfDays(String date) {

        final StringBuilder stringBuilder = new StringBuilder(date);
        stringBuilder.delete(0, date.indexOf('-')+1);
        String day = stringBuilder.toString();
        switch (day) {
            case "Fevral" -> System.out.println("Fevral oyi 28 kundan iborat");
            case "Yanvar" -> System.out.println("Yanvar oyi 31 kundan iborat");
            case "Mart" -> System.out.println("Mart oyi 31 kundan iborat");
            case "Aprel" -> System.out.println("Aprel oyi 30 kundan iborat");
            case "May" -> System.out.println("May oyi 31 kundan iborat");
            case "Iyun" -> System.out.println("Iyun oyi 30 kundan iborat");
            case "Iyul" -> System.out.println("Iyul oyi 31 kundan iborat");
            case "Avgust" -> System.out.println("Avgust oyi 31 kundan iborat");
            case "Sentabr" -> System.out.println("Sentabr oyi 30 kundan iborat");
            case "Oktabr" -> System.out.println("Oktabr oyi 31 kundan iborat");
            case "Noyabr" -> System.out.println("Noyabr oyi 30 kundan iborat");
            case "Dekabr" -> System.out.println("Dekabr oyi 31 kundan iborat");
            default -> System.out.println("bunday oy mavjud emas!!!");
        }
    }
}
/*
 * |
 * |A(x1;y1)3 9    d        D(x4;y4)
 * |
 * |a                            c
 * |
 * |B(x2;y2)             C(x3;y3)9 5
 * |           b
 * |----------------------->
 * */

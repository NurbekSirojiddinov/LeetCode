package Alorithm_Univercity.algorithm;

import java.util.Scanner;

public class grouping {
    public static void main(String[] args) {
        double a1 = 1023./1024;
        System.out.println(a1);
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int above = recursion(b);
        System.out.println(above);
        int low = recursion(a) * recursion(b - a);
        System.out.println((above / low));
    }

    private static int recursion(int num) {
        int[] array = new int[num+1];
        if (num == 1 || num == 0) return 1;
        array[0] = 1;
        array[1] = 1;
        for (int i = 1; i < num+1; i++) {
            array[i] = array[i - 1] * i;
        }
        return array[num];
    }
}

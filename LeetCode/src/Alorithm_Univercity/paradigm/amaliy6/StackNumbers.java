package Alorithm_Univercity.paradigm.amaliy6;

import java.util.Scanner;
import java.util.Stack;

import static java.lang.Math.max;

public class StackNumbers {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elementlar soni: ");
        int elements = scanner.nextInt();
        System.out.println("Elementlarni kiriting");
        int max = 0;

        for (int i = 0; i < elements; i++) {
            int number = scanner.nextInt();
            max = max(number, max);
            stack.add(number);
        }
        for (int i = 0; i < stack.size(); i++) {
            if (stack.get(i) == max) {
                stack.add(i + 1, 0);
            }
        }
        System.out.println(stack);
    }
}

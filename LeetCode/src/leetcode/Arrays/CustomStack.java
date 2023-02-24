package leetcode.Arrays;

import java.util.Stack;

public class CustomStack {
    Stack<Integer> stack;
    int maxSize;

    public CustomStack(int maxSize) {
        stack = new Stack<>();
        this.maxSize = maxSize;
    }

    public void push(int x) {
        if (stack.size() < maxSize) {
            stack.push(x);
        }
    }

    public int pop() {
        return stack.isEmpty() ? -1 : stack.pop();
    }

    public void increment(int k, int val) {
        int index = 0;
        while (index < stack.size() && k != 0) {
            int num = stack.get(index);
            stack.remove(index);
            stack.add(index, num + val);
            index++;
            k--;
        }
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(3);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.increment(5, 100);
        stack.increment(2, 100);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

package leetcode.daily;

import java.util.Stack;

class MyQueue {

    Stack<Integer> stack;

    public MyQueue() {
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.add(x);
    }

    public int pop() {
        return stack.pop();
    }

    public int peek() {
        return stack.get(0);
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
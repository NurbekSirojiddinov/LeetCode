package leetcode.design;

import java.util.ArrayList;
import java.util.List;

public class MyCircularQueue {

    List<Integer> myQueue;
    int size;
    int index = 0;

    public MyCircularQueue(int k) {
        this.myQueue = new ArrayList<>();
        this.size = k;
    }

    public boolean enQueue(int value) {
        if (index < size) {
            myQueue.add(value);
            index++;
            return true;
        }
        return false;
    }

    public boolean deQueue() {
        if (myQueue.isEmpty()) return false;
        myQueue.remove(0);
        index--;
        return true;
    }

    public int Front() {
        if (myQueue.isEmpty()) return -1;
        return myQueue.get(0);
    }

    public int Rear() {
        if (myQueue.isEmpty()) return -1;
        return myQueue.get(myQueue.size() - 1);
    }

    public boolean isEmpty() {
        return myQueue.isEmpty();
    }

    public boolean isFull() {
        return myQueue.size() == size;
    }

    public static void main(String[] args) {
        MyCircularQueue deque = new MyCircularQueue(3);
        System.out.println(deque.enQueue(1));
        System.out.println(deque.enQueue(2));
        System.out.println(deque.enQueue(3));
        System.out.println(deque.enQueue(4));
        System.out.println(deque.Rear());
        System.out.println(deque.isFull());
        System.out.println(deque.deQueue());
        System.out.println(deque.enQueue(4));
        System.out.println(deque.Rear());

    }
}

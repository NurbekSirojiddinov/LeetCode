package leetcode.design;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyCircularDeque {

    Deque<Integer> deque = new ArrayDeque<>();

    int numberOfElements = 0;
    int size;

    public MyCircularDeque(int k) {
        this.size = k;
    }

    public boolean insertFront(int value) {
        if (numberOfElements < size) {
            deque.offerFirst(value);
            numberOfElements++;
            return true;
        }
        return false;
    }

    public boolean insertLast(int value) {
        if (numberOfElements < size) {
            deque.offerLast(value);
            numberOfElements++;
            return true;
        }
        return false;
    }

    public boolean deleteFront() {
        if (!deque.isEmpty()) {
            deque.removeFirst();
            numberOfElements--;
            return true;
        }
        return false;
    }

    public boolean deleteLast() {
        if (!deque.isEmpty()) {
            deque.removeLast();
            numberOfElements--;
            return true;
        }
        return false;
    }

    public int getFront() {
        if (deque.isEmpty()) {
            return -1;
        }
        return deque.getFirst();
    }

    public int getRear() {
        if (deque.isEmpty()) {
            return -1;
        }
        return deque.getLast();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public boolean isFull() {
        return numberOfElements == size;
    }

    public static void main(String[] args) {
        MyCircularDeque circularDeque = new MyCircularDeque(5);
        System.out.println(circularDeque.insertFront(1));
        System.out.println(circularDeque.insertLast(1));
        System.out.println(circularDeque.getFront());
        System.out.println(circularDeque.getRear());
        System.out.println(circularDeque.isEmpty());
        System.out.println(circularDeque.isFull());
        System.out.println(circularDeque.deleteFront());
        System.out.println(circularDeque.deleteLast());
    }
}

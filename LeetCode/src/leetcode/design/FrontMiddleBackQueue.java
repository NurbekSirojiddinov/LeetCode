package leetcode.design;

import java.util.LinkedList;
import java.util.List;

public class FrontMiddleBackQueue {

    List<Integer> list;

    public FrontMiddleBackQueue() {
        this.list = new LinkedList<>();
    }

    public void pushFront(int val) {
        list.add(0, val);
    }

    public void pushMiddle(int val) {
        list.add(list.size() / 2, val);
    }

    public void pushBack(int val) {
        list.add(val);
    }

    public int popFront() {
        if (list.isEmpty()) return -1;
        return list.remove(0);
    }

    public int popMiddle() {
        if (list.isEmpty()) return -1;
        if (list.size() % 2 == 0) return list.remove(list.size() / 2 - 1);
        return list.remove(list.size() / 2);
    }

    public int popBack() {
        if (list.isEmpty()) return -1;
        return list.remove(list.size() - 1);
    }

    public static void main(String[] args) {
        FrontMiddleBackQueue queue = new FrontMiddleBackQueue();
        queue.pushFront(1);
        queue.pushBack(2);
        queue.pushMiddle(3);
        queue.pushMiddle(4);
        System.out.println(queue.popFront());
        System.out.println(queue.popMiddle());
        System.out.println(queue.popMiddle());
        System.out.println(queue.popBack());
        System.out.println(queue.popBack());
    }
}

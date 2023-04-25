package leetcode.arrays;

class MyCircularQueue {
    int[] arr;
    int front;
    int back;
    int k = 0;

    public MyCircularQueue(int k) {
        this.arr = new int[k];
        this.front = 0;
        this.back = -1;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        } else if (back == arr.length - 1) {
            back = -1;
        }
        arr[++back] = value;
        k++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        if (front == arr.length - 1) {
            front = -1;
        }
        front++;
        k--;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[back];
    }

    public boolean isEmpty() {
        return k == 0;
    }

    public boolean isFull() {
        return k == arr.length;
    }

    public static void main(String[] args) {
        MyCircularQueue queue = new MyCircularQueue(3);
        System.out.println(queue.enQueue(2));
        System.out.println(queue.enQueue(2));
        System.out.println(queue.deQueue());
        System.out.println(queue.Front());
        System.out.println(queue.Rear());
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
    }
}

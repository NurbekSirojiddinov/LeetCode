package leetcode.mixed;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class PeekingIterator implements Iterator<Integer> {
    List<Integer> list = new ArrayList<>();
    int count = 0;

    public PeekingIterator() {};

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return list.get(count);
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer value = list.get(count);
        count++;
        return value;
    }

    @Override
    public boolean hasNext() {
        return count < list.size();
    }

    public static void main(String[] args) {
        PeekingIterator peekingIterator = new PeekingIterator();
    }
}

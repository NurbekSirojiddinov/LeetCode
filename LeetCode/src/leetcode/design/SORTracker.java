package leetcode.design;

import java.util.*;

public class SORTracker {

    TreeSet<MyClass> set;
    int calls = 0;

    public SORTracker() {
        set = new TreeSet<>();
    }

    public void add(String name, int score) {
        set.add(new MyClass(name, score));
    }

    public String get() {
        List<MyClass> list = new ArrayList<>(set);
        calls++;
        return list.get(list.size() - calls).getName();
    }
}

class MyClass implements Comparable<MyClass> {
    private String name;
    private int score;

    public MyClass(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(MyClass o) {
        int result = Integer.compare(this.score, o.score);

        if (result == 0) {
            result = this.name.compareTo(o.name) * (-1);
        }
        return result;
    }

    public static void main(String[] args) {
        SORTracker tracker = new SORTracker();
        tracker.add("brandford", 2);
        tracker.add("branford", 3);
        System.out.println(tracker.get());
        tracker.add("alps", 2);
        System.out.println(tracker.get());
        tracker.add("orland", 2);
        System.out.println(tracker.get());
        tracker.add("orlando", 3);
        System.out.println(tracker.get());
        tracker.add("alpine", 2);
        System.out.println(tracker.get());
        System.out.println(tracker.get());
    }
}

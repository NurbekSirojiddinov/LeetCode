package leetcode.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HighFive {
    public static int[][] highFive(int[][] items) {
        Student[] students = new Student[items.length];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < items.length; i++) {
            students[i] = new Student(items[i][0], items[i][1]);
        }

        Arrays.sort(students, Comparator.comparing(Student::getID).thenComparing(Student::getScore));
        int counter = 0;

        for (int i = students.length - 1; i >= 0; i--) {
            if (counter == 5) {
                while (i >= 0 && map.containsKey(students[i].getID())) {
                    i--;
                }
                i++;
                counter = 0;
            } else {
                counter++;
                map.put(students[i].getID(), map.getOrDefault(students[i].getID(), 0) + students[i].score);
                if (counter == 5) map.put(students[i].getID(), map.get(students[i].getID()) / 5);
            }
        }
        int[][] arr = new int[map.size()][2];
        int index = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            arr[index][0] = entry.getKey();
            arr[index][1] = entry.getValue();
            index++;
        }
        return arr;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(highFive(new int[][]{{1, 91}, {1, 92}, {2, 93}, {2, 97}, {1, 60}, {2, 77}, {1, 65}, {1, 87}, {1, 100}, {2, 100}, {2, 76}})));
    }
}

class Student {
    int ID;
    int score;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(int ID, int score) {
        this.ID = ID;
        this.score = score;
    }
}

package Alorithm_Univercity.paradigm;

import java.util.ArrayList;
import java.util.List;

public class Toplam {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>(List.of(1, 2.2, 3, 4, 5, 6, 3.2, 3.3, 7, 8, 9, 10.2));
        List<Integer> integers = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();

        for (Object item : list) {
            if (item.getClass() == Integer.class) {
                integers.add((Integer) item);
            } else {
                doubles.add((Double) item);
            }
        }
        System.out.println("Butun sonlar: " + integers);
        System.out.println("Haqiqiy sonlar: " + doubles);
    }
}

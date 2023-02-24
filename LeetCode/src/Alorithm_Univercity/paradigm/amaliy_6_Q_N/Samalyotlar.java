package Alorithm_Univercity.paradigm.amaliy_6_Q_N;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Samalyotlar {
    public String nomi;
    public int uzunligi;
    public int tezligi;

    public Samalyotlar(String nomi, int uzunligi, int tezligi) {
        this.nomi = nomi;
        this.uzunligi = uzunligi;
        this.tezligi = tezligi;
    }

    public int getUzunligi() {
        return uzunligi;
    }

    @Override
    public String toString() {
        return "Samalyotlar{" +
                "nomi='" + nomi + '\'' +
                ", uzunligi='" + uzunligi + '\'' +
                ", tezligi='" + tezligi + '\'' +
                '}';
    }
    public static void main(String[] args) {
        List<Samalyotlar> samalyotlars = new ArrayList<>();
        Random tezlik = new Random(50);
        for (int i = 1; i < 4000; i++) {
            samalyotlars.add(new Samalyotlar(i + "_samalyot", speed(4000, 5000), speed(40, 500)));

        }

        System.out.println("Samalyotlar listi");
        samalyotlars.forEach(System.out::println);
        samalyotlars.sort(Comparator.comparing(Samalyotlar::getUzunligi));
        System.out.println();
        System.out.println("Samalyotlar listi sort bo`lgandan keyingi xolati");
        System.out.println();
        samalyotlars.forEach(System.out::println);

    }

    public static int speed(int min, int max) {
        Random random = new Random();
        return random.ints(min, max)
                .findFirst()
                .getAsInt();
    }
}


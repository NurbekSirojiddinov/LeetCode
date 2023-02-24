package Alorithm_Univercity.paradigm.amaliy6;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Computer {
    private int chastota;
    private int yadros;
    private BigInteger storage;

    public int getChastota() {
        return chastota;
    }

    public void setChastota(int chastota) {
        this.chastota = chastota;
    }

    public int getYadros() {
        return yadros;
    }

    public void setYadros(int yadros) {
        this.yadros = yadros;
    }

    public BigInteger getStorage() {
        return storage;
    }

    public void setStorage(BigInteger storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "chastota=" + chastota +
                ", yadros=" + yadros +
                ", storage=" + storage +
                '}';
    }

    public Computer(int chastota, int yadros, BigInteger storage) {
        this.chastota = chastota;
        this.yadros = yadros;
        this.storage = storage;
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer(12345, 8, new BigInteger("648427927648264826482587578547547787854764754754753443"));
        Computer computer2 = new Computer(145, 8, new BigInteger("748427927648264826482587578547547787854764754754753443"));
        Computer computer3 = new Computer(1345, 8, new BigInteger("848427927648264826482587578547547787854764754754753443"));
        Computer computer4 = new Computer(1245, 8, new BigInteger("948427927648264826482587578547547787854764754754753443"));
        List<Computer> computers = new ArrayList<>(List.of(computer1, computer2, computer3, computer4));
        computers.sort(Comparator.comparing(Computer::getStorage));
        System.out.println(computers);
    }
}

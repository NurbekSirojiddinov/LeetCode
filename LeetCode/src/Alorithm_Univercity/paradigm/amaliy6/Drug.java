package Alorithm_Univercity.paradigm.amaliy6;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Drug extends Product {
    private int cost;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "cost=" + cost +
                '}';
    }

    public Drug(String name, Instant availability, int cost) {
        super(name, availability);
        this.cost = cost;
    }

    public static void main(String[] args) {
        Drug drug1 = new Drug("drug1", Instant.now(), 50000);
        Drug drug2 = new Drug("drug2", Instant.now(), 47000);
        Drug drug3 = new Drug("drug1", Instant.now(), 24000);
        Drug drug4 = new Drug("drug1", Instant.now(), 18000);
        List<Drug> drugs = new ArrayList<>(List.of(drug1, drug2, drug3, drug4));
        drugs.sort(Comparator.comparing(Drug::getCost));
        System.out.println(drugs);
        drugs.sort(Comparator.comparing(Drug::getCost).reversed());
        System.out.println(drugs);

    }
}

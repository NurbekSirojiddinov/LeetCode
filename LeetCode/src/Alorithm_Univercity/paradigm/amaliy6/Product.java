package Alorithm_Univercity.paradigm.amaliy6;

import java.time.Instant;

public class Product {
    private String name;
    private Instant availability;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getAvailability() {
        return availability;
    }

    public void setAvailability(Instant availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "pProduct{" +
                "name='" + name + '\'' +
                ", availability=" + availability +
                '}';
    }

    public Product(String name, Instant availability) {
        this.name = name;
        this.availability = availability;
    }
}

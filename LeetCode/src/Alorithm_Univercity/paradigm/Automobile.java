package Alorithm_Univercity.paradigm;

public class Automobile {
    private String name;
    private Integer cost;
    private String marka;

    public Automobile(String name, Integer cost, String marka) {
        this.name = name;
        this.cost = cost;
        this.marka = marka;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", marka='" + marka + '\'' +
                '}';
    }
}

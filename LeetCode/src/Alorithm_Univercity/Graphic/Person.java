package Alorithm_Univercity.Graphic;

public class Person {
    String name;
    String familyasi;
    boolean uylangan;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", familyasi='" + familyasi + '\'' +
                ", uylangan=" + uylangan +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyasi() {
        return familyasi;
    }

    public void setFamilyasi(String familyasi) {
        this.familyasi = familyasi;
    }

    public boolean isUylangan() {
        return uylangan;
    }

    public void setUylangan(boolean uylangan) {
        this.uylangan = uylangan;
    }
}

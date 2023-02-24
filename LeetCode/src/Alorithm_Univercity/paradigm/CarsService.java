package Alorithm_Univercity.paradigm;

public class CarsService {
    public String Mark;
    public String Rusm;
    public String Year;
    public String Dvigitel;
    public String Kuchi;
    public String Davlat;
    public String Kompny;

    public CarsService(String mark, String rusm, String year, String dvigitel, String kuchi, String davlat, String kompny) {
        Mark = mark;
        Rusm = rusm;
        Year = year;
        Dvigitel = dvigitel;
        Kuchi = kuchi;
        Davlat = davlat;
        Kompny = kompny;
    }

    public String getMark() {
        return Mark;
    }

    public void setMark(String mark) {
        Mark = mark;
    }

    public String getRusm() {
        return Rusm;
    }

    public void setRusm(String rusm) {
        Rusm = rusm;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getDvigitel() {
        return Dvigitel;
    }

    public void setDvigitel(String dvigitel) {
        Dvigitel = dvigitel;
    }

    public String getKuchi() {
        return Kuchi;
    }

    public void setKuchi(String kuchi) {
        Kuchi = kuchi;
    }

    public String getDavlat() {
        return Davlat;
    }

    public void setDavlat(String davlat) {
        Davlat = davlat;
    }

    public String getKompny() {
        return Kompny;
    }

    public void setKompny(String kompny) {
        Kompny = kompny;
    }

    @Override
    public String toString() {
        return "CarsService{" +
                "Mark='" + Mark + '\'' +
                ", Rusm='" + Rusm + '\'' +
                ", Year='" + Year + '\'' +
                ", Dvigitel='" + Dvigitel + '\'' +
                ", Kuchi='" + Kuchi + '\'' +
                ", Davlat='" + Davlat + '\'' +
                ", Kompny='" + Kompny + '\'' +
                '}';
    }
}

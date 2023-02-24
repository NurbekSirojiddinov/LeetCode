package Alorithm_Univercity.paradigm.amaliy_6_Q_N;

public class Xodimlar {
    private String FIO;

    private Integer yoshi;

    private String jinsi;

    public Xodimlar(String FIO, Integer yoshi, String jinsi) {
        this.FIO = FIO;
        this.yoshi = yoshi;
        this.jinsi = jinsi;
    }

    public Xodimlar() {
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public Integer getYoshi() {
        return yoshi;
    }

    public void setYoshi(Integer yoshi) {
        this.yoshi = yoshi;
    }

    public String getJinsi() {
        return jinsi;
    }

    public void setJinsi(String jinsi) {
        this.jinsi = jinsi;
    }
}


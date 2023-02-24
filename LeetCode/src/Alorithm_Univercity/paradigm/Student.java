package Alorithm_Univercity.paradigm;

public class Student {
    private String name;
    private String sinf;
    private int grade;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinf() {
        return sinf;
    }

    public void setSinf(String sinf) {
        this.sinf = sinf;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sinf='" + sinf + '\'' +
                ", grade=" + grade +
                '}';
    }
}

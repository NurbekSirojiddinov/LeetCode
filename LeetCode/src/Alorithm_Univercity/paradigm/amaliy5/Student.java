package Alorithm_Univercity.paradigm.amaliy5;

public class Student {
    private String name;
    private String surname;
    private int fingerId;

    public Student(String name, String surname, int fingerId) {
        this.name = name;
        this.surname = surname;
        this.fingerId = fingerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getFingerId() {
        return fingerId;
    }

    public void setFingerId(String fingerId) {
        this.fingerId = Integer.parseInt(fingerId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fingerId='" + fingerId + '\'' +
                '}';
    }
}

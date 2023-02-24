package Alorithm_Univercity.paradigm;

import java.time.Instant;

public class Worker {

    private String fullName;

    private String position;

    private Instant time;

    private Integer stage;

    private Integer salary;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Instant getTime() {
        return time;
    }

    public void setTime(Instant time) {
        this.time = time;
    }

    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", time=" + time +
                ", stage=" + stage +
                ", salary=" + salary +
                '}';
    }
}

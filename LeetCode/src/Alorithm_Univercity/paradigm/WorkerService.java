package Alorithm_Univercity.paradigm;

import java.time.Instant;

public class WorkerService {
    public static void main(String[] args) {
        final Worker worker = new Worker();
        worker.setFullName("John Doe");
        worker.setPosition("Developer");
        worker.setSalary(1000);
        worker.setTime(Instant.now());
        worker.setStage(5);

        System.out.println(worker);
    }
}

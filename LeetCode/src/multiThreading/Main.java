package multiThreading;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.increment();
                }
            }).start();
        }

        // Wait for all threads to finish
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count: " + counter.getCount());
    }
}

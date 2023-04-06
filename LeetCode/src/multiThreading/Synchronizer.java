package multiThreading;

public class Synchronizer {

    private Object object = null;

    public Object getObject() {
        return object;
    }

    public synchronized void setObject(Object object) {
        this.object = object;
    }

    public static void main(String[] args) {
        Synchronizer synchronizer = new Synchronizer();
        Synchronizer synchronizer2 = new Synchronizer();
        int a = 10;

        Thread thread1 = new Thread(() -> {
            synchronizer.setObject("Thread One");
            System.out.println(synchronizer.getObject());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread2 = new Thread(() -> {
            System.out.println(synchronizer2.getObject());
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        });

        thread1.start();
        thread2.start();
    }
}
class A  {
    public  static int a= 10;
    int b = 0;

    {
        a *= 3;
        System.out.println(a);
    }
    static {
        a += 5;
    }

    public A() {
        System.out.println(a);
        System.out.println(a*2);
    }

    public int getVal() throws Exception {
        return 21;
    }

    public static void main(String[] args) {
        int a = 3;
        System.out.println(a<<2);
        A a1 = new A();
//        A a = new A();
//        A a2 = new A();
//        System.out.println();
    }
}

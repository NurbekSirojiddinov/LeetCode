//package leetcode.interview;
//
//public class A2 {
//    static boolean isTrue(String name) {
//        int data = 50;
//        switch (name) {
//            case "Nurbek" -> System.out.println("Nurbek");
//            case "Sadriddin" -> System.out.println("Sadriddin");
//            case "Farrux" -> System.out.println("Farrux");
//            default -> System.out.println("Guli");
//        }
//        return true;
//    }
//    public void change(int data) {
//        data = 100;
//    }
//
//    public static void main(String[] args) {
//        A2 obj = new A2();
//        System.out.println(isTrue("Nurbek"));
//        System.out.println(isTrue("Guli"));
//        int a = 50;
//        obj.change(a);
//        System.out.println(a);
//    }
//}
//
//class Student implements Cloneable {
//    public String name = "Hellll";
//    static int grade;
//    static String schoolName;
//    private int anInt;
//    int a = 0;
//
//    public int getAnInt() {
//        return anInt;
//    }
//
//    public void setAnInt(int anInt) {
//        this.anInt = anInt;
//    }
//
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//
//    public static void main(String[] args) {
//        Student obj = new Student();
//    }
//}
//class Child extends Student {
//    int a = 6;
//    //private String name = "hello";
//    public static void main(String[] args) {
//        Child child = new Child();
//        System.out.println(child.name);
//        Student child1 = new Child();
//        Student student = new Student();
//        Child child2 = new Child();
//        System.out.println(child2.a);
//        A a = new A();
//        try {
//            Student student1 = (Student) student.clone();
//        } catch (CloneNotSupportedException e) {
//
//        }
//    }
//}
//interface AB {
//    void a();
//}

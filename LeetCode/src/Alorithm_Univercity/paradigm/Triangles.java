package Alorithm_Univercity.paradigm;

public class Triangles {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3., 4., 5.);
        System.out.println("Uchburchakning tomonlari: " + triangle);
        triangle.setA(6.);
        System.out.println("Qayta ishlangan tomonlar: " + triangle);
    }
}

package Alorithm_Univercity.algorithm;

import static java.lang.Math.*;

///https://github.com/SValentyn/Solving-Transcendental-Equations/blob/master/src/BisectionMethodAlgorithm.java
public class lab1_2 {
    public static void main(String[] args) {
        double a = PI;
        double b = 2*PI;
        double S = 0;
        double h = (b - a) / 100;

        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            S += function(  (a + i * h) + h / 2);
            if (i % 10 == 0) {
                System.out.println("Xi: " + (a + i * h) + h / 2);
                System.out.println("Fx(i)/y(i): " + function(a + i * h) + h / 2);
                System.out.println("h*F(x(i)): " + h * S);
                System.out.println();
            }
            sum += h*S;
        }
        System.out.println(sum);
        System.out.println();

        S = function(a) + function(b);
         sum = 0;

        for (int i = 1; i <= 100; i++) {
            S += 2 * function(a + i * h);
            if (i % 10 == 0) {
                System.out.println("Xi: " + (a + i * h));
                System.out.println("Fx(i)/y(i): " + function(a + i * h));
                System.out.println("h*F(x(i)): " + (h / 2) * S);
                System.out.println();
            }
            sum += (h / 2) * S;
        }
        System.out.println(sum);
        System.out.println();
        lab1_2.integrate(a, b);
    }

    public static void integrate(double a, double b) {
        int N = 100;                    // precision parameter
        double h = (b - a) / (N - 1);     // step size
        double sum = 1.0 / 3.0 * (function(a) + function(b));

        double temp = 0;
        for (int i = 2; i <= N; i += 2) {
            double x = a + h * i;
            sum += 4.0 / 3.0 * function(x);
        }
        for (int i = 2; i <= N; i += 1) {
            double x = a + h * i;
            sum += (2.0 / 3.0) * function(x);
            if (i % 10 == 0) {
                System.out.println("Xi: " + function(x));
                System.out.println("Fx(x)/y(i) : " + x);
                System.out.println("h*Fx(i): "+sum * h);
                System.out.println();
            }
            temp += sum*h;
        }
        System.out.println("res: " + temp/2);
    }

    private static double function(double x) {
        return (x+cos(x))/(x*x + 2*sin(x));}
}

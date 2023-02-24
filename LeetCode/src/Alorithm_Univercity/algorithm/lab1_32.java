package Alorithm_Univercity.algorithm;

import static java.lang.Math.log;

class lab1_32 {
    static double f(double x) {
        return Math.log(1+Math.pow(x, 4))/(Math.log(5)) + x - 2;
    }

    static void secant(double x1, double x2,
                       double E) {
        double xm, x0, c;
        if (f(x1) * f(x2) < 0) {
            do {
                x0 = (x1 * f(x2) - x2 * f(x1))
                        / (f(x2) - f(x1));
                c = f(x1) * f(x0);
                x1 = x2;
                x2 = x0;
                if (c == 0)
                    break;
                xm = (x1 * f(x2) - x2 * f(x1))
                        / (f(x2) - f(x1));
            } while (Math.abs(xm - x0) >= E);
            System.out.println("Root of the" +
                    " given equation=" + x0);
        } else
            System.out.print("Can not find a"
                    + " root in the given interval");
    }

    public static void main(String[] args) {
        double x1 = 1.2, x2 = 1.4, E = 0.1;
        secant(x1, x2, E);
        for (int i = 0; i <= 5; i++) {
            secant(x1, x2, E);
            E = E / 10;
        }
    }
}
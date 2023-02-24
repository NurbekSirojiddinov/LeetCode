package Alorithm_Univercity.algorithm;

class lab1_3 {
    static double EPSILON = 1./10;

    static double func(double x)
    {
        return Math.log(1+Math.pow(x, 4))/(Math.log(5)) + x - 2;
    }
    static void bisection(double a, double b) {
        if (func(a) * func(b) >= 0) {
            System.out.println("You have not assumed"
                    + " right a and b");
            return;
        }

        double c = a;
        while ((b-a) >= EPSILON) {
            // Find middle point
            c = (a+b)/2;

            if (func(c) == 0.0)
                break;
            else if (func(c)*func(a) < 0)
                b = c;
            else
                a = c;
        }
        System.out.printf("The value of root is : %.4f",c);
        System.out.println();
        EPSILON = EPSILON*1/10;
    }

    public static void main(String[] args) {
        double a =1.2, b = 1.4;
        for (int i = 0; i <= 5; i++) {
            bisection(a,b);
            System.out.println();
        }
    }
}

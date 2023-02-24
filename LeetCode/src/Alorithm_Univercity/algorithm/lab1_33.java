package Alorithm_Univercity.algorithm;
class lab1_33 {
    static final double EPSILON = 0.000001;
    static double func(double x)
    {
        return Math.log(1+Math.pow(x, 4))/(Math.log(5)) + x - 2;
    }
    static double derivFunc(double x)
    {
        return 3 * x * x - 2 * x;
    }
    static void newtonRaphson(double x)
    {
        double h = func(x) / derivFunc(x);
        while (Math.abs(h) >= EPSILON)
        {
            h = func(x) / derivFunc(x);
            x = x - h;
        }
        System.out.print("The value of the" + " root is : " + Math.round(x * 100.0) / 100.0);
    }
    public static void main (String[] args)
    {double x0 = 1.3;
        newtonRaphson(x0);
    }
}

// This code is contributed by Anant Agarwal.

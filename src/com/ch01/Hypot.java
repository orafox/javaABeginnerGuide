package com.ch01;

public class Hypot {
    public static void main(String[] args) {
        double x,y,z;
        x=3;
        y=4;

        z = Math.sqrt(x * x+y * y);
        System.out.println("Hypotenus is "+z);

        int iresult , irem ;
        double dresult ,drem;

        iresult = 10 / 3;

        irem = 10%3;

        dresult = 10/3;
        drem = 10%3;

        System.out.println("result and remainder of 10/3 :" + iresult + " " + irem);
        System.out.println("result and remainder of 10.0/3 :" + dresult + " " + irem);


        int n ,d,q;
        n=10;
        d=2;
        if (d!=0 && (n%d) == 0 )
            System.out.println(d + "is a factor of " + n);
        d = 0;

        if (d != 0 && (n % d) == 0) {
            System.out.println(d + "is a factor of " + n);

        }
//        if (d != 0 & (n % d) == 0) {
//            System.out.println(d + "is a factor of " + n);
//            System.out.println(d + "is a factor of " + n);
//
//        }

        int i = 1;
        if (false && (++i < 100)) {
            System.out.println("will not display");
        }
        System.out.println("i = " + i);
        if (false & (++i < 100)) {
            System.out.println("will not display");
        }
        System.out.println("i = " + i);
        i -= 100;
        long islong = 10000L;
        double isDouble = 1000.0;
        isDouble = islong;

        islong =(long) isDouble;

    }
}

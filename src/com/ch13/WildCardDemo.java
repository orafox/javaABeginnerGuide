package com.ch13;

public class WildCardDemo {
    public static void main(String[] args) {
        NumericFns<Integer> iOb = new NumericFns<Integer>(6);
        NumericFns<Double> dOb = new NumericFns<Double>(-6.0);
        NumericFns<Long> lOb = new NumericFns<Long>(5L);
        System.out.println("Testing iob abd dob");
        if (iOb.absEqual(dOb)) {
            System.out.println("absolute value are equal");

        } else
            System.out.println("absolute value differ");
        System.out.println();
        System.out.println("testing iob and lob");
        if (iOb.absEqual(lOb)) {
            System.out.println("absolute value are equal");
        } else System.out.println("absolute value differ");


    }
}

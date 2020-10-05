package com.ch13;

public class BoudsDemo {
    public static void main(String[] args) {
        NumericFns<Integer> iOb = new NumericFns<Integer>(5);
        System.out.println("Reciprocal of iob is " + iOb.reciprocal());
        System.out.println("Fractional component of iOb is " + iOb.fraction());
        System.out.println();
        NumericFns<Double> dOb = new NumericFns<Double>(5.25);
        System.out.println("Reciprocal of dOb is " + dOb.reciprocal());
        System.out.println("fractional of dOb is " + dOb.fraction());
        System.out.println();
//        NumericFns<String>
    }
}

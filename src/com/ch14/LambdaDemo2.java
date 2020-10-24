package com.ch14;

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isFactor = (n,d) -> (n%d) == 0;
        if (isFactor.test(10, 2)) {
            System.out.println("2 is factor of 10");

        }
        if (!isFactor.test(3, 10)) {
            System.out.println("3 is not a factor of 10");

        }
        NumericTest lessThen = (n, m) -> (n < m);
        if (lessThen.test(2, 10)) {
            System.out.println("2 is less 10");
        }
        if (!lessThen.test(10, 2)) {
            System.out.println("10 is not less 2");
        }

        NumericTest absEqual = (n, m) -> (n<0 ? -n : n) == (m < 0 ? -m : m);
        if (absEqual.test(4, -4)) {
            System.out.println("absoulte values of 4 and -4 are equal");

        }
        if (!lessThen.test(4, -5)) {
            System.out.println("absolute value of 4 and -5 not equal");

        }

    }
}

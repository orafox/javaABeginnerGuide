package com.ch14;

public class MethodRefDemo {
    static boolean numTest(IntPredicate p, int v) {
        return p.test(v);
    }

    public static void main(String[] args) {
        boolean result;
        result = numTest(MyIntpredicates::isPositive, 17);
        if (result)
            System.out.println("17 is prime");
        result = numTest(MyIntpredicates::isEven, 12);
        if(result)
            System.out.println("12 is even");
        result = numTest(MyIntpredicates::isPositive, 11);
        if (result)
            System.out.println("11 is positive.");
    }
}

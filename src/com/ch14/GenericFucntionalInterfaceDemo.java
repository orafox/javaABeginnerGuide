package com.ch14;

import com.ch14.SomeTest;

public class GenericFucntionalInterfaceDemo {
    public static void main(String[] args) {
        SomeTest<Integer> isFactor = (n, d) -> (n%d) == 0 ;
        if (isFactor.test(10, 2))
            System.out.println("2 is a factor of 10 ");
        System.out.println();
        SomeTest<Double> isFactorD = (n, d) -> (n % d) == 0;
        if (isFactorD.test(212.0, 4.0))
            System.out.println("4 is a factor of 212");
        System.out.println();
        SomeTest<String> IsIn = (a, b) -> a.indexOf(b) !=-1;

        String str = "Generic fucntional interface ";
        System.out.println("testing string :" + str);
        if (IsIn.test(str,"face"))
            System.out.println("face is found ");
        else
            System.out.println("face not found");
    }
}

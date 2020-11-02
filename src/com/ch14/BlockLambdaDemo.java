package com.ch14;

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc smallestF = (n) -> {
            int result = 1;
            n = n < 0 ? -n : n;
            for (int i = 2; i <= n / i; i++) {
                System.out.println( n);
                System.out.println(i);
                System.out.println(n / i);
                if ((n % i) == 0) {
                          result = i;
                    System.out.println( result);
                    break;
                }

            }
            return result;
        };

//        System.out.println("smallest factor of 12 is " + smallestF.func(12));
        System.out.println("smallest factor of 11 is " + smallestF.func(11));
    }
}

package com.ch01;

public class ForVar {
    public static void main(String[] args) {
        int sum = 0, fact = 1;

        for (int i = 1; i < 5; i++) {
            sum += i;
            fact *= i;
        }
        System.out.println("Sum is " + sum + "\n Factorial is " + fact);
    }
}

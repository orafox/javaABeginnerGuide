package com.ch09;

public class ThrowDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Before Throw.");
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught");
        }
        System.out.println("after try/catch");
    }
}

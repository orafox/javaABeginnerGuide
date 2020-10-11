package com.ch07;

public class B extends A {
    void meth1() {
        System.out.println("Illegal");
    }

    public static void main(String[] args) {
        new B().meth1();
//        b.meth();
    }
}

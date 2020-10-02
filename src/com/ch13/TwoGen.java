package com.ch13;

public class TwoGen <T, V>{
    T ob1;
    V ob2;

    public TwoGen(T o1, V o2) {
        this.ob1 = o1;
        this.ob2 = o2;
    }


    void showTypes() {
        System.out.println("Typf of T is : " + ob1.getClass().getName());
        System.out.println("Type of V is : " + ob2.getClass().getName());

    }

    T getOb1() {
        return ob1;

    }

    V getOb2() {
        return ob2;
    }
}

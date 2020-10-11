package com.ch07;

public class Shapes6 {
    public static void main(String[] args) {
        ColorTriangle t1 = new ColorTriangle("outlined", 8.0, 12.0, "Blue");
        ColorTriangle t2 = new ColorTriangle("filled", 8.0, 12.0, "Red");
        System.out.println("info for t1:");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Area is "+t1.area());
        System.out.println();
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Area is "+t2.area());
        System.out.println();
    }
}

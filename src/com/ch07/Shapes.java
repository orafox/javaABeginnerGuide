package com.ch07;

public class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle("outlined" , 8.0,12.0);
        Triangle t3 = new Triangle(4.0);
//        t1.setWidth(4);
//        t1.setHeight(4);
//        t1.setStyle("filled");
//        t2.setWidth(8);
//        t2.setHeight(12);
//        t2.setStyle("outliend");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());
        System.out.println();
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
        System.out.println();
    }
}

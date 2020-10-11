package com.ch07;

public class DynShapes {
    public static void main(String[] args) {
        TowDShap shapes[] = new TowDShap[4];
        shapes[0] = new Triangle ("outl"  , 8.0,12.0) ;

        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7);
     //   shapes[4] = new TowDShap(7,20,"generic");
        for (int i = 0; i < shapes.length ; i++) {
            System.out.println("object is " + shapes[i].getName());
            System.out.println("object is " + shapes[i].area());
            System.out.println();
        }


    }

}

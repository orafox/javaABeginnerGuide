package com.ch04;

public class AddMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();

        Vehicle sportsCar = new Vehicle();

        int range1,range2;

        minivan.passengers=7;
        minivan.fulcap=16;
        minivan.mpg=21;

        sportsCar.passengers=2;
        sportsCar.fulcap=14;
        sportsCar.mpg =12;
        System.out.println("MiniVan can Carry " + minivan.passengers + " .");
        minivan.range();
        System.out.println("Sportcar can can carry " + sportsCar.passengers +
                " .");
        sportsCar.range();
    }
}

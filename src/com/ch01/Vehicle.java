package com.ch01;

public class Vehicle {
    int passengers ,fuelcap,mpg;

    Vehicle() {
        System.out.println("start the Constractor");
    }
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.fuelcap=16;
        vehicle.passengers =7;
        vehicle.mpg = 21;
        int range = vehicle.fuelcap * vehicle.mpg;
        System.out.println("Minivan can carry " + vehicle.passengers + " with rage of " + range);
    }
}

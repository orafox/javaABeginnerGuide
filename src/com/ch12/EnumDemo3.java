package com.ch12;

public class EnumDemo3 {
    public static void main(String[] args) {
        Transport tp;
        System.out.println("Typical speed for an airplan is " + Transport.AIRPLAN.getSpeed() + " miles per hour.\n");

        System.out.println("all transport speed.");
        for (Transport t : Transport.values()) {
            System.out.println(t+ " typical speed is "+ t.getSpeed()+" miles per hour.");
        }
    }
}

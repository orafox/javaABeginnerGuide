package com.ch12;

public class EnumDemo2 {
    public static void main(String[] args) {
        Transport tp ;
        System.out.println("here are all Transport costants");
        Transport allTransport[] = Transport.values();
        for (Transport t:allTransport
             ) {
            System.out.println(t);
        }
            System.out.println();
        tp = Transport.valueOf("AIRPLAN");
        System.out.println("tp contains " + tp);
    }
}

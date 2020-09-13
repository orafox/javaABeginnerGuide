package com.ch12;

public class EnumDemo {
    public static void main(String[] args) {
        Transport tp;
        tp = Transport.AIRPLAN;
        System.out.println("value of tp: " + tp);
        System.out.println();
        tp= Transport.TRAIN;
        if (tp == Transport.TRAIN) {
            System.out.println("tp contains Train. \n");

        }
        switch (tp) {
            case CAR:
                System.out.println("a car carries people");
                break;
            case TRUCK:
                System.out.println("a truck carries freight ");
                break;
            case AIRPLAN:
                System.out.println("an airplane flies");
                break;
            case TRAIN:
                System.out.println("a train runs on rails");
                break;
            case BOAT:
                System.out.println("a boat sails on water.");
                break;
        }


    }
}

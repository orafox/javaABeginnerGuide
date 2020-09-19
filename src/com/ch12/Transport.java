package com.ch12;

public enum Transport {
    CAR (65),TRUCK(55),AIRPLAN(600),TRAIN(70), BOAT(22);
    private int speed ;

    Transport(int s){
        speed = s;}

    int getSpeed() {
        return speed;
    }
}

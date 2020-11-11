package com.ch14;

public class MyIntNum {
    public MyIntNum(int x) {
        this.v = x;
    }

    private int v;

    int getNum() {
        return v;
    }

    boolean isFactor(int n) {
        return (v % n)==0;
    }
}

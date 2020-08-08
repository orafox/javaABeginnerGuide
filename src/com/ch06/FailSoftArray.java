package com.ch06;

public class FailSoftArray {
    private int a[];
    private int errval;
    public int legnth;

    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval =errv;
        legnth=size;

    }

    public int get(int index) {
        if(indexOk(index))
            return a[index];
        return errval;
    }

    public boolean put(int index, int val) {
        if (indexOk(index)) {
            a[index] =val;
            return true;
        }
        return false;
    }

    private boolean indexOk(int index) {
        if (index >= 0 & index < legnth) {
            return true;
        }
        return false;
    }
}

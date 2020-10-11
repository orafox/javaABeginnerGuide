package com.ch08;

public class FixedQueue implements ICharQ {
    private  char q[];
    private  int puLoc , getloc;

    public FixedQueue(int size) {
        q = new char[size];
        puLoc=getloc =0;
    }

    @Override
    public void put(char ch) {
        if (puLoc == q.length) {
            System.out.println("- Queue is full.");
            return;
        }
        q[puLoc++]= ch;
    }

    @Override
    public char get() {
        if (getloc == puLoc) {
            System.out.println("- Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }

}

package com.ch06;

import com.ch05.Queue;

public class Queue2 {
    private char q[];
    private int putloc, getloc;

    Queue2(int size) {
        q = new char[size];
        putloc= getloc=0;

    }

    Queue2(Queue2 obj) {
        putloc = obj.putloc;
        getloc =obj.getloc;
        q = new char[obj.q.length];
        for (int i = getloc; i < putloc; i++) {
            q[i] = obj.q[i];
        }
    }

    Queue2(char a[]) {
        putloc=getloc= 0;
        q = new char[a.length];
        for (int i = 0; i < a.length; i++) {

        }}
        void put(char ch){
            if (putloc == q.length) {
                System.out.println("- Queue is full.");
                return;
            }
            q[putloc++]= ch;

        };

    char get() {
        if (getloc == putloc) {
            System.out.println("- Queue is Empty");
            return 0;
        }
        return q[getloc++];
    }

    }



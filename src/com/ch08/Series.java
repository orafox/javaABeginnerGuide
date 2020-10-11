package com.ch08;

public interface Series {

    default int[] getNextArray(int n) {
        int[] vals = new int[n];
        return vals;
    }

    default int[] skipAndGetNextArray(int skip, int n) {
        getArray(n);
        return getArray(n);
    }

    default int[] getArray(int n) {
        int[] vals = new int[n];
        for (int i = 0; i < n; i++) {
            vals[i] = getNext();

        }
        return vals;
    }


    int getNext();

    void reset();

    void setStart(int x);
}

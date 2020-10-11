package com.ch09;

public class NonIntResultExcpetion extends Exception {
    int n ;
    int d;

    public NonIntResultExcpetion(int n, int d) {
        this.n = n;
        this.d = d;
    }

    public String toString() {
        return "Result of " + n + " / " + d + " is non-integer";
    }
}

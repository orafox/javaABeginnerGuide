package com.ch06;

public class Summation {
    int sum;

    Summation(int num) {
        sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;

        }

    }

    Summation(Summation obj) {
        sum = obj.sum;

    }
}

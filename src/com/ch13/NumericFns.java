package com.ch13;

public class NumericFns<T extends Number> {
    T num;

    public NumericFns(T n) {
        this.num = n;
    }

    double reciprocal() {
        return 1/num.doubleValue();
    }

    double fraction() {
        return num.doubleValue()-num.intValue();
    }

    boolean absEqual(NumericFns<?> ob) {
        if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
            return true;

        return false;
    }
}

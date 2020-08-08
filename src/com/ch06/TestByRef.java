package com.ch06;

public class TestByRef {
    int a,b;

    TestByRef(int i, int j) {
        a=i;
        b=j;
    }

    void change(TestByRef  ob) {
        ob.a= ob.a + ob.a;
        ob.b = -ob.b
        ;
    }
}

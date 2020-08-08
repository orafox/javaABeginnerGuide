package com.ch06;

public class PassObRef {
    public static void main(String[] args) {
        TestByRef ob = new TestByRef(15, 20);
        System.out.println("ob.a and ob.b before call:" + ob.a + " " + ob.b);

        ob.change(ob);
        System.out.println("ob.a and ob.b after call:" + ob.a + " " + ob.b);
    }
}

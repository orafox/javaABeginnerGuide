package com.ch14;

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc14 myClassCons = MyClass::new;
        MyClass mc = myClassCons.func("testing");
        System.out.println("str in mc is "+mc.getStr());

        MyClassArrayCreator mcArrayCons = MyClass[]::new;
        MyClass[] a = mcArrayCons.func(3);
        for (int i = 0; i < 3; i++) {
            a[i] = new MyClass(i + " ");
        }
    }
}

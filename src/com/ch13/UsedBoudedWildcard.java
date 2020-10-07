package com.ch13;

public class UsedBoudedWildcard {
    static void test(Gene<? extends A> o) {

    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gene<A> w = new Gene<A>(a);
        Gene<B> w2 = new Gene<B>(b);
        Gene<C> w3 = new Gene<C>(c);
        Gene<D> w4= new Gene<D>(d);

        test(w);
        test(w2);
        test(w3);
//        test(w4);
    }
}

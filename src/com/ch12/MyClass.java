package com.ch12;
@Deprecated
public class MyClass {
    private  String msg;
    MyClass(String m) {
        msg = m;
    }

    @Deprecated
    String getMsg() {
        return msg;

    }
}

package com.ch14;

public class LambdaExceptionDemo {
    public static void main(String[] args) {
        MyIOAction myIO = (rdr) -> {int ch = rdr.read();

            return true;
        };
    }
}

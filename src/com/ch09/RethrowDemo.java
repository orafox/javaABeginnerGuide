package com.ch09;

public class RethrowDemo {
    public static void main(String[] args) {
        try {
            Rethrow.genException();
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Fatal error -"+ "Program Terminated");
        }
    }
}

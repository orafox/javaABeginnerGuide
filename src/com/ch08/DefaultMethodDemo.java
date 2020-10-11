package com.ch08;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        System.out.println("User ID is " + obj.getUserID());
        System.out.println("Administrator ID is " + obj.getAdmin());
    }
}

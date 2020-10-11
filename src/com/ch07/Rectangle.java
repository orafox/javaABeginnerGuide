package com.ch07;

public class Rectangle extends TowDShap {
    public Rectangle() {
        super();
    }

    public Rectangle(double width, double height) {
        super(width, height, "recangle");
    }

    public Rectangle(double width) {
        super(width, "recangle");
    }

    public Rectangle(TowDShap ob) {
        super(ob);
    }

    boolean isSquare() {
        if (getHeight()==getWidth()) return true;
        return  false;
    }

    @Override
    double area() {
        return getHeight()*getWidth();
    }
}

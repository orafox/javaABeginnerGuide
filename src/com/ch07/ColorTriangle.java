package com.ch07;

public class ColorTriangle extends Triangle {
    private String color;

    public ColorTriangle(String style, double w, double h, String color) {


        super(style, w, h);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void showColor() {
        System.out.println("Color is "+color);
    }
}


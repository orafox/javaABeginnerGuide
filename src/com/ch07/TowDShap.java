package com.ch07;

public abstract class TowDShap {
    private double width;
    private double height;
    private final String name;


    public TowDShap() {
        width = height = 0.0;
        name = "none";
    }

    public TowDShap(TowDShap ob) {
//        this.width = width;

        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    public TowDShap(double width, String n) {
        name = n;
        this.width = this.height = width;
    }

    public TowDShap(double width, double height, String n) {
        this.width = width;
        this.height = height;
        name = n;
    }

  abstract   double area() ;
//  {
//        System.out.println("area () must be overridden");
//        return 0.0;
//    }

    public String getName() {
        return name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    void showDim() {
        System.out.println("width and height are " + width + " and " + height);

    }
}

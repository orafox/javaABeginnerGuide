package com.ch07;

public class Triangle extends TowDShap {
    public Triangle() {
        super();
        this.style = "none";
    }

    public Triangle(String style, double w , double h) {
        super(w,h,"triangle");
        this.style = style;
       // setWidth(w);
//        setHeight(h);
    }

    public Triangle(double width) {
        super(width,"triangle");
        this.style = "filled";
    }

    public Triangle(Triangle ob) {
        super(ob);
        style = ob.style;

    }


    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    private   String style;

    double area() {
        return  getWidth()*getHeight()/2;
    }

    void showStyle() {
        System.out.println("triangle is "+style);
    }
}

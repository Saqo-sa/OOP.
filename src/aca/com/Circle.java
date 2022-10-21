package aca.com;

public class Circle {
    private double radius;
    private String color;

    public Circle(double a){
        radius = a;
        color = "";
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}

package aca.com;

public class Cylinder extends Circle{
    private double height;
    private double radius;
    public Cylinder(double radius, double height) {
        super(radius);
        this.radius = radius;
        this.height = height;
    }
    public double getHeight()
    {
        return height;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }

}

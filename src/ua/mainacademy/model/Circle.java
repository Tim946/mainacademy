package ua.mainacademy.model;

public class Circle implements Shape {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }
}

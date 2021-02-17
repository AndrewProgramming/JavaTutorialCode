package oop.defineClass;

public class Circle {
    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPrimeter() {
        return 2 * radius * Math.PI;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

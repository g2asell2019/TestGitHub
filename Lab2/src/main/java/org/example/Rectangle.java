package org.example;

public class Rectangle extends Shape{

    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle() {

    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, Boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return (width + length) * 2;
    }

    @Override
    public double getPerimeter() {
        return (width + length);
    }

    @Override
    public String toString() {
        return String.format("Rectangle[%s, width = %f, length = %f]",super.toString(), getWidth(), getLength());

    }
}

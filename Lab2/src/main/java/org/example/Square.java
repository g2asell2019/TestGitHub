package org.example;

public class Square extends Rectangle{

    public Square(){

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, Boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide(){
        return width;
    }

    public void setSide(double side){
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return String.format("Square[%s]", super.toString());
    }
}

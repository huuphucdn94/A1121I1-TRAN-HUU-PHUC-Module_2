package ss6_Inheritance.Exercise.CircleAndCylinder;

import ss6_Inheritance.Exercise.CircleAndCylinder.Circle;

public class Cylinder extends Circle {
    private double height =1.0;
    public Cylinder(){
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getCircleVolume(){
        return this.height*getArea();
    }

    @Override
    public String toString() {
        return super.toString() + "Circle Volume is " + getCircleVolume();
    }
}

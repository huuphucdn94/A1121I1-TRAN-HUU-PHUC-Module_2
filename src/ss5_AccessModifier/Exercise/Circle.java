package ss5_AccessModifier.Exercise;

public class Circle {

    private double radius = 1.0;
    private String color = "red";

    public Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

}

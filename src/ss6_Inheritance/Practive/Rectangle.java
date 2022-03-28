package ss6_Inheritance.Practive;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle(){
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.length = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = height;

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

    public double getArea(){
        return width*this.length;
    }

    public double getPerimeter(){
        return (width + this.length)*2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width= "
                + getWidth() + " and length= "
                + getLength() + ", which is a subClass of " + super.toString();
    }
}

package ss6_Inheritance.Exercise.CircleAndCylinder;


import ss6_Inheritance.Exercise.CircleAndCylinder.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle(3.0, "blue");
        System.out.println(circle1);
    }
}

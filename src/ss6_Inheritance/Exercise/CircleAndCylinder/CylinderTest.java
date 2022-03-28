package ss6_Inheritance.Exercise.CircleAndCylinder;

import ss6_Inheritance.Exercise.CircleAndCylinder.Cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        Cylinder cylinder1 = new Cylinder(2.0, "black", 5.0);
        System.out.println(cylinder1);
    }
}

package ss6_Inheritance.Exercise.Point2D3D;

import ss6_Inheritance.Exercise.Point2D3D.Point2D;
import ss6_Inheritance.Exercise.Point2D3D.Point3D;

public class PointTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        Point2D point2D1 = new Point2D(3.41f,4.51f);
        System.out.println(point2D1);

        Point3D point3D = new Point3D();
        System.out.println(point3D);

        Point3D point3D1 = new Point3D(1.23f, 2.5f, 4.2f);
        System.out.println(point3D1);
    }
}

package ss6_Inheritance.Exercise.PointAndMoveAblePoint;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        Point point1 = new Point(3.4f,3.5f);
        System.out.println(point1);

        MoveAblePoint moveAblePoint = new MoveAblePoint();
        System.out.println(moveAblePoint);

        MoveAblePoint moveAblePoint1 = new MoveAblePoint(2.3f,4.5f,4.0f,5f);
        System.out.println(moveAblePoint1);
    }
}

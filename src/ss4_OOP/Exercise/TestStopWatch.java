package ss4_OOP.Exercise;

import java.util.Scanner;

public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println(stopWatch.getStartTime());
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao he so thư nhat (a): ");
        double a = input.nextDouble();
        System.out.println("Nhap vao he so thu hai (b): ");
        double b = input.nextDouble();
        System.out.println("Nhap vao he so thu ba (c): ");
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant() < 0){
            System.out.println("The equation has no real root");
        } else if (quadraticEquation.getDiscriminant() == 0){
            System.out.println("The equation has one root is: " + quadraticEquation.getRoot1());
        } else {
            System.out.println(" The equation has two roots is:" + "\n" + quadraticEquation.getRoot1() + "\n" + quadraticEquation.getRoot2());
        }

        stopWatch.stop();
        System.out.println(stopWatch.getEndTime());
        System.out.println(stopWatch.getElapsedTime());
    }
}

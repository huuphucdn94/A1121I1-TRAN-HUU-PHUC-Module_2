package ss4_OOP.Exercise;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;
    double delta;
    double r1, r2;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
        return delta = b*b - 4*a*c;
    }
    public double getRoot1(){
        return r1 = (-b + Math.pow(delta,0.5))/(2*a);
    }
    public double getRoot2(){
        return r2 = (-b - Math.pow(delta,0.5))/(2*a);
    }

    public static void main(String[] args) {
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
    }
}

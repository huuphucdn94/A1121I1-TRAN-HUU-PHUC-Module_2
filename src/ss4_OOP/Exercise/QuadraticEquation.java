package ss4_OOP.Exercise;

import java.util.Scanner;

public class QuadraticEquation {
    public double a,b,c;
    double delta;
    public QuadraticEquation(){
    }

    public QuadraticEquation (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return  this.b;
    }
    public double getC(){
        return  this.c;
    }
    public double getDiscriminant(){
        delta = (b*b - 4*a*c);
        return delta;
    }
    public double getRoot1(){
        return  (-b - Math.sqrt(b*b - 4*a*c)/(2*a));
    }
    public double getRoo2(){
        return (-b + Math.sqrt(b*b - 4*a*c)/(2*a));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao he so thư nhat (a): ");
        double a = input.nextDouble();
        System.out.println("Nhap vao he so thu hai (b): ");
        double b = input.nextDouble();
        System.out.println("Nhap vao he so thu ba (c): ");
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
    }
}

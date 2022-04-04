package ss15_Exception_Debug.Exercise;

import java.util.Scanner;

public class IllegalTriangleException {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao gia tri a: ");
            double a = sc.nextDouble();
            System.out.println("Nhap vao gia tri b: ");
            double b = sc.nextDouble();
            System.out.println("Nhap vao gia tri b: ");
            double c = sc.nextDouble();
            IllegalTriangleException test = new IllegalTriangleException();
//            test.IllegalTriangle();
        } catch (Exception e){
            System.out.println("Khong tao thanh tam giac");
        }

//        IllegalTriangleException = new IllegalTriangleException()
    }
    public static void IllegalTriangle(double a, double b, double c) throws Exception{
            if (a<=0 || b<=0 || c<= 0 ) throw new Exception();
    }
}

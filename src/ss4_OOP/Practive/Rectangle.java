package ss4_OOP.Practive;

import sun.security.mscapi.CPublicKey;

import java.util.Scanner;
// khai bao class : <bổ từ truy cập modifier> <tu khoa Class> <ten Class>{ body class }
public class Rectangle {
    //khai bao thuôc tính: <bổ từ truy cập modifier, nếu không có thì mặc định là mođifer của package> <kieu du lieu> < ten thuo tinh>
    double  width, height;

    //Phương thức constructor khởi tao đối tượng Rectangle với các tham so truyền vào và gan gia tri cho cac thuoc tinh
    public Rectangle() {
    }
    public Rectangle (double width, double height){
            this.width = width;
            this.height = height;
    }
    //khoi tao phuong thuc tinh dien tich
    public double getArea() {
        return this.width*this.height;
    }
    //khoi tao phuong thuc tinh chu vi
    public double getPerimeter() {
        return (this.width + this.height)*2;
    }
    //khoi tao phuong thuc hien thi ra man hinh
    public String display() {
        return "Rectangle{" + "width= " + width + ", height= " + height + "}";
    }
    //phuong thuc main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width:");
        double width = scanner.nextDouble();
        System.out.println("Enter the height: ");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(height, width);
        System.out.println("Your Rectangle\n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of Rectangle: " + rectangle.getArea());
    }
}

package ss1_java_overview.Exercise;
import  java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("Hello: " + name);
    }
}

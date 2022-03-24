package ss1_java_overview.Practive;
import java.util.Scanner;
public class Declare_and_use_variables {
    public static void main(String[] args) {
        float wight;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Wight: ");
        wight = scanner.nextFloat();
        System.out.println("Enter Height: ");
        height = scanner.nextFloat();
        float area = wight * height;
        System.out.println("Area is: " + area);
    }
}

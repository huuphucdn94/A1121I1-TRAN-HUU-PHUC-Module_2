package ss2_loop_in_java.bai_tap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice !=0){
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle:");
                    for (int i =0; i < 3; i++){
                        for (int j=0; j<8; j++){
                            System.out.print("* ");
                        }
                        System.out.println("\r");
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle: ");
                    for (int i =0; i <=5; i++){
                        for (int j =0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("\r");
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle: ");
                    for (int i = 5; i >=1; i--){
                        for (int j = 1; j<=i; j++){
                            System.out.print("* ");
                        }
                        System.out.println("\r");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }

    }
}

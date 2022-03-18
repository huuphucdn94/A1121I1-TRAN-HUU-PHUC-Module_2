package ss3_array_method.Practive;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");;
            System.out.println("1. Origin juice");
            System.out.println("2. Coffee");
            System.out.println("3. beer");
            System.out.println("0. Exit");
            choice = input.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("football");
                    break;
                case 2:
                    System.out.println("basketball");
                    break;
                case 3:
                    System.out.println("badminton");
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}

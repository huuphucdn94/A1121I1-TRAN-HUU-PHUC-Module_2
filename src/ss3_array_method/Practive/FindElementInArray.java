package ss3_array_method.Practive;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        String [] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name's student:");
        String input_name = scanner.nextLine();
        boolean isExit = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of students in the list: " + input_name +" is: " + (i+1));
                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.out.println("Not found:" + input_name + " in the list.");
        }
    }
}

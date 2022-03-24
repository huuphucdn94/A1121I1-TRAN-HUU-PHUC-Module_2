package ss1_java_overview.Practive;

import java.util.Scanner;

public class Day_of_month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which month that you want to count days? ");
        int month = scanner.nextInt();
        String datesInMonth;
        switch  (month) {
            case 2:
                datesInMonth = " 28 or 29";
//                System.out.print("The month '2' has 28 or 29 days!");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                datesInMonth = "31";
//                System.out.print("The month " + month + " has 31 days!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                datesInMonth = "30";
//                System.out.print("The month " + month + " has 30 days");
                break;
            default:
                datesInMonth ="";
//                System.out.print("Invalid input");
                break;
        }
        if (!datesInMonth.equals("")) {
            System.out.println("The month "+  month +" has "+ datesInMonth);
        }
    }
}

package ss3_array_method.Exercise;

import java.util.Scanner;

public class SumTheNumberInColumn {
    public static void main(String[] args) {
        int m;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row: ");
        m = input.nextInt();
        System.out.println("Enter the column: ");
        n = input.nextInt();
        System.out.println("The element of array is getting random from 0 to 10 as below:");
        int array[][] = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                array[i][j] = (int)(Math.random()*11);
                System.out.println("array[" + i +"][" + j + "]: " + array[i][j]);
            }
        }
        System.out.println("Enter the column that you want to Calculate Sum:");
        int number;
        int sum =0;
        do {
            number  = input.nextInt();
            if (number > n){
                System.out.println("the number you entered is exceed column. please renter");
            }
        } while (number >n);
        for (int i =0; i < m; i++){
            for (int j =0; j < n; j++){
                if (j == number){
                    sum  += array[i][number];
                }
            }
        }
        System.out.println("Total of value in the column " + number + " is: " + sum);
    }
}

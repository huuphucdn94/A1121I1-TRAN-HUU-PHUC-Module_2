package ss3_array_method.Exercise;

import java.util.Scanner;

public class TakeElementOutOfArray {
    public static void main(String[] args) {
        int [] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your array is: ");
        for (int i =0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        System.out.println("Please enter the value of element that you want to delete:");
        int element = scanner.nextInt();
        boolean isExit = false;
        for (int i =0; i < array.length; i++){
            if (array[i] == element){
                System.out.println("Position of element: " + i);
                for (int j=0; j < i; j++){
                    System.out.print(array[j] + " ");
                }
                for (i = i; i <array.length; i++){
                    array[i] = array[i+1];
                    System.out.print(array[i] + " ");
                }
                isExit = true;
                break;
            }
        }
        if (!isExit){
            System.out.println("Not found :" + element + " in the array");
        }
    }
}

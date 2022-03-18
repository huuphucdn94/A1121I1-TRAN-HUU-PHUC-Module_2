package ss3_array_method.Exercise;

import java.util.Scanner;

public class AddingElementIntoArray {
    public static void main(String[] args) {
        int [] array = new int [10];
        array[0] = 10;
        array[1] = 4;
        array[2] = 6;
        array[3] = 7;
        array[4] = 8;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your array is: ");
        for (int i =0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        System.out.println("Nhap vao phan tu can chen");
        int x = scanner.nextInt();
        System.out.println("Nhap vao vi tri index can chen cua phan tu " + x);
        int index = scanner.nextInt();
        if (index <=1 || index >= array.length-1){
            System.out.println("Khong chen duoc phan tu nay vao mang");
        } else {
            for (index=index; index < array.length; index++){
                int tamp = array[index];
                array[index] = x;
                x = tamp;
            }
            }
            System.out.println("Your new list is:");
            for (int i =0; i < array.length; i++){
                System.out.print(array[i] + " ");
            }
    }
}

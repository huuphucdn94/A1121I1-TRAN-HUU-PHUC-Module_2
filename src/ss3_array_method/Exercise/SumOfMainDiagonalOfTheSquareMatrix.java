package ss3_array_method.Exercise;

import java.util.Scanner;

public class SumOfMainDiagonalOfTheSquareMatrix {
    public static void main(String[] args) {
        int [][]array;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao do dai mang: ");
        n = input.nextInt();
        array = new int[n][n];
        System.out.println("Nhap phan tu vao mang: ");
        for (int i =0; i< n; i++){
            for (int j =0; j< n; j++){
                System.out.println("array[" + i + "]["+j + "] =");
                array[i][j] = input.nextInt();
            }
        }
        int sum = 0;
        System.out.println("List phần tử của mảng là: ");
        for (int i =0 ; i < array.length; i ++){
            for (int j =0; j < array.length; j++){
                System.out.print(array[i][j] + " ");
                if (i == j){
                    sum += array[i][j];
                }
            }
            System.out.println("\r");
        }
        System.out.println("Tổng giá trị các phần tử ở đường chéo của mảng là: " + sum);
    }
}

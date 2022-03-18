package ss3_array_method.Exercise;


import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[]array1 = new int[5];
        int [] array2 = new int[6];
        int[]array3 = new int[array1.length + array2.length];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao cac phan tu cau mang 1 (gom 5 phan tu):");
        for (int i = 0; i < array1.length; i++){
            System.out.println("Phan tu thu " + i + " cua array1: ");
            array1[i] = scanner.nextInt();
        }
        System.out.println("Nhap vao cac phan tu cua mang 2 (gom 6 phan tu):");
        for (int j = 0; j < array2.length; j++){
            System.out.println("Phan tu thu " + j + " cua array2: ");
            array2[j] = scanner.nextInt();
        }
        System.out.println("So phan tu cua mang array3 la: ");
        for (int i =0; i < array1.length; i++){
            array3[i] = array1[i];
        }
        for (int i = 0; i <array2.length; i++){
            array3[array1.length + i] = array2[i];
        }
        for (int i = 0; i < array3.length; i++){
            System.out.print(array3[i] + " ");
        }
    }
}

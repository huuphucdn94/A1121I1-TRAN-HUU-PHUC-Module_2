package ss3_array_method.Exercise;

import java.util.Scanner;

public class FindMaxElementIn2DimensionalArrays {
    public static void main(String[] args) {
        //b1: khai báo số dòng và số cột của ma trận mảng 2 chiều
        int m, n;

        //b2: Nhập vào số dòng và số cột của ma trận
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của ma trận: ");
        m = input.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        n = input.nextInt();

        //b3: khai báo ma trận mảng 2 chiều
        int [][] array = new int[m][n];

        //b4: Nhập vào các phần tử của mảng 2 chiều theo cột và dòng đã khai báo trước đó
        System.out.println("Nhập vào các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++){
            for (int j =0; j < n; j++){
                System.out.println("array[" + i + "][" + j + "] = ");
                array[i][j] = input.nextInt();
            }
        }
        //b5: Tìm phần tử lớn nhất/nhở nhất trong ma trận"
                //gán phần tử đầu tiên là phần tử lớn nhất/nhỏ nhất
                //thực hiện duyệt mảng 2 chiều bằng vòng lặp và so sanh với phần tử [0][0] để tìm PTLN/PTNN
        int max = array[0][0];
        int min = array[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
                if (min > array[i][j]){
                    min = array[i][j];
                }
            }
        }
        System.out.println("Phần tử có giá trị lớn nhất là: " + max);
        System.out.println("Phần tử có giá trị nhỏ nhất là: " + min);
    }
}

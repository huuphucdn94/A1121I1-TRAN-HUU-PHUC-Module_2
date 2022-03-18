package ss2_loop_in_java.bai_tap;

import java.util.Scanner;

public class CheckNumberIsPrimeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so can kiem tra: ");
        int number = input.nextInt();
        if (isPrimeNumbers(number)){
            System.out.println(number + " La so nguyen to");
        } else {
            System.out.println(number + " khong la so nguyen to");
        }
    }
    public static boolean isPrimeNumbers (int n){
        if (n < 2){
            return false;
        } else {
            for (int i =2; i <= Math.sqrt(n); i++){
                if (n%i ==0){
                    return false;
                }
            }
            return true;
        }
    }
}

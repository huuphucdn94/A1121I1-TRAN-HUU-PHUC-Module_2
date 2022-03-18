package ss2_loop_in_java.bai_tap;

import java.util.Scanner;

public class Show20PrimeFirstly {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap vao numbers: ");
        int numbers = scanner.nextInt();
        System.out.println(numbers +" so nguyen to dau tien la: \n");
        int count =0;
        int n =2;
        while (count < numbers){
            if (isPrimeNumber(n)){
                System.out.print(n +" ");
                count++;
            }
            n++;
        }
    }
    public static boolean isPrimeNumber (int n){
        if (n< 2){
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++){
                if (n%i ==0){
                    return false;
                }
            }
            return true;
        }
    }
}


package ss2_loop_in_java.Exercise;

import java.util.Scanner;

public class Show100PrimeFirstly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The prime nubmer less than 100 is: ");
        for (int i = 2; i <100; i++){
            if (CheckPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean CheckPrime (int n){
        if (n < 2){
            return false;
        } else {
            for (int i =2; i <= Math.sqrt(n); i++){
                if (n % i == 0){
                    return false;
                }
            } return true;
        }
    }
}

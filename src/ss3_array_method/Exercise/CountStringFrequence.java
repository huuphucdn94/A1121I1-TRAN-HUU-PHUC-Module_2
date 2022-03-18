package ss3_array_method.Exercise;

import java.util.Scanner;

public class CountStringFrequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi ky tu");
        String str = input.next();
        System.out.println("Ky tu can dem so lan xuat hien: ");
        char ch = (char)input.next().charAt(0);
        int count =0;
        for (int i =0; i < str.length(); i++){
            if (ch ==str.charAt(i)){
                count++;
            }
        }
        System.out.println("So lan xuat hien " + ch + " : " +count);
    }
}

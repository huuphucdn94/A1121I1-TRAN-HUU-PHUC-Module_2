package ss1_java_overview.Exercise;

import java.util.Scanner;

public class UsdToVnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000;
        double usd;
        System.out.println("Nhập vào số tiền USD bạn muốn chuyển sáng VND: ");
        usd = scanner.nextDouble();
        double quyDoi = usd*23000;
        System.out.println("Gia tri VND quy doi: " + quyDoi);
    }
}

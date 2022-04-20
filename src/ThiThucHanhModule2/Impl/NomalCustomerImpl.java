package ThiThucHanhModule2.Impl;

import ThiThucHanhModule2.Models.NomalCustomer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NomalCustomerImpl implements ServicesCustomer {
    static List<NomalCustomer> nomalCustomerList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);


    @Override
    public void addNew() {
        System.out.println("Nhap vao so thu tu benh nhan");
        int sttBenhAn = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao ma benh an");
        int maBenhAn = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao ma benh nhan");
        int maBenhNhan = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao ten benh nhan");
        String name = scanner.nextLine();
        System.out.println("Ngay nhap vien: ");
        String ngayNhapVien = scanner.nextLine();
        System.out.println("Ngay nhap vien: ");
        String ngayRaVien = scanner.nextLine();
        System.out.println("Ngay nhap vien: ");
        String lyDoNhapVien = scanner.nextLine();
        System.out.println("Vien phi: ");
        int phiVien = scanner.nextInt();

        NomalCustomer nomalCustomer = new NomalCustomer(sttBenhAn, maBenhAn, maBenhNhan, name, ngayNhapVien, ngayRaVien,lyDoNhapVien, phiVien );
        nomalCustomerList.add(nomalCustomer);
    }

    @Override
    public void delete() {

    }

    @Override
    public void reviewList() {
        for (NomalCustomer customer: nomalCustomerList
        ) {
            System.out.println(customer.toString());
        }
    }
}

package ThiThucHanhModule2.Impl;

import ThiThucHanhModule2.Models.VipCustomer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VipCustomerImpl implements ServicesCustomer {
    static List<VipCustomer> vipCustomerList = new ArrayList<>();
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
        System.out.println("Loai Vip 1,2,3 ");
        int loaiVip = scanner.nextInt();
        VipCustomer vipCustomer = new VipCustomer(sttBenhAn,
                maBenhAn,
                maBenhNhan,
                name,
                ngayNhapVien,
                ngayRaVien,
                lyDoNhapVien,
                loaiVip);
        vipCustomerList.add(vipCustomer);
    }

    @Override
    public void delete() {

    }

    @Override
    public void reviewList() {

    }
}

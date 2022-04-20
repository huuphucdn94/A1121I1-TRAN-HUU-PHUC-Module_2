package FinalExamModule2.services;

import FinalExamModule2.models.BenhAnThuong;
import FinalExamModule2.util.NotFoundMedicalRecordException;
import FinalExamModule2.util.ReadAndWrite;
import FinalExamModule2.util.Regex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhAnThuongImpl implements BenhAnThuongService {
    Scanner sc = new Scanner(System.in);
    private static final String BENH_AN = "BA-[\\d]{3}";

    @Override
    public void display() {
        List<BenhAnThuong> benAnList = ReadAndWrite.readBenhAn();
        if (benAnList.isEmpty()) {
            System.out.println("Employee list is empty ->Please enter list employee! ");
        } else {
            for (int i = 0; i < benAnList.size(); i++) {
                System.out.println((i + 1) + "." + benAnList.get(i));
            }
        }
    }

    @Override
    public void addNew() {
        List<BenhAnThuong> benAnList = ReadAndWrite.readBenhAn();
        int soThuTu;
        if (benAnList.isEmpty()) {
            soThuTu = 1;
        } else {
            soThuTu = Integer.parseInt(benAnList.get(benAnList.size() - 1).getSoThuTu()) + 1;
        }
        System.out.println("So Thu Tu: " + soThuTu);
        System.out.println("Ma Benh Nhan: ");
        String maBenNhan = inputmaBenhAn();
        String tenBenhNhan;
        do {
            System.out.println("Ten Benh Nhan: ");
            tenBenhNhan = sc.nextLine();
        } while (tenBenhNhan.equals(""));
//////
        String lyDo;
        do {
            System.out.println("Ly Do Nhap Vien: ");
            lyDo = sc.nextLine();
        } while (lyDo.equals(""));
//////
        String phi;
        do {
            System.out.println("Phi Nam Vien: ");
            phi = sc.nextLine();
        } while (phi.equals(""));
///////
        String ngayNhapVien;
        while (true) {
            System.out.println("Ngay Nhap Vien: ");
            ngayNhapVien = sc.nextLine();
            SimpleDateFormat ngayNhap = new SimpleDateFormat("dd-MM-yyyy");
            ngayNhap.setLenient(false);
            try {
                ngayNhap.parse(ngayNhapVien);
            } catch (ParseException e) {
                System.out.println("Error: Invalid date -> Try again! ");
                continue;
            }
            break;
        }
///////
        String ngayRaVien;
        while (true){
            System.out.println("Ngay Ra Vien: ");
            ngayRaVien= sc.nextLine();
            SimpleDateFormat ngayRa = new SimpleDateFormat("dd-MM-yyyy");
            ngayRa.setLenient(false);
            try {
                ngayRa.parse(ngayRaVien);
            } catch (ParseException e) {
                System.out.println("Error: Invalid date -> Try again! ");
                continue;
            }
            String[] array = ngayNhapVien.split("-");
            String[] array1 =ngayRaVien.split("-");
            if (Integer.parseInt(array1[2]) < Integer.parseInt(array[2]))
            {
                System.out.println("Nhap Sai -> Vui Long Nhap Ngay Ra Vien > Ngay Nhap Vien");
                continue;
            }else
            if (Integer.parseInt(array1[1]) < Integer.parseInt(array[1]))
            {
                System.out.println("Nhap Sai -> Vui Long Nhap Ngay Ra Vien > Ngay Nhap Vien");
                continue;
            }
            else
            if (Integer.parseInt(array1[0]) < Integer.parseInt(array[0]))
            {
                System.out.println("Nhap Sai -> Vui Long Nhap Ngay Ra Vien > Ngay Nhap Vien");
                continue;
            }
            break;
        }
        BenhAnThuong benhAn = new BenhAnThuong(Integer.toString(soThuTu),maBenNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDo, phi);
        benAnList.add(benhAn);
        if (benAnList.size() ==1){
            ReadAndWrite.writeBenhAn(benAnList,true);
        } else if(benAnList.size() > 1){
            for (int i =0; i < benAnList.size()-1; ){
                benAnList.remove(i);
            }
            ReadAndWrite.writeBenhAn(benAnList,true);
        }

    }
    public String inputmaBenhAn(){
        return Regex.regexStr(sc.nextLine(),BENH_AN,"Import bad form -> please enter again:");
    }

    @Override
    public void delete() {
        List<BenhAnThuong> benhAnList = new ArrayList<>();
        if (benhAnList.isEmpty()){
            System.out.println("Danh Sach Benh An Rong ->Vui Long Nhap Benh An! ");
            System.out.println("---------------------------");
        } else {
            display();
            String maBenhAn;
            boolean check = true;
            do {
                do {
                    System.out.println("Lua Chon Ma Benh An De Xoa: ");
                    maBenhAn = sc.nextLine();
                } while (maBenhAn.equals(""));
                for (int i =0; i < benhAnList.size(); i++){
                    if (maBenhAn.equals(benhAnList.get(i).getMaBenhAn())){
                        int choiceChildFunction = -1;
                        System.out.println("1.\tYes");
                        System.out.println("2.\tNo");
                        System.out.println("---------------------------");
                        System.out.println("Select choice :");
                        try {
                            choiceChildFunction= Integer.parseInt(sc.nextLine());
                        }catch (Exception e){
                            System.out.println("Nhập sai vui lòng nhập lại số: ");
                            continue;
                        }
                        if (choiceChildFunction == 1){
                            benhAnList.remove(i);
                            ReadAndWrite.writeBenhAn(benhAnList, false);
                            display();
                            check=false;
                        }
                        if (choiceChildFunction == 2){
                            display();
                        }
                    }
                    else {
                        if(i == benhAnList.size()-1){
                            try {
                                throw new NotFoundMedicalRecordException();
                            } catch (NotFoundMedicalRecordException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            } while (check);
        }
    }
}

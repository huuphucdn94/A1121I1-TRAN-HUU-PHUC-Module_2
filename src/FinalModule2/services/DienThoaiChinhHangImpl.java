package FinalModule2.services;

import FinalModule2.models.DienThoaiChinhHang;
import FinalModule2.util.ReadAndWrite;

import java.util.List;
import java.util.Scanner;

public class DienThoaiChinhHangImpl implements DienThoaiChinhHangService{
    Scanner sc = new Scanner(System.in);
    @Override
    public void display() {
        List<DienThoaiChinhHang>dienThoaiChinhHangList = ReadAndWrite.readDienThoaiChinhHang();
        if (dienThoaiChinhHangList.isEmpty()){
            System.out.println("Employee list is empty ->Please enter list employee! ");
        } else {
            for (int i=0; i< dienThoaiChinhHangList.size(); i++){
                System.out.println((i+1) + "." + dienThoaiChinhHangList.get(i));
            }
        }
    }

    @Override
    public void addNew() {
        List<DienThoaiChinhHang> dienThoaiChinhHangList =ReadAndWrite.readDienThoaiChinhHang();
///
        int id;
        if (dienThoaiChinhHangList.isEmpty()){
            id =1;
        } else {
            id = Integer.parseInt(dienThoaiChinhHangList.get(dienThoaiChinhHangList.size()-1).getId() +1);
        }
        System.out.println("ID dien thoai:" + id);
  ///
        String ten;
        do {
            System.out.println("Ten dien thoai: ");
            ten = sc.nextLine();
        } while (ten.equals(""));
 ///
        String giaBan;
        do {
            System.out.println("Nhap gia ban: ");
            giaBan =sc.nextLine();
        } while (giaBan.equals(""));
 ///
        String soLuong;
        do {
            System.out.println("Nhap so luong: ");
            soLuong = sc.nextLine();
        } while (soLuong.equals(""));
///
        String nhaSanXuat;
        do {
            System.out.println("Nhap nha san xuat: ");
            nhaSanXuat = sc.nextLine();
        } while (nhaSanXuat.equals(""));
///
        String thoiGianBaoHanh;
        do {
            System.out.println("Nhap thoi gian bao hanh: ");
            thoiGianBaoHanh = sc.nextLine();
        } while (thoiGianBaoHanh.equals(""));
  ///
        String phamViBaoHanh;
        do {
            System.out.println("Nhap pham vi bao hanh");
            phamViBaoHanh = sc.nextLine();
        } while (phamViBaoHanh.equals(""));

        DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(Integer.toString(id),ten, giaBan, soLuong, nhaSanXuat,thoiGianBaoHanh,phamViBaoHanh);
        dienThoaiChinhHangList.add(dienThoaiChinhHang);

        if (dienThoaiChinhHangList.size() ==1){
            ReadAndWrite.writeDienThoaiChinhHang(dienThoaiChinhHangList,true);
        } else if (dienThoaiChinhHangList.size() > 1){
            for (int i =0; i < dienThoaiChinhHangList.size()-1; ){
                dienThoaiChinhHangList.remove(i);
            }
            ReadAndWrite.writeDienThoaiChinhHang(dienThoaiChinhHangList,true);
        }
    }

    @Override
    public void delete() {

    }
}

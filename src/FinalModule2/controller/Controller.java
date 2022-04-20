package FinalModule2.controller;

import FinalModule2.services.DienThoaiChinhHangImpl;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        displayMenu();
    }
    public static void displayMenu(){
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0){
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI--");
            System.out.println("Chọn chức năng theo số (để tiếp tục): ");
            System.out.println("1.\tThêm mới");
            System.out.println("2.\tXóa");
            System.out.println("3.\tXem danh sách bệnh án");
            System.out.println("4.\tTìm kiếm");
            System.out.println("5.\tThoat");
            System.out.println("---------------------------");
            System.out.println("Chọn chức năng:");
        try {
            choice = Integer.parseInt(sc.nextLine());

        }catch (Exception e){
            System.out.println("Nhập sai vui lòng nhập lại số: ");
            continue;
        }
            DienThoaiChinhHangImpl dienThoaiChinhHang = new DienThoaiChinhHangImpl();
        switch (choice){
            case 1:
                addNewDienThoai();
                break;
            case 2:

            case 3:

            case 4:

            case 5:
                System.exit(0);
            default:
                System.out.println("No choice!");
                choice = -1;
        }
        }
    }
    public static void addNewDienThoai(){
        Scanner sc = new Scanner(System.in);
        DienThoaiChinhHangImpl dienThoaiChinhHang = new DienThoaiChinhHangImpl();
        int choiceChildFunction = -1;
        while (choiceChildFunction !=0){
            System.out.println("1.\tThem dien thoai chinh hang");
            System.out.println("2.\tThem dien xach tay");
            System.out.println("3.\tReturn main menu");
            System.out.println("---------------------------");
            System.out.println("Select choice :");
            try {
                choiceChildFunction = Integer.parseInt(sc.nextLine());
            }catch (Exception e){
                System.out.println("Nhập sai vui lòng nhập lại số: ");
                continue;
            }
            switch (choiceChildFunction){
                case 1:
                    dienThoaiChinhHang.addNew();
                case 2:
                case 3:
                default:
                    System.out.println("No choice!");
                    choiceChildFunction = -1;
            }
        }
    }
    public static void deleteDienThoai(){

    }
    public static void viewList(){

    }
    public static void search(){

    }
}

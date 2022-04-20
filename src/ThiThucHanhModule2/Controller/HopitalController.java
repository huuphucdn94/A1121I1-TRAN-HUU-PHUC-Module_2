package ThiThucHanhModule2.Controller;

import ThiThucHanhModule2.Impl.NomalCustomerImpl;
import ThiThucHanhModule2.Impl.VipCustomerImpl;

import java.util.Scanner;

public class HopitalController {
    public static void main(String[] args) {
        System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN--"+
                "\n" + "Chọn theo chức năng theo số (để tiếp túc)");
        displayMainMenu();
    }
    public static void displayMainMenu(){
        boolean check = true;
        int choice = 0;
        while (check){
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách các bệnh án");
            System.out.println("4. Thoát");
            Scanner scanner = new Scanner(System.in);
            try{
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng. Vui lòng nhập lại: ");
            }
            switch (choice){
                case 1:{
                    addNewCustomer();
                    break;
                }
                case 2:{
                    delete();
                    break;
                }
                case 3:{
                    reviewListPerson();
                    break;
                }
                case 4:{
                    System.exit(6);
                }
            }
        }
    }
    public static void  addNewCustomer(){
        NomalCustomerImpl nomalCustomer = new NomalCustomerImpl();
        VipCustomerImpl vipCustomer = new VipCustomerImpl();
        boolean check = true;
        int choice = 0;
        while (check){
            System.out.println("1. Khach thuong");
            System.out.println("2. Khach vip");
            System.out.println("3. Tro lai menu chinh");

            Scanner scanner = new Scanner(System.in);
            try{
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng. Vui lòng nhập lại: ");
            }
            switch (choice){
                case 1:{
                    nomalCustomer.addNew();
                    nomalCustomer.reviewList();
                    break;
                }
                case 2:{
                    vipCustomer.addNew();
                    vipCustomer.reviewList();
                    break;
                }
                case 3:{
                    displayMainMenu();
                    break;
                }
            }
        }

    }
    public static void  delete(){

    }
    public static void  reviewListPerson(){

    }
}

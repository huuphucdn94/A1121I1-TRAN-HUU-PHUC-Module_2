package caseStudyModule2.controllers;

import caseStudyModule2.services.Impl.CustomerServiceImpl;
import caseStudyModule2.services.Impl.EmployeeServiceImpl;
import caseStudyModule2.services.Impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaControllers {
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu(){
        boolean check = true;
        int choice = 0;

        while (check){
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management ");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            Scanner scanner = new Scanner(System.in);
            try{
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng. Vui lòng nhập lại: ");
            }
            switch (choice){
                case 1:{
                    displayEmployeeMenu();
                    break;
                }
                case 2:{
                    displayCustomerMenu();
                    break;
                }
                case 3:{
                    displayFacilityMenu();
                }
                case 4:{
                    displayBookingMenu();
                }
                case 5:{
                    displayPromotionMenu();
                }
                case 6:{
                    System.exit(6);
                }
            }
        }
    }
    public static void displayEmployeeMenu() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Back to Menu");
            Scanner scanner = new Scanner(System.in);
            try{
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng. Vui lòng nhập lại: ");
            }
            switch (choice){
                case 1:{
                    employeeService.display();
                    break;
                }
                case 2:{
                    employeeService.addNew();
                    break;
                }
            }
        }
    }
    public static void  displayCustomerMenu(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1. Display list customer");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Back to Menu");
            Scanner scanner = new Scanner(System.in);
            try{
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng. Vui lòng nhập lại: ");
            }
            switch (choice){
                case 1:{
                    customerService.display();
                    break;
                }
                case 2:{
                    customerService.addNew();
                }
            }
        }
    }
    public static void  displayFacilityMenu(){
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        int choice =0;
        while (check) {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Back to Menu");
            Scanner scanner = new Scanner(System.in);
            try{
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng. Vui lòng nhập lại: ");
            }
            switch (choice){
                case 1:{
                    facilityService.display();
                    break;
                }
                case 2:{
                    addNewFacilityMenu();
                }
            }
        }
    }
    public static void  addNewFacilityMenu(){
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        int choice =0;
        while (check) {
            System.out.println("1. Add new villa");
            System.out.println("2. Add new house");
            System.out.println("3. Add new room");
            System.out.println("4. Back to Menu");
            Scanner scanner = new Scanner(System.in);
            try{
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng. Vui lòng nhập lại: ");
            }
            switch (choice){
                case 1:{
                    facilityService.addNewVilla();
                    displayFacilityMenu();
                    break;
                }
            }
        }
    }
    public static void  displayBookingMenu(){
        boolean check = true;
        int choice =0;
        while (check) {
            System.out.println("1. Add new facility");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Back to Menu");
            Scanner scanner = new Scanner(System.in);
            try{
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng. Vui lòng nhập lại: ");
            }
            switch (choice){
                case 1:{

                }
            }
        }
    }
    public static void  displayPromotionMenu(){
        boolean check = true;
        int choice =0;
        while (check) {
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
            Scanner scanner = new Scanner(System.in);
            try{
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng. Vui lòng nhập lại: ");
            }
            switch (choice){
                case 1:{

                }
            }
        }
    }
}


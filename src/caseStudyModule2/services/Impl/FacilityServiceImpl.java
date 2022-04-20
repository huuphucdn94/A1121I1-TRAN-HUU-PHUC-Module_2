package caseStudyModule2.services.Impl;

import caseStudyModule2.models.Facility;
import caseStudyModule2.models.Villa;
import caseStudyModule2.services.FacilityServices;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityServices {
    private static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    public static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Map.Entry<Facility,Integer> element : facilityIntegerMap.entrySet()){
            System.out.println("Service: " + element.getKey() + ", số lần thuê: " + element.getValue());
        }
    }

    @Override
    public void displayMain() {

    }

    @Override
    public void addNewVilla() {
        System.out.println("Nhap id: ");
        String id = scanner.nextLine();
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap dien tich: ");
        double age = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap gia tien: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so luong nguoi: ");
        int people = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap kieu thue: ");
        String rentType = scanner.nextLine();
        System.out.println("nhap tieu chuan: ");
        String standard = scanner.nextLine();
        System.out.println("Nhap dien tich ho boi: ");
        double areaPool = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap so tang: ");
        int floor = Integer.parseInt(scanner.nextLine());

        Villa villa = new Villa(id, name, age, price, people, rentType, standard, areaPool, floor);
        facilityIntegerMap.put(villa,0);
        System.out.println("Đã thêm mới Villa thành công");
    }

    @Override
    public void addNewHouse() {

    }

    @Override
    public void addNewRoom() {

    }
}

package caseStudyModule2.services.Impl;

import caseStudyModule2.models.Employee;
import caseStudyModule2.services.EmployeeServices;
import caseStudyModule2.ultils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeServices {
    static List<Employee> employeeList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        ReadAndWrite.readFileObject("E:\\Codegym\\Module 2\\src\\caseStudyModule2\\data\\employee.csv");
        for (Employee employee: employeeList){
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap Ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap Tuoi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap gioi tinh: ");
        String sex = scanner.nextLine();
        System.out.println("Nhap Chung minh: ");
        String idCard = scanner.nextLine();
        System.out.println("Nhap Email: ");
        String email = scanner.nextLine();
        System.out.println("Nhap Chuc vu: ");
        String level = scanner.nextLine();
        System.out.println("Nhap vi tri: ");
        String position = scanner.nextLine();
        System.out.println("Luong: ");
        int salary = scanner.nextInt();

        Employee employee = new Employee(id, name, age, sex, idCard, email, level,position,salary );
        employeeList.add(employee);
        //ghi vao file csv
        ReadAndWrite.writeFileObject(employeeList, "E:\\Codegym\\Module 2\\src\\caseStudyModule2\\data\\employee.csv");
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}

package ss3_array_method.Exercise;

import java.util.Scanner;

public class TheApplicationCountTheNumberOfStudentPassingExam {
    public static void main(String[] args) {

        //b1: khai báo, nhập và kiểm tra kích thưởng mảng ( tối đa 30 học sinh)
        int []arr;
        int size;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Please enter the size");
            size = input.nextInt();
            if (size > 30){
                System.out.println("The size shouldn't exceed 30. Please reenter");
            }
        } while (size >30);

        //b2: sử dùng vòng lặp để nhập vào số điểm của HS theo kích thước mảng đã nhập
        arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            System.out.println("Please enter a mark for student " + (i+1) +":");
            arr[i] = input.nextInt();
        }
//        int i = 0;
//        while (i < arr.length){
//            System.out.println("Please enter a mark for student " + (i+1) +":");
//            arr[i]= input.nextInt();
//            i++;
//        }

        //b3: Sử dụng vòng lặp for để in ra danh sách điểm vừa nhập, đồng thời đếm số lượng sinh viên thi đỗ
        int count =0;
        System.out.println("List of mark: ");
        for (int i =0; i < arr.length; i++){
            System.out.println(arr[i] + "\t");
            if (arr[i] >= 5 && arr[i] <=10){
                count++;
            }
        }
        System.out.println("The number of students passing the exam is: " + count);
    }
}

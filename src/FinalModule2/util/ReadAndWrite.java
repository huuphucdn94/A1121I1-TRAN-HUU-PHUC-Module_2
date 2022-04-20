package FinalModule2.util;

import FinalModule2.models.DienThoaiChinhHang;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    final static String DienThoai = "E:\\Codegym\\Module 2\\src\\FinalModule2\\data\\mobiles.csv";
    //ghi file to csv
    public static void writeToCsv(List<String> list, String patch, boolean append){
        File file = new File(patch);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter= new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string: list){
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
    }
    //doc file tu csv
    public static List<String> readlist(String patch){
        List<String> list = new ArrayList<>();
        File file = new File(patch);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                list.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        }
        return list;
    }
    //ghi danh sach dien thoai chinh hang
    public static void  writeDienThoaiChinhHang(List<DienThoaiChinhHang> dienThoaiChinhHangList, boolean append){
        List<String> strings = new ArrayList<>();
        for (DienThoaiChinhHang dienThoaiChinhHang: dienThoaiChinhHangList){
            strings.add(dienThoaiChinhHang.getInfoDienThoai());
        }
        writeToCsv(strings, DienThoai,append);
    }
    //doc danh sach dien thoai chinh hang
    public static List<DienThoaiChinhHang> readDienThoaiChinhHang(){
        List<String> list = readlist(DienThoai);
        List<DienThoaiChinhHang> dienThoaiChinhHangList = new ArrayList<>();
        String[] array = null;
        for (int i =0; i < list.size(); i++){
            array =list.get(i).split(",");
            DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(array[0],array[1],array[2],array[3],array[4],array[5],array[6]);
            dienThoaiChinhHangList.add(dienThoaiChinhHang);
        }
        return dienThoaiChinhHangList;
    }
}

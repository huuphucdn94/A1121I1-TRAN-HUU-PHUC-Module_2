package FinalExamModule2.util;

import FinalExamModule2.models.BenhAnThuong;
import FinalExamModule2.models.BenhAnVIP;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    final static String BenhAn = "E:\\Codegym\\Module 2\\src\\FinalExamModule2\\data\\medical_record.csv";
    //phuong thuc ghi file
    public static void writeToCsv(List<String> list, String patch, boolean append){
        File file = new File(patch);
        FileWriter fileWrite = null;
        BufferedWriter bufferedWriter = null;
        try {
             fileWrite= new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWrite);
            for (String string: list){
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWrite.close();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }

    }
    //phuong thuc doc file
    public static List<String> readList(String patch){
        List<String> list= new ArrayList<>();
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
    //Ghi danh sach benh an thuong
    public static void writeBenhAn(List<BenhAnThuong> benhAnList, boolean append){
        List<String> strings = new ArrayList<>();
        for (BenhAnThuong benhAn: benhAnList){
            strings.add(benhAn.getInfoBenhAn());
        }
        writeToCsv(strings, BenhAn, append);
    }
    //Doc danh sach benh an thuong
    public static List<BenhAnThuong> readBenhAn(){
        List<String> list = readList(BenhAn);
        List<BenhAnThuong> benhAnList = new ArrayList<>();
        String [] array = null;
        for (int i = 0; i < list.size(); i++) {
            array = list.get(i).split(",");
            BenhAnThuong benhAn = new BenhAnThuong(array[0], array[1],array[2],array[3],array[4],array[5],array[6]);
            benhAnList.add(benhAn);
        }
        return benhAnList;
    }
    //ghi danh sach ben nhan vip
    public static void writeBenhAnVIP(List<BenhAnVIP> benhAnList, boolean append){
        List<String> strings = new ArrayList<>();
        for (BenhAnVIP benhAn: benhAnList){
            strings.add(benhAn.getInfoBenhAn());
        }
        writeToCsv(strings,BenhAn,append);
    }
    //Doc danh sach ben an vip
    public static List<BenhAnVIP> readBenhAnVip(){
        List<String> list = readList(BenhAn);
        List<BenhAnVIP> benAnList = new ArrayList<>();
        String[] array = null;
        for (int i = 0; i < list.size(); i++) {
            array = list.get(i).split(",");
            BenhAnVIP benhAn = new BenhAnVIP(array[0],array[1],array[2],array[3],array[4],array[5],array[6],array[7]);
            benAnList.add(benhAn);
        }
        return benAnList;
    }
}

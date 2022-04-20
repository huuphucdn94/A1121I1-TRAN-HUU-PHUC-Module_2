package ThiThucHanhModule2.Controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    final static String customerFile = "E:\\Codegym\\Module 2\\src\\ThiThucHanhModule2\\Data\\medical_records.csv";

    private static void writeListToCSV(List<String> list, String path, boolean append) {
        File file = new File(path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : list) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
    }

        private static List<String> readListToCSV(String path) {
            List<String> list = new ArrayList<>();
            File file = new File(path);
            FileReader fileReader = null;
            BufferedReader bufferedReader = null;
            try {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    list.add(line);
                }
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Lỗi đọc file");
            }
            return list;
        }
}

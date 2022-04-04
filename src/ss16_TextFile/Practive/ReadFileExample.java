package ss16_TextFile.Practive;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public ReadFileExample() {
    }
    public void writeToFile(String path){
        try {
            FileWriter writer = new FileWriter(path);
            writer.write("5\n");
            writer.write("3\n");
            writer.write("6\n");
            writer.write("1\n");
            writer.write("8\n");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void readFileText(String filePatch){
        try {
            File file = new File(filePatch);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tong =" + sum);

        }catch (Exception e){
            System.err.println("File khong ton tai hoac noi dung bi loi!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhap duong dan file");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);
    }
}

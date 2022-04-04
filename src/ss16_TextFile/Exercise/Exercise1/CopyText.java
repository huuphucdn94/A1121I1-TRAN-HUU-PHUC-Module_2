package ss16_TextFile.Exercise.Exercise1;

import java.io.*;
import java.util.Scanner;

public class CopyText {
    static String fSource = "E:\\Codegym\Module 2\\src\\ss16_TextFile\\Exercise\\sourceFile.txt";
    static String fTaget = "E:\\Codegym\Module 2\\src\\ss16_TextFile\\Exercise\\tagetFile.txt";

    public static void CopyFile ( String pSource, String pTaget){


        try {
            File fSource = new File(pSource);
            File fTaget = new File(pTaget);

            if( !fSource.exists())
                throw new FileNotFoundException();

            if( fTaget.exists()) {
                System.out.println("File dich da ton tai");
            }

            Scanner scanner = new Scanner(System.in);
            boolean check = false;
            int i;
            test: do {
                System.out.println("Chon 1 de ghi de \n" +
                        "Chon 2 de ghi tiep");
                i = scanner.nextInt();
                if( i == 1 || i ==2){
                    break test;
                }
                else
                    System.out.println("Sai lua chon, hay nhap lai");

            }while (true);

            BufferedWriter bw ;
            if( i ==1 ){
                bw = new BufferedWriter( new FileWriter(fTaget,false));

            }
            else{
                bw = new BufferedWriter( new FileWriter(fTaget,true));

            }

            BufferedReader br = new BufferedReader( new FileReader(fSource));


            String line = null;
            while ( ( line = br.readLine() ) != null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            br.close();
            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("File nguon khong ton tai");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {

        CopyFile( fSource,fTaget);
    }
}

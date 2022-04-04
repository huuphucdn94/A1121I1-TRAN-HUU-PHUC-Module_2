package ss16_TextFile.Practive;

import java.io.FileWriter;
import java.io.IOException;

public class TaoFileTextNumberTxt {
    public static void main(String[] args) {
        TaoFileTextNumberTxt taoFileTextNumberTxt = new TaoFileTextNumberTxt();
        taoFileTextNumberTxt.writeToFile("taoFileTextNumber.txt");
    }

    public void writeToFile(String a){
        try {
            FileWriter writerObject = new FileWriter(a);
            writerObject.write("9\n");
            writerObject.write("5\n");
            writerObject.write("4\n");
            writerObject.write("2\n");
            writerObject.write("15\n");
            writerObject.write("3\n");
            writerObject.write("6\n");
            writerObject.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

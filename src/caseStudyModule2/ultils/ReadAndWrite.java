package caseStudyModule2.ultils;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ReadAndWrite {
//    public static void write(Collection collection, String diaChi){
//        File file = new File(diaChi);
//        if (!file.exists()){
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        FileOutputStream fileOutputStream = null;
//        ObjectOutputStream objectOutputStream = null;
//
//        try {
//            fileOutputStream = new FileOutputStream(file);
//            objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(collection);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                fileOutputStream.close();
//                objectOutputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    public static Object read(String diaChi){
//        FileInputStream fileInputStream = null;
//        ObjectInputStream objectInputStream = null;
//
//        Object object = null;
//
//        try {
//            fileInputStream = new FileInputStream(diaChi);
//            objectInputStream = new ObjectInputStream(fileInputStream);
//
//            object = objectInputStream.readObject();
//            return object;
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    //read
    public static List<Collection> readFileObject(String path) {
        List<Collection> collections = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = "";
            // line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return collections;
    }
    //write

    public static void writeFileObject(Collection collections, String path) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (Object o : collections) {
                writer.newLine();
                writer.write(String.valueOf(o));
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

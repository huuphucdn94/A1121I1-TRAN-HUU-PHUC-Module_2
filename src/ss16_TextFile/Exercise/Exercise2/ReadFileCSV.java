package ss16_TextFile.Exercise.Exercise2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {
    final String SEPARATION = ",";
    public void writeFileCountry(String pathFile, List<Country>List){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathFile))){
            writer.write("ID" + SEPARATION + "code" + SEPARATION + "Name" );
            for (Country country: List) {
                writer.newLine();
                writer.write(country.id + SEPARATION + country.code + SEPARATION + country.name);
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public List<Country> readFileCountry(String pathFile){
        List<Country> countries = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(pathFile))){
            String line ="";
            while ((line = reader.readLine()) != null){
                String [] value= line.split(SEPARATION);
                String id = value[0];
                String code = value[1];
                String name = value[2];
                countries.add(new Country(id,code,name));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return countries;
    }
}

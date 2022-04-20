package ss16_TextFile.Exercise.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class RunCountryList {
    public static void main(String[] args) {
        ReadFileCSV  readFileCSV = new ReadFileCSV();
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("1","123","VietNam"));
        countries.add(new Country("2","345","Thailand"));
        readFileCSV.writeFileCountry("country.csv",countries);
    }
}

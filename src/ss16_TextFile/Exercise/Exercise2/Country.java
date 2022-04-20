package ss16_TextFile.Exercise.Exercise2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Country {
    public String id;
    public String code;
    public String name;

    public Country(String id, String code, String name) {
    }

    public String getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id='" + id + '\'' +
                ", code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}

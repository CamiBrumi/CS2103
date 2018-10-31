import java.awt.*;
import java.util.ArrayList;

public class Person extends User {
    private ArrayList _pets;
    private ArrayList _possessions;

    public Person(String name, Image image) {
        super(name, image);
    }

    void setPossessions (ArrayList possessions) {
        _possessions = possessions;
    }

    void setPets (ArrayList pets) {
        _pets = pets;
    }
}
import java.util.ArrayList;

public class Pet extends  User {
    private Person _owner;
    private ArrayList _friends;

    public Pet (String name, Image image) {
        super(name, image);
    }

    void setOwner (Person owner) {
        _owner = owner;
    }
}
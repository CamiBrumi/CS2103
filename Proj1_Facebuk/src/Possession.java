public class Possession extends Profile {
    private float _price;
    private Person _owner;


    public Possession (String name, Image image, float price) {
        super(name, image);
        _price = price;
    }

    void setOwner (Person owner) {
        _owner = owner;
    }

    float getPrice () {
        return _price;
    }
}
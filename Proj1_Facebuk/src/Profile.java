public class Profile {
    protected String _name;
    protected Image _image;

    protected Profile (String name, Image image) {
        _name = name;
        _image = image;
    }

    boolean equals (Object o){
        return _name.equals(); //todo how to I implement this??
    }
}


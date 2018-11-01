public class Profile {
    protected String _name;
    protected Image _image;

    protected Profile (String name, Image image) {
        _name = name;
        _image = image;
    }

    public boolean equals (Object o){
        return _name.equals(((Profile) o)._name);
    }
    public String getName () {
        return _name;
    }
}


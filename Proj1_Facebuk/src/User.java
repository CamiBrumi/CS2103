import java.util.ArrayList;

public class User {
    private String _name;
    private Image _image;
    private ArrayList _friends;
    private ArrayList _moments;

    public User (String name, Image image) {
        _name = name;
        _image = image;
    }

    void setFriends (ArrayList friends) {
        _friends = friends;
    }

    void setMoments (ArrayList moments) {
        _moments = moments;
    }

    ArrayList getFriends () {
        return _friends;
    }

    void addFriend (User friend) {
        _friends.add(friend);
    }
}

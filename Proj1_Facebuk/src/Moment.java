import java.awt.*;
import java.util.ArrayList;

public class Moment {
    private String _name;
    private Image _image;
    private ArrayList<User> _participants;
    private ArrayList<Float> _smileValues;

    public Moment (String name, Image image, ArrayList<User> participants, ArrayList<Float> smileValues) {
        _name = name;
        _image = image;
        _participants = participants;
        _smileValues = smileValues;
    }


    private boolean equals (Object o);
}

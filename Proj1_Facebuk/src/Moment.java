import java.util.ArrayList;

public class Moment extends Profile {
    private ArrayList _participants;
    private ArrayList _smileValues;

    public Moment (String name, Image image, ArrayList participants, ArrayList smileValues) {
        super(name, image);
        _participants = participants;
        _smileValues = smileValues;
    }

    public ArrayList getParticipants() {
        return _participants;
    }

    ArrayList getSmileValues() {
        return _smileValues;
    }

}
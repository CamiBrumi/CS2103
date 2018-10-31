import java.util.ArrayList;

public class FriendRequest {
    User _entity1;
    User _entity2;
    boolean approvedByEnt1;
    boolean approvedByEnt2;

    public FriendRequest(User entity1, User entity2) {
        _entity1 = entity1;
        _entity2 = entity2;
    }
    void approve (User entity) {
        if (entity == _entity1) {
            approvedByEnt1 = true;
        } else if (entity == _entity2) {
            approvedByEnt2 = true;
        } else throw new IllegalArgumentException();
        if (approvedByEnt1 && approvedByEnt2) {
            _entity1.addFriend(_entity2);
            _entity2.addFriend(_entity1);
        }
    }

}

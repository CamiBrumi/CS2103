import java.util.ArrayList;
import java.awt.Image;
import java.util.Set;

public class User {
    private String _name;
    private Image _image;
    private ArrayList _friends; //those are of type User
    private ArrayList _moments; //those are of type Moment

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

    public ArrayList findMaximumCliqueOfFriends() {
        ArrayList clique = new ArrayList();
        //for each friend f1 we select for this User, it must be contained
        //in the list of friends of all the other friends of this user
        for (int friendIdx = 0; friendIdx < _friends.size(); ++friendIdx) {
            boolean foundIncompatibility = false;
            for (int friendIdx2 = friendIdx + 1; friendIdx2 < _friends.size() && !foundIncompatibility; ++friendIdx2) {
                User validatingFriend = (User) _friends.get(friendIdx2);
                foundIncompatibility = !validatingFriend.getFriends().contains(_friends.get(friendIdx));
            }
            if (!foundIncompatibility)
                clique.add(_friends.get(friendIdx));
        }
        return clique;
    }


//    public ArrayList findMaximumCliqueOfFriends () {
//        Set visitedFriends;
//        findMaximumCliqueOfFriends(visitedFriends);
//    }

//    //friends may not be empty if we execute this method
//    private ArrayList findMaximumCliqueOfFriends(int indexToVisit, ArrayList addedElems) {
//        if (!_friends.containsAll(addedElems)) {
//            return null;
//        } else {
//            ArrayList res1 = findMaximumCliqueOfFriends(indexToVisit + 1, addedElems);
//            addedElems.add(_friends.get(indexToVisit));
//            ArrayList res2 = findMaximumCliqueOfFriends(indexToVisit + 1, addedElems);
//            if (res1.size() > res2.size())
//                return res1;
//            else
//                return res2;
//        }
//    }
//
//    private ArrayList findMaximumCliqueOfFriends(Set visitedFriends) {
//        if (!_friends.containsAll(visitedFriends) || _friends.isEmpty()) {
//            return null;
//        } else {
//            for (int i = 0; i < _friends.size(); ++i) {
//                if (!visitedFriends.contains(_friends.at(i))) {
//                    return null;
//                }
//            }
//        }
//
//    }

}

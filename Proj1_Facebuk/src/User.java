import java.util.ArrayList;

public class User extends Profile {
    private ArrayList _friends; //those are of type User
    private ArrayList _moments; //those are of type Moment


    public User (String name, Image image) {
        super(name, image);
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



    // returns either a Person or a Pet -- with whom person p appears the most happy on average,
    // over all the moments in which both p and her/his friend f participate.
    // If person p has no friends with whom she/he appears in the same moment, then return null.
    User getFriendWithWhomIAmHappiest () {
        int nFriends = _friends.size();
        int nMoments = _moments.size();

        // in the next two arrays, each position of each array represents a friend
        // friendSumHappiness contains the sum of the levels of happiness of every friend over all the moments
        float[] friendsSumHappiness = new float[nFriends];

        // friendsSumOfMoments contains the number of moments each friend participated in
        int[] friendsSumOfMoments = new int[nFriends];

        for (int j = 0; j < nFriends; j++) {
            friendsSumHappiness[j] = 0;
            friendsSumOfMoments[j] = 0;
        }
        for (int i = 0; i < nMoments; i++) {
            Moment m = (Moment) _moments.get(i);
            for (int j = 0; j < nFriends; j++) {
                int idxFriend = m.getParticipants().indexOf(_friends.get(j));
                if (idxFriend != -1) { // if statement that evaluates whether the friend j is in the moment i
                    friendsSumHappiness[j] += (float) m.getSmileValues().get(idxFriend);
                    ++friendsSumOfMoments[j];
                }
            }
        }
        int idxBestFriend = -1;
        float bestAvgSmileValue = -1.0f;
        for (int j = 0; j < nFriends; j++) {
            float currentAvgSmileValue = friendsSumHappiness[j]/friendsSumOfMoments[j];
            if (bestAvgSmileValue < currentAvgSmileValue) {
                bestAvgSmileValue = currentAvgSmileValue;
                idxBestFriend = j;
            }
        }
        if (idxBestFriend == -1)
            return null;
        else
            return (User)_friends.get(idxBestFriend);
        // so, since we have the happiness of each friend and the number of events they were attending, we can compute an average of their happiness
    }

    Moment getOverallHappiestMoment () {
        int nMoments = _moments.size();
        if (nMoments == 0) return null;
        Moment happiestMoment = (Moment) _moments.get(0);
        float highestHappinessScore = happiestMoment.getHappinessScore();
        for (int i = 1; i < nMoments; ++i) {
            Moment m = (Moment) _moments.get(i);
            float happinessScore = m.getHappinessScore();
            if (happinessScore > highestHappinessScore) {
                highestHappinessScore = happinessScore;
                happiestMoment = m;
            }
        }
        return happiestMoment;
    }


    public ArrayList findMaximumCliqueOfFriends() {
        ArrayList clique = new ArrayList();
        //for each friend f1 we select for this User, it must be contained
        //in the list of friends of all the other friends of this user
        System.out.println("Hola1");
        for (int friendIdx = 0; friendIdx < _friends.size(); ++friendIdx) {
            System.out.println("Hola3");
            boolean foundIncompatibility = false;
            for (int friendIdx2 = friendIdx + 1; friendIdx2 < _friends.size() && !foundIncompatibility; ++friendIdx2) {
                User validatingFriend = (User) _friends.get(friendIdx2);
                foundIncompatibility = !validatingFriend.getFriends().contains(_friends.get(friendIdx));
            }
            if (!foundIncompatibility)
                clique.add(_friends.get(friendIdx));
        }
        System.out.println("Hola2");
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

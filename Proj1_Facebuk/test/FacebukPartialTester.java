import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * This is a SUBSET of the unit tests with which we will grade your code.
 *
 * Make absolute sure that your code can compile together with this tester!
 * If it does not, you may get a very low grade for your assignment.
 */
public class FacebukPartialTester {
    private Person _barack, _michelle, _kevin, _ina, _joe, _malia;
    private Person _melania, _marlon, _ivana, _hillary;
    private Person _robin, _humphrey, _tom, _charlotte;
    private Pet _bo, _sunny;
    private Moment _meAndBarack;
    private ArrayList _michelleAndBarack, _michelleJoeBoAndMalia;

    @Before
    public void setUp () {
        initPeople();
        initPets();
        initGroups();
        initPossessions();
        initMoments();
    }

    private void initPeople () {
        _michelle = new Person("Michelle", new Image("Michelle.png"));
        _barack = new Person("Barack", new Image("Barack.png"));
        _kevin = new Person("Kevin", new Image("Kevin.png"));
        _ina = new Person("Ina", new Image("Ina.png"));
        _joe = new Person("Joe", new Image("Joe.png"));
        _malia = new Person("Malia", new Image("Malia.png"));


        _melania = new Person("Melania", new Image("Melania.png"));
        _marlon = new Person("Marlon", new Image("Marlon.png"));
        _ivana = new Person("Ivana", new Image("Ivana.png"));
        _kevin = new Person("Kevin", new Image("Kevin.png"));
        _hillary = new Person("Hillary", new Image("Hillary.png"));
        _robin = new Person("Robin", new Image("Robin.png"));
        _humphrey = new Person("Humphrey", new Image("Humphrey.png"));
        _tom = new Person("Tom", new Image("Tom.png"));
        _charlotte = new Person("Charlotte", new Image("Charlotte.png"));


    }

    private void initPets () {
        _bo = new Pet("Bo", new Image("Bo.png"));
        _sunny = new Pet("Sunny", new Image("Sunny.png"));

        _bo.setOwner(_michelle);
        _sunny.setOwner(_michelle);
    }

    private void initGroups () {
        // Kevin, Barack, and Ina
        final ArrayList michelleFriends = new ArrayList();
        michelleFriends.add(_kevin);
        michelleFriends.add(_barack);
        michelleFriends.add(_ina);

        // Michelle and Barack
        _michelleAndBarack = new ArrayList();
        _michelleAndBarack.add(_michelle);
        _michelleAndBarack.add(_barack);

        // Michelle, Joe, Bo, and Malia
        _michelleJoeBoAndMalia = new ArrayList();
        _michelleJoeBoAndMalia.add(_michelle);
        _michelleJoeBoAndMalia.add(_joe);
        _michelleJoeBoAndMalia.add(_bo);
        _michelleJoeBoAndMalia.add(_malia);

        // Malia and Sunny
        final ArrayList maliaAndSunny = new ArrayList();
        maliaAndSunny.add(_malia);
        maliaAndSunny.add(_sunny);

        // Michelle
        final ArrayList michelleList = new ArrayList();
        michelleList.add(_michelle);

        // Bo
        final ArrayList boList = new ArrayList();
        boList.add(_bo);

        // Set people's friend lists
        _michelle.setFriends(michelleFriends);
        _malia.setFriends(boList);
        _sunny.setFriends(boList);
        _barack.setFriends(michelleList);
        _kevin.setFriends(michelleList);
        _ina.setFriends(michelleList);

        // Finish configuring pets
        _bo.setFriends(maliaAndSunny);
        _sunny.setFriends(boList);
        final ArrayList boAndSunny = new ArrayList();
        boAndSunny.add(_bo);
        boAndSunny.add(_sunny);
        _michelle.setPets(boAndSunny);

        //melania
        final ArrayList melaniaFriends = new ArrayList();
        melaniaFriends.add(_ivana);
        melaniaFriends.add(_kevin);
        melaniaFriends.add(_hillary);
        melaniaFriends.add(_marlon);

        final ArrayList marlonFriends = new ArrayList();
        marlonFriends.add(_melania);
        marlonFriends.add(_charlotte);
        marlonFriends.add(_kevin);
        marlonFriends.add(_humphrey);


        final ArrayList ivanaFriends = new ArrayList();
        ivanaFriends.add(_melania);
        ivanaFriends.add(_tom);
        ivanaFriends.add(_hillary);
        ivanaFriends.add(_kevin);


        final ArrayList kevinFriends = new ArrayList();
        kevinFriends.add(_melania);
        kevinFriends.add(_marlon);
        kevinFriends.add(_robin);
        kevinFriends.add(_hillary);
        kevinFriends.add(_humphrey);
        kevinFriends.add(_ivana);

        final ArrayList hillaryFriends = new ArrayList();
        hillaryFriends.add(_melania);
        hillaryFriends.add(_ivana);
        hillaryFriends.add(_kevin);
        hillaryFriends.add(_robin);

        _melania.setFriends(melaniaFriends);
        _marlon.setFriends(marlonFriends);
        _ivana.setFriends(ivanaFriends);
        _kevin.setFriends(kevinFriends);
        _hillary.setFriends(hillaryFriends);
        _robin.setFriends(new ArrayList());
        _humphrey.setFriends(new ArrayList());
        _tom.setFriends(new ArrayList());
        _charlotte.setFriends(new ArrayList());

    }

    private void initPossessions () {
        final Possession boxingBag = new Possession("BoxingBag", new Image("BoxingBag.png"), 20.0f);
        boxingBag.setOwner(_michelle);
        final ArrayList michellePossessions = new ArrayList();
        michellePossessions.add(boxingBag);
        _michelle.setPossessions(michellePossessions);
    }

    private void initMoments () {
        // Smiles
        final ArrayList michelleAndBarackSmiles = new ArrayList();
        michelleAndBarackSmiles.add(0.25f);
        michelleAndBarackSmiles.add(0.75f);

        final ArrayList michelleJoeBoAndMaliaSmiles = new ArrayList();
        michelleJoeBoAndMaliaSmiles.add(0.2f);
        michelleJoeBoAndMaliaSmiles.add(0.3f);
        michelleJoeBoAndMaliaSmiles.add(0.4f);
        michelleJoeBoAndMaliaSmiles.add(0.5f);

        // Moments
        _meAndBarack = new Moment("Me & Barack", new Image("MeAndBarack.png"), _michelleAndBarack, michelleAndBarackSmiles);
        final Moment meJoeAndCo = new Moment("Me, Joe & co.", new Image("MeJoeAndCo.png"), _michelleJoeBoAndMalia, michelleJoeBoAndMaliaSmiles);

        final ArrayList michelleMoments = new ArrayList();
        michelleMoments.add(_meAndBarack);
        michelleMoments.add(meJoeAndCo);
        _michelle.setMoments(michelleMoments);

        final ArrayList barackMoments = new ArrayList();
        barackMoments.add(_meAndBarack);
        _barack.setMoments(barackMoments);

        final ArrayList joeMoments = new ArrayList();
        joeMoments.add(meJoeAndCo);
        _joe.setMoments(joeMoments);

        final ArrayList maliaMoments = new ArrayList();
        maliaMoments.add(meJoeAndCo);
        _malia.setMoments(maliaMoments);

        final ArrayList boMoments = new ArrayList();
        boMoments.add(meJoeAndCo);
        _bo.setMoments(boMoments);
    }

    @Test
    public void testEquals () {
        assertEquals(_michelle, new Person("Michelle", new Image("Michelle.png")));
        assertEquals(_michelle, new Person("Michelle", new Image("Michelle2.png")));  // should still work
        assertNotEquals(_michelle, _barack);
    }

    @Test
    public void testFindBestMoment () {
        assertEquals(_michelle.getOverallHappiestMoment(), _meAndBarack);
    }

    @Test
    public void testGetFriendWithWhomIAmHappiest () {
        assertEquals(_michelle.getFriendWithWhomIAmHappiest(), _barack);
    }

    @Test
    public void testFriendRequest1 () {
        Person person1 = new Person("person1", new Image("person1.png"));
        Person person2 = new Person("person2", new Image("person2.png"));
        Pet pet1 = new Pet("pet1", new Image("pet1.png"));

        FriendRequest friendRequest1 = new FriendRequest(person1, person2);
        // Make sure the code also compiles for making friend requests for people and pets
        FriendRequest friendRequest2 = new FriendRequest(person1, pet1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFriendRequest2 () {
        Person person1 = new Person("person1", new Image("person1.png"));
        Person person2 = new Person("person2", new Image("person2.png"));
        Person person3 = new Person("person3", new Image("person3.png"));
        FriendRequest friendRequest = new FriendRequest(person1, person2);
        // This should raise an IllegalArgumentException:
        friendRequest.approve(person3);
    }



    // TODO: write more methods to test addFri    // TODO: write more methods to test addFriend
    @Test
    public void testAddFriend1 () {

       // for (int i = 0; i < _michelle.getFriends().size(); i++) {
       //     System.out.print(" " + _michelle.getFriends().get(i).get);
       // }_
         _michelle.addFriend(_tom);
       // for (int i = 0; i < _michelle.getFriends().size(); i++) {
       //     System.out.print(" " + _michelle.getFriends().get(i));
       // }
       // System.out.println("---------------------");
        assertEquals(_michelle.getFriends().contains(_tom), true);
        assertEquals(_tom.getFriends().contains(_michelle), false);

        /*
        assertEquals(_ivana.getFriends().contains(_marlon), false);
        _ivana.addFriend(_marlon);
        assertEquals(_ivana.getFriends().contains(_marlon), true); */
    }


    @Test
    public void testAddFriend2 () {
        assertEquals(_ivana.getFriends().contains(_marlon), false);
        _ivana.addFriend(_marlon);
        assertEquals(_ivana.getFriends().contains(_marlon), true);
    }


    // TODO: write more methods to test approve
    @Test
    public void testApprove () {
        FriendRequest frKevinSunny = new FriendRequest(_kevin, _sunny);
        assertEquals(_kevin.getFriends().contains(_sunny), false);
        assertEquals(_sunny.getFriends().contains(_kevin), false);
        frKevinSunny.approve(_kevin);
        assertEquals(_kevin.getFriends().contains(_sunny), false);
        assertEquals(_sunny.getFriends().contains(_kevin), false);
        frKevinSunny.approve(_sunny);
        assertEquals(_kevin.getFriends().contains(_sunny), true);
        assertEquals(_sunny.getFriends().contains(_kevin), true);
    }

    // TODO: write more methods to test getFriendWithWhomIAmHappiest

    public void testGetFriendWithWhomIAmHappiest2 () {
        assertEquals(_barack.getFriendWithWhomIAmHappiest(), _michelle);
        assertEquals(_malia.getFriendWithWhomIAmHappiest(), _bo);
    }

    // TODO: write more methods to test getOverallHappiestMoment
    @Test
    public void testGetOverallHappiestMoment () {
        assertEquals(_barack.getOverallHappiestMoment(), _meAndBarack);
    }
    // TODO: write more methods to test approve

    // TODO: write more methods to test getFriendWithWhomIAmHappiest
    // TODO: write more methods to test getOverallHappiestMoment

    // TODO: write methods to test isClique
    // TODO: write methods to test findMaximumCliqueOfFriends


    @Test
    public void testIsClique () {
        ArrayList clique = new ArrayList();
        clique.add(_ivana);
        clique.add(_kevin);
        clique.add(_hillary);
        assertEquals(User.isClique((clique)), true);
    }

    //checking whether the returned set by findMaximumCliqueOfFriends does not contain the person on which the method was
    //called
    @Test
    public void testFindMaximumCliqueOfFriends () {
        ArrayList maxClique = _melania.findMaximumCliqueOfFriends();
        for (int i = 0; i < maxClique.size(); ++i) {
            System.out.println(((User) maxClique.get(i)).getName());
        }
        ArrayList correctClique = new ArrayList();
        correctClique.add(_ivana);
        correctClique.add(_kevin);
        correctClique.add(_hillary);

        assertEquals(maxClique.containsAll(correctClique), true);
        assertEquals(correctClique.containsAll(maxClique), true);
        //assertEquals(_melania.findMaximumCliqueOfFriends().contains(_melania), false);
        //assertEquals(_melania, _melania);
    }

}
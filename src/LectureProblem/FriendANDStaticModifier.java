package LectureProblem;

public class FriendANDStaticModifier {
    //attribute
    String name;
    //if we left numofFriends as int numofFriends without static, it won't be a shared counter to know how many friends created. and each time an object
    //friend created num of friend will call an object of numofFriends and it will not be a counter for all created objects that's why static is important
    static int numofFriends;
    //constructor
    FriendANDStaticModifier(String name)
    {
        this.name = name;
        //whenever we create a friend object, we'll increment num of friends by 1
        //numofFriends is not a property of a single friend, it’s a counter for all friends.
        numofFriends++;
    }


    public static void main(String[] args)
    {
        //constructing 2 friends in main
        FriendANDStaticModifier friend1 = new FriendANDStaticModifier("Fatma");
        FriendANDStaticModifier friend2 = new FriendANDStaticModifier("Mohamed");
        FriendANDStaticModifier friend3 = new FriendANDStaticModifier("Mohamed");
        //when accessing static variable: it's better to do so through the class itself not the objects (friend1 or 2 or 3)
        System.out.println(FriendANDStaticModifier.numofFriends);
    }

}

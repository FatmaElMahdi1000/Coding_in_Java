package Interface.EX5;

public class Drone implements Trackable{

    @Override
    //Interface overridden method must be public
    public void updateGPS()
    {
        System.out.println("Updated");
    }
}

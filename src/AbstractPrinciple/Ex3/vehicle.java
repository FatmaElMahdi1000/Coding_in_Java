package AbstractPrinciple.Ex3;
import java.util.ArrayList;
import java.util.Random;

public abstract class vehicle
{
    int speed;
    Random obj = new Random();
    ArrayList<String> colours = new ArrayList<>();

    //constructor .. abstract methods can have
    vehicle(int speed)
    {
        this.speed = speed;
        colours.add("Red");
        colours.add("Blue");
        colours.add("Dark Blue");
        colours.add("White");
    }
    //Concrete method
    String getrandomcolour()
    {
        int idx = obj.nextInt(colours.size());
        return colours.get(idx);
    }
    //abstract
    abstract String colour();
    //concrete method

    int doubledspeed(int speed)
    {
        return speed*2;
    }

}

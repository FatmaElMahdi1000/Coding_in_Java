package AbstractPrinciple.Ex3;

//concrete derived class/ subclass
public class Bicycle extends vehicle
{
    Bicycle(int speed)
    {
        //since we've a constructor in the abstract class, the child strictly must use it.
        //we must add the value added to the abstract constructor.
        super(speed);

    }
    @Override
    String colour()
    {
        return "this Bicycle has " + getrandomcolour() + " Colour";

    }

}

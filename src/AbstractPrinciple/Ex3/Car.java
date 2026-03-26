package AbstractPrinciple.Ex3;

public class Car extends vehicle
{
    Car(int speed)
    {
        super(speed);
    }
    @Override
    String colour()
    {
        return "This Car has " + getrandomcolour() + " Colour";
    }

}

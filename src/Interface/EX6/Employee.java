package Interface.EX6;

public class Employee implements Moveable{


    //overridden methods must be public
    @Override
    public void updateLocation()
    {
        System.out.println(Location);
    }

    public static void main(String[] args)
    {
        Moveable mv1 =  new Employee(); //Correct
        Employee mv2 =  new Employee(); // Correct
        System.out.println(mv1.Location);
        System.out.println(Location); //can be called with no instance of object, it's in an interface and no constuctor in interfaces
        System.out.println(mv2.Location);
        System.out.println(Moveable.Location); //called directly with the interface name, correct as well
    }
}

package AbstractPrinciple.Ex3;

public class Main {
    public static void main(String[] args)
    {
        Bicycle bi1 = new Bicycle(23);
        Car c1 = new Car(32);

        System.out.println(bi1.colour());
        System.out.println("Bicycle double speed: " + bi1.doubledspeed());

        System.out.println(c1.colour());
        System.out.println("Car double speed: " + c1.doubledspeed());

    }
}

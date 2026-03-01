package OOP.Car.Example;

public class Main {
    public static void main(String[] args)
    {

        OOP.Car.Example.Car car = new OOP.Car.Example.Car();
        System.out.println(car.is_running);
        car.start();
        System.out.println(car.is_running);
        car.stop();
        System.out.println(car.is_running);
        car.drive();
        car.brake();
    }

}

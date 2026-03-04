package OOP;

public class Main {

    public static void main(String[] args)
    {
        //object accessing the circle constructor, we should pass the radius
        Circle circle1 = new Circle(3.4);
        Circle circle2 = new Circle(5.9);
        System.out.println(circle1.area());
        System.out.println(circle2.perimeter());

    }
}

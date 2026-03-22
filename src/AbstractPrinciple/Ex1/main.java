package AbstractPrinciple.Ex1;

public class main
{
    public static void main(String[] args) {    //object of circle child class
        circle cir = new circle(2);
        Triangle tri = new Triangle(2,2);
        Rectangle rect = new Rectangle();
        //display method is concrete method,
        // inherited by default, no need to use @override as we do with the abstract methods
        cir.display();
        //we used area the abstract method.


        System.out.println("Circle's Area -BEFORE =  " + cir.area());
        System.out.println("triangle's Area= "+ tri.area());
        // Encapsulation in action: The 'radius' field is hidden (private).
        // Directly accessing it via 'cir.radius' would cause a compilation error.
        // cir.radius = 10;
        // To modify the state safely, we must use the public 'setter' method.

        cir.setRadius(3);
        System.out.println("Circle's Area -AFTER =  " + cir.area());

    }

}

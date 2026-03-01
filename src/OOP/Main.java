package OOP;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        Circle mycircle = new Circle();
        System.out.println("Enter the radius: ");
        mycircle.radius = obj.nextDouble();
        System.out.println("The Area = "+ mycircle.area());
        System.out.println("The perimeter= " + mycircle.perimeter());
    }
}

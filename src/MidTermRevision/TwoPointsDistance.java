package MidTermRevision;
import java.util.*;
public class TwoPointsDistance {
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter x1: ");
        double x1 = num.nextDouble();
        System.out.println("Enter x2: ");
        double x2 = num.nextDouble();
        System.out.println("Enter y1: ");
        double y1 = num.nextDouble();
        System.out.println("Enter y2: ");
        double y2 = num.nextDouble();
        double Distance = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 -y1), 2)));
        System.out.println(Distance);
        num.close();

    }
}

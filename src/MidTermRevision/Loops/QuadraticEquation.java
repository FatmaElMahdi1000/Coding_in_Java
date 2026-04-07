package MidTermRevision.Loops;
import java.util.*;
public class QuadraticEquation {
    //attributes
    double a;
    double b;
    double c;

    //Non parametrized
    QuadraticEquation()
    {

    }
//  parametrized Constructor
    QuadraticEquation( double a,  double b,  double c)
    {
        this.a = a;
        this.b = b;
        this.c= c;
    }
    double discriminant()
    {
        return Math.pow(b, 2) - (4*a*c);
    }

    String decision()
    {
        double result = discriminant();

        if (result > 0.0)
        {
            double r1 = (-b + Math.sqrt(result)) / (2*a);
            double r2 = (-b - Math.sqrt(result))  / (2*a);
            return "Root1 = "+r1 +" AND Root2= " + r2;
        }
        else if(result == 0.0)
        {
            double r1 = (-b + Math.sqrt(result)) / (2*a);
            return "Root1 = "+r1 ;
        }
        else
        {
            return "The equation has no real roots";
        }

    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        //creating an array that can hold 3 references, but initially all elements are null
        //Usage of array of objects.
        QuadraticEquation[] QE = new QuadraticEquation[3]; //0 1 2
        for(int i = 0; i < QE.length; i++)
        {
            //the loop then creates an actual QuadraticEquation object for each position
            QE[i] = new QuadraticEquation();
            System.out.print("Enter a of the quadratic equation"+ (i + 1)+" :");
            QE[i].a = obj.nextDouble();
            System.out.print("Enter b of the quadratic equation"+ (i + 1)+" :");
            QE[i].b = obj.nextDouble();
            System.out.print("Enter c of the quadratic equation"+ (i + 1)+" :");
            QE[i].c = obj.nextDouble();
            QE[i].discriminant();
            System.out.println("The final decision/Result of Equation #"+ (i + 1)+" = " + QE[i].decision());
        }

    }
}

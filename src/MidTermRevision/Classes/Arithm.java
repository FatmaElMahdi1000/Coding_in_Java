package MidTermRevision.Classes;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Arithm {
    //attribute
    double number;
    //constructor with no parameter that initializes the number to 1
    Arithm()
    {
        number = 1;
    }
    //parameterized
    Arithm(double number)
    {
        this.number = number;
    }

    public double getNum()
    {
        return number;
    }
    public void setNum(int number)
    {
        this.number = number;
    }

    public double Factorial()
    {
        int factNum = 1;
        for(int i = 1; i<=number; i++)
        {
            factNum *= i;
        }
        return factNum;

    }

    //means the numth in fib series will be?
    public double Fib()
    {
        ArrayList<Double> fibNums = new ArrayList<>();

        //base case: the first 2 nums in fib series are 1s.
        if(number == 1 || number == 2)
        {
            return 1;
        }
        else
        {
            fibNums.add(1.0);
            fibNums.add(1.0);

            for(int i = 2; i < number; i++)
            {                          //3-1 = 2  // 3-2 = 1
                fibNums.add(fibNums.get(i-1) + fibNums.get(i-2));
            }

        }
        //alternatively we can also write: fibNums.get(fibNums.size() - 1)
        return fibNums.getLast();
    }

    public String EvenOdd()
    {
        if(number % 2 == 0.0)
        {
            return "it's even number";
        }
        else
        {
            return "it's an odd number";
        }
    }

    //Prime number: can be evenly divide by 1 and itself ONLY, 1 is not a prime
    String PrimeOrNot()
    {
        if(number == 1)
        {
            return "Not a prime";
        }
        else
        {
            for(int i = 2; i < number; i++)
            {
                if(number % i == 0)
                {
                    return number + " is not a prime";
                }
            }
            //so we can let for, loop through all elements till number and not stop it, If we finished the whole loop without returning, it IS prime
            return number + " is a prime";
        }

    }
    double SquaredValue()
    {
        return Math.pow(number, 2);
    }

    public static void main(String[] args)
    {
        Arithm num1 = new Arithm(5);
        Arithm num2 = new Arithm(6);
        JOptionPane.showMessageDialog(null, "Number: " + num1.number + "\n" +
                "Fibonacii: " + num1.Fib() + "\n"+
                "Factorial: " + num1.Factorial() + "\n" +
                "Squared Value: " + num1.SquaredValue()+"\n"+
                num1.EvenOdd()+"\n"+
                num1.PrimeOrNot());
        JOptionPane.showMessageDialog(null, "Number: " + num2.number + "\n" +
                "Fibonacii: " + num2.Fib() + "\n"+
                "Factorial: " + num2.Factorial() + "\n" +
                "Squared Value: " + num2.SquaredValue()+"\n"+
                num2.EvenOdd()+"\n"+
                num2.PrimeOrNot());
    }

}

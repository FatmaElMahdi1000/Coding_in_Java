package WhileForDoWhileLoop;
import java.util.*;
public class GuessTheNum {

    public static void main(String[] args)
    {
        double target = 5;
        Scanner obj = new Scanner(System.in);
        System.out.print("Guess a number : ");
        double num = obj.nextDouble();
        while(num != target)
        {
            System.out.println("NOT A MATCH! TRY AGAIN!");
            if(num > target)
            {
                System.out.println("TOO HIGH!");
            }
            else if(num < target)
            {
                System.out.println("TOO LOW!");
            }
            System.out.println("Your Next Guess: ");
            num = obj.nextDouble();
        }
        System.out.println("A MATCH, Congraaaatsss!");
    }
}

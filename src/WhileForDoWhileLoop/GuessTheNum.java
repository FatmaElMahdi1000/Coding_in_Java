package WhileForDoWhileLoop;
import java.util.*;
import java.util.Random;
public class GuessTheNum {

    public static void main(String[] args)
    {
        Random rnd = new Random();
        //Holds a random number:
        int target = rnd.nextInt(1, 101);
        Scanner obj = new Scanner(System.in);
        System.out.print("Guess a number : ");
        int num = obj.nextInt();
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
            num = obj.nextInt();
        }
        System.out.println("A MATCH, Congraaaatsss!");
    }
}

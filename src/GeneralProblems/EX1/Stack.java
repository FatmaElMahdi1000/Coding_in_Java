package GeneralProblems.EX1;
import java.util.*;

public class Stack {
    List<Integer> StackArr = new ArrayList<>(4);
    Scanner input = new Scanner(System.in);
    //Non parametrized Constructor
    Stack()
    {
    }
    public void push( )
    {
        if(StackArr.size() <4)
        {
            System.out.println("Enter a number to push: ");
            int number = input.nextInt();
            StackArr.add(number);
            System.out.println("Number: "+ number + " has been pushed to the stack!");
        }
        else
        {
            System.out.println("Stacl OverFlow, Cannot add another element!");
        }
    }
    public void pop()
    {
        if(StackArr.isEmpty())
        {
            System.out.println("Stack UnderFlow! Nothing to remove!");
        }
        else
        {
            int popped = StackArr.remove(StackArr.size() - 1);
            System.out.println("Number: "+ popped + " has been popped from the stack!");
        }

    }
    void Display()
    {
        for(int i = 0; i < StackArr.size(); i++)
        {
            System.out.print(StackArr.get(i) + " ");
        }
    }
    public static void main(String[] args)
    {
        Stack s1 = new Stack();
        for(int j = 0; j <= 4; j++)
        {
            s1.push();
        }
        s1.Display();
        s1.pop();
        s1.Display();
        s1.pop();
        s1.Display();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.Display();
    }
}

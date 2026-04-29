import java.util.ArrayList;
import java.util.Scanner;

//stack First in last out
public static class StackArr {

    int MaxSize = 6;
    //Each class object should have its own top, so we keep this non-static
    int top = 0;
    ArrayList<Integer> StArr = new ArrayList<>();
    Scanner obj = new Scanner(System.in);
    StackArr()
    {

    }

    public void push()
    {

        if(top == MaxSize)
        {
            System.out.println("cannot push the element! StackOverFlow!");
            return;
        }
        else
        {
            System.out.print("Enter the Element you'd like to push: ");
            int element = obj.nextInt();
            StArr.add(element);
            top += 1;
            System.out.println("Data Pushed onto the stack!");
        }
    }
    public void pop()
    {
        if(top == 0)
        {
            System.out.println("Stack underflow, No elements to pop!");
            return;
        }
        else
        {
            int poppedElement = StArr.remove(top-1);
            System.out.println("Poped Element: " + poppedElement);
            top-=1;
        }
    }

    public void Display()
    {
        if(top == 0)
        {
            System.out.println("Nothing to display! Empty Stack!");
        }
        else
        {
            System.out.println("Current Stack: ");
            int i;
            for(i = 0; i <top; i++)
            {
                System.out.print(StArr.get(i) + " ");
            }
            System.out.println();
        }
    }
}

public static void main(String args[])
{
    StackArr Stack = new StackArr();
    Stack.push();
    Stack.push();
    Stack.push();
    Stack.Display();
    Stack.pop();
    Stack.Display();

}

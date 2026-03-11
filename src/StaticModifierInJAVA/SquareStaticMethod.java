package StaticModifierInJAVA;

public class SquareStaticMethod
{
    static int sqr(int x)
    {
        return x * x;
    }
    public static void main(String[] args)
    {
        //no need to create an object now as we've defined a static method. static method relates to the class itself not created objects
       // SquareStaticMethod result1 = new SquareStaticMethod();
        //Accessing the static method through the class itself, as the class own it.
        System.out.println("Result #1 is = " + SquareStaticMethod.sqr(4));
        System.out.println("Result #2 is = " + SquareStaticMethod.sqr(5));

    }
}

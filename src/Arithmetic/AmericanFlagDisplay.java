package Arithmetic;

public class AmericanFlagDisplay {

    public static void main(String[] args)
    {
        for (int i = 1; i <= 9; i++)
        {
            if(i % 2 != 0)
            {
                System.out.println("* * * * * * ==================================");
            }
            else
            {
                System.out.println(" * * * * *  ==================================");
            }
        }
        for (int j = 1; j <= 6; j++)
        {
            System.out.println("=".repeat(46));
        }

    }
}

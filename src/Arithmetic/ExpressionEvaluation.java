package Arithmetic;

public class ExpressionEvaluation
{
    public double eval()
    {
        return ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
    }
    public static void main(String[] args)
    {
        //main class obj
        ExpressionEvaluation obj = new ExpressionEvaluation();
        double result  = obj.eval();
        System.out.println(result);

    }
}

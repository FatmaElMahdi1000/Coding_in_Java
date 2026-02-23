package Arithmetic;

public class FormulaComputation {

    public double comp()
    {
        return 4.0 * (1.0- (1.0/3.0) + (1.0/5.0) - (1.0/7.0) + (1.0/9.0) - (1.0/11.0));
    }

    public static void main(String[] args )
    {
        //main class obj to access the comp method
        FormulaComputation obj = new FormulaComputation();
        double res = obj.comp();
        System.out.println("Result = " + res);
    }


}

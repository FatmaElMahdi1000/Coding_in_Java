import OP_Pack.OPR;

public class Main {

    public static void main(String[] args)
    {
        int a  = 3;
        int b = 2;
        //object creation
        OPR obj = new OPR();
        int res = obj.summation(a, b);
        System.out.println("The sum result: " + res);
        //division object
        OPR obj2 = new OPR();
        float res2 = obj2.division(a, b);
        System.out.println("The division result = " + res2);


    }
}

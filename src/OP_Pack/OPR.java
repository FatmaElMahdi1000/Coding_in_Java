package OP_Pack;

//class
//public is an access modifier
public class OPR {
    //method
    public int summation(int a, int b)
    {
        return a + b;
    }
    //method
    public float division(float a, float b)
    {
        return a/b;
    }
    //Adding main method here as well (the gate away)
    public static void main(String[] args)
    {
        int a = 3;
        int b = 2;
        //sum object
        OPR GetSum = new OPR();
        int res1 = GetSum.summation(a, b);
        //division object
        OPR Getdiv = new OPR();
        float res2 = Getdiv.division(a, b);
        System.out.println("The Summation result= " + res1);
        System.out.println("The division result = " + res2);
    }

}


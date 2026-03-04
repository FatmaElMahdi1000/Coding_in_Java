package Basics;
public class ConditionalPosOrNeg {
    //attributes;
    private  double value;
    //constructor
    ConditionalPosOrNeg(double value)
    {
        setValue(value);
        this.value = value;
    }
    //no need to add parameter, get methods for making it readabe.
    String getValue()
    {
        if (this.value < 0)
        {
            return "It's a negative number!";
        }
        else if (this.value == 0)
        {
            return "This is ZERO!";
        }
        else
        {
            return "This is a positive number";
        }
    }
    //make attribute writable
    void setValue(double value)
    {
        this.value = value;
    }

    public static void main(String[] args)
    {
        ConditionalPosOrNeg Num1Status = new ConditionalPosOrNeg(4);
        ConditionalPosOrNeg Num2Status = new ConditionalPosOrNeg(-2);
        System.out.println(Num1Status.getValue());
        System.out.println(Num2Status.getValue());

        //set Num1Status to -5 using setValue method, it helps changing the value even when the attribute took private access modifier.
        Num1Status.setValue(-5);
        //getting the new value status  using getValue() method
        System.out.println(Num1Status.getValue());
    }
}

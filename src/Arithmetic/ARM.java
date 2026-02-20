package Arithmetic;

public class ARM {

    public static void main(String[] args)
    {
        float a = -5.0f + (8.0f * 6.0f);
        float b = (55+9) % 9;
        float c = 20 + (-3.0f * 5.0f / 8.0f); //converted numbers to float
        float d = 5 + (15.0f / 3.0f * 2.0f) - 8.0f % 3.0f;
        System.out.println("Results\n" +
                "a = "+a + "\nb ="+b + "\nc ="+c + "\nd ="+d);
    }

}

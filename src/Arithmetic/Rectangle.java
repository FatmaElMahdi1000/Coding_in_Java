package Arithmetic;
import java.util.Scanner;//for inputs
public class Rectangle {
    //area and Perimeter computation
    public String Rect(double height, double width)
    {
        //area = a*b perimeter= 2(a + b)
        return "Area = "+ height*width + '\n'+
                "perimeter = "+ 2*(height + width) + '\n';
    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the height: ");
        double height = obj.nextDouble();
        System.out.print("Enter the width: ");
        double width = obj.nextDouble();
        //Main class obj to access "Rect" Method
        Rectangle object = new Rectangle();
        String result = object.Rect(height, width);
        System.out.println(result);
        //Closing the input stream
        obj.close();
    }
}

package LectureProblem;

//non static here, observe we've accessed the method using an instance or created object:
//
public class SquareNonStaticMethod {
    //attributes:
    int num;
    //constructor
    SquareNonStaticMethod(int num){
        this.num = num;
    }
    int sqr()
    {
        return num * num;
    }

    public static void main(String[] args)
    {
        //object/ instance #1 by which we'll access the class methods OR attributes
        SquareNonStaticMethod instance1 = new SquareNonStaticMethod(5);
        System.out.println("Result 1 = "+ instance1.sqr());
        //object2 / instance#2  by which we'll access the class methods OR attributes
        SquareNonStaticMethod instance2 = new SquareNonStaticMethod(6);
        System.out.println("Result 2 = "+ instance2.sqr());
    }

}

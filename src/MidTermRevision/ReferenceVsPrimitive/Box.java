package MidTermRevision.ReferenceVsPrimitive;

public class Box {

    //Box Attributes
    double width;
    double height;
    double depth;
    //Box
    //parameterized constructor
    Box(double width, double height, double depth)
    {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }
    //overloading concept
    //non-parameterized constructor
    Box()
    {
    }
    public static void main(String[] args)
    {
        //object of the parametrized constructor
        Box box1 = new Box(3, 4, 5);
        //object of the non-parametrized constructor
        Box box2 = new Box();
        System.out.println(box1.depth);
        System.out.println(box2.depth);//0 by default since it's created from non-parametrized constructor
        Box box3 = box2;
        System.out.println(box3.depth);

        //Notes:
        //In Java, any variable that refers
        // to an object (anything created with the new keyword or a class instance) is a Reference Data Type.
        //box2 is a reference variable.
        //box3 is a reference variable.
        //Both: holding pointer on the "stack" memory that's referring to the same value on the "Heap" memory
    }

}


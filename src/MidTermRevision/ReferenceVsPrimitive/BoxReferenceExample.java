package MidTermRevision.ReferenceVsPrimitive;

public class BoxReferenceExample {

    //Box Attributes
    double width;
    double height;
    double depth;
    //Box
    //parameterized constructor
    BoxReferenceExample(double width, double height, double depth)
    {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }
    //overloading concept
    //non-parameterized constructor
    BoxReferenceExample()
    {
    }
    public static void main(String[] args)
    {
        //object of the parametrized constructor
        BoxReferenceExample boxReferenceExample1 = new BoxReferenceExample(3, 4, 5);
        //object of the non-parametrized constructor
        BoxReferenceExample boxReferenceExample2 = new BoxReferenceExample();
        System.out.println(boxReferenceExample1.depth);
        System.out.println(boxReferenceExample2.depth);//0 by default since it's created from non-parametrized constructor
        BoxReferenceExample boxReferenceExample3 = boxReferenceExample2;
        System.out.println(boxReferenceExample3.depth);

        //Notes:
        //In Java, any variable that refers
        // to an object (anything created with the new keyword or a class instance) is a Reference Data Type.
        //box2 is a reference variable.
        //box3 is a reference variable.
        //Both: holding pointer on the "stack" memory that's referring to the same value on the "Heap" memory
    }

}


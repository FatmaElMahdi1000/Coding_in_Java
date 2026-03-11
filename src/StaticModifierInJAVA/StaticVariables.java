package StaticModifierInJAVA;

public class StaticVariables {
    String objDes;
    //we can access counter with the class name, it belongs to the class not the object.
    static int counter;
    //constructor
    StaticVariables(String objDes)
    {
        this.objDes = objDes;
        //increments count every time an object is created.
        counter++;
    }
    public static void main(String[] args)
    {
        StaticVariables obj1 = new StaticVariables("Object#1");
        StaticVariables obj2 = new StaticVariables("Object#2");
        System.out.println("Number of the created objects = "+ StaticVariables.counter);
        StaticVariables obj3 = new StaticVariables("Object#3");
        System.out.println("Number of the created objects = "+ StaticVariables.counter);
    }
}

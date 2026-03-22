package AbstractPrinciple.Ex1;

//
public abstract class shape {
    //since this is Abstract method we need to override it using @override in the child class.
    abstract double area(); //ABSTRACT METHOD
    //Concrete methods are inherited by the derived classed(childern) no need to call it there
    //or using @override annotation for it.
    void display() //concrete method
    {
        System.out.println("This is a shape");
    }

}

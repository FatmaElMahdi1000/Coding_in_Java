package AbstractPrinciple.Ex2;

public abstract class Bird
{
    private double size;
    String sound;

    //sing() is a concrete method
    //will be inherited by derived classes/childern
    //Won't be used. only for demonstration sake
    void sing(){};
    //to be overridden by the derived classes/childern since it's abstract method
    //Note Abstract methods must not have a body {}
    abstract String fly();
    abstract String makeSound();
    //getSize (make the private attribute readable)

    public double getSize()
    {
        return size;
    }

    //setSize (make the private attribute readable and writeable)
    public void setSize(double size)
    {
        this.size = size;
    }


}

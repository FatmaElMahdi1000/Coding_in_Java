package AbstractPrinciple.Ex2;

public class Eagle extends Bird
{
    //Constructor
    Eagle(double size, String sound)
    {
        setSize(size);
        this.sound = sound;

    }
    //overriding abstract methods
    @Override
    String fly()
    {
        return "The Eagle with size " + getSize() + " can actually still fly!!";
    }
    @Override
    String makeSound()
    {
        return "the Eagle's sound is " + sound;
    }

}

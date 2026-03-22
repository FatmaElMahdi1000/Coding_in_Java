package AbstractPrinciple.Ex2;

public class Hawk extends Bird
{

    //constructor
    Hawk(double size, String sound)
    {
        setSize(size);
        this.sound = sound;
    }
    //Behaviours/Methods
    @Override
    String fly() {
        return "This Hawk that weighs  = " + getSize() + " might be sick, it's incapable of flying";
    }
    @Override
    String makeSound()
    {
        return "it's "+ sound + " sound!";
    }
}

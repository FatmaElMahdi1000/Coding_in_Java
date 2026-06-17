package Interface.smarthomeDeviceEcosystem;

public class StandardLight implements Switchable{

    @Override
    public void TurnOn()
    {
        System.out.println("Light is now ON!");
    }
    @Override
    public void TurnOff()
    {
        System.out.println("Light is now OFF!");
    }
}

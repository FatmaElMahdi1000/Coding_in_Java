package Interface.smarthomeDeviceEcosystem;

public class SmartBulb implements Switchable, Dimmable{

    private int brightness = 100;

    @Override
    public void setBrightness(int level) {
        if (level >= 1 && level <= 100) {
            this.brightness = level;
            System.out.println("SmartBulb brightness set to " + this.brightness + "%.");
        } else {
            System.out.println("Invalid brightness level.");
        }
    }
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

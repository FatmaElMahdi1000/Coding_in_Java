package AbstractPrinciple.EX4;

public class TV extends Device
{
    public TV(int YearMade)
    {
        super(YearMade);
    }

    @Override
    void DeviceOff()
    {
        System.out.println("Device turned off");

    }
    @Override
    void DeviceOn()
    {
        System.out.println("Device turned on");

    }
}

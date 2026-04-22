package AbstractPrinciple.EX4;

class TvRemote extends Device
{

    @Override
    void DeviceOff()
    {
        System.out.println("Tv turned off");

    }
    @Override
    void DeviceOn()
    {
        System.out.println("Tv turned on");

    }
}

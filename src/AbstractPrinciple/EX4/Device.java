package AbstractPrinciple.EX4;

abstract class Device
{

    int YearMade;
    //constructor
    public Device(int YearMade)
    {
        this.YearMade = YearMade;
    }
    //Abstract method
    abstract void DeviceOn();
    abstract void DeviceOff();

    //concrete  method (Hidden here,in the abstract class(the implementation is here) however it still does not appear in the
    //child class and the child can still use it.
    String getManufacturingYear()
    {
        return "Manufactured by: " +  this.YearMade;
    }

}

package AbstractPrinciple.EX4;

abstract class TV
{

    String RemoteType;
    //constructor
    public TV(String RemoteType)
    {
        this.RemoteType = RemoteType;
    }
    //Abstract method
    abstract void turnOn();
    abstract void turnOff();

    //Concrete Method
    String getRemoteType()
    {
        return this.RemoteType;
    }

}

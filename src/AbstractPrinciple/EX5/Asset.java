package AbstractPrinciple.EX5;

public abstract class Asset {
    private String fileName;

    //Abstract class can have concrete constructor and Concrete
    // Methods a long with abstract methods
    Asset(String fileName)
    {
        this.fileName = fileName;
    }

    //Abstract method
    public abstract void execute();// Nobody
    //Concrete Method
    public String getFileName()
    {
        return this.fileName;
    }

}

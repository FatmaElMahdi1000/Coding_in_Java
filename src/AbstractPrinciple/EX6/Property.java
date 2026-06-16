package AbstractPrinciple.EX6;

public abstract class Property {

    private double OtherTaxes;
    //Non parametrized Constructor
    Property(double OtherTaxes)
    {
        this.OtherTaxes = OtherTaxes;
    }

    //Concrete method
    public double getOtherTaxes()
    {
        return this.OtherTaxes;
    }
    //Abstract method
    public abstract double calculateTax(); //No body and we cannot create an instance of an abstract class
}

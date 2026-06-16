package AbstractPrinciple.EX6;

//Concrete subclass
public class Commercial extends Property {

    private double propertyValue;
    private double taxRate;
    //Concrete Constructor
    public Commercial(double propertyValue, double taxRate,  double OtherTaxes)
    {
        super(OtherTaxes);
        this.propertyValue = propertyValue;
        this.taxRate = taxRate;
    }

    @Override
    public double calculateTax()
    {
        return (propertyValue * taxRate)  + super.getOtherTaxes();
    }


    public static void main(String[] args)
    {
        Commercial cl = new Commercial(10000, 0.10 , 5000);
        System.out.println(cl.calculateTax());
    }
}

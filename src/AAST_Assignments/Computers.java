package AAST_Assignments;

public class Computers
{
    //attributes
    private String brand;
    private String model;
    private double price;
    private double discount;
    //Constructor
    Computers(String brand, String model, double price, double discount)
    {
        this.brand = brand;
        this.model = model;
        //so when we pass both price / discount to Computers instance, it checks the if condition in the set methods
        setPrice(price);
        setDiscount(discount);
    }
    //helps to access the private attributes and overwrite them, only can be accessed with setter methods
    public void setPrice(double price)
    {
        if (price <1000)
        {
            throw new IllegalArgumentException("the value must be greater than 1000$");
        }
        this.price = price;
    }
    public void setDiscount(double discount)
    {
        if(discount < 0.1)
        {
            throw new IllegalArgumentException("invalid discount");
        }
        this.discount = discount;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public void setModel(String model)
    {
        this.model = model;
    }

    String getBrand()
    {
        return this.brand;
    }
    String getModel()
    {
        return this.model;
    }
    double getPrice()
    {
        return this.price;
    }
    double getDiscount()
    {
        return this.discount;
    }

    String getSalePrice()
    {
        return " ** Details ** "+ "\n" +
                "1-" + brand + "\n"+
                "2-" + model + "\n"+
                "3-" + price + "\n"+
                "4-" + discount + "\n" +
                "Sale Price = " + price *(1-discount);
    }

    String getAmountOff()
    {
        return "Amount off = " + price * discount;
    }

    public static void main(String[] args)
    {
        Computers comp1 = new Computers("HP", "8500", 33000 , 0.3);
        System.out.println(comp1.getBrand());

        comp1.setBrand("DELL");
        System.out.println(comp1.getBrand());

        Computers comp2 = new Computers("Lenovo", "8500", 43123 , 0.3);
        System.out.println(comp2.getBrand());
        System.out.println(comp2.getSalePrice());

    }
}

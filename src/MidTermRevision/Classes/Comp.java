package MidTermRevision.Classes;

public class Comp
{
    String brand;
    String model;
    double price;
    static double discount = 0.20;
    Comp(String brand, String model, double price)
    {
        this.brand = brand;
        this.model = model;
        this.price = price;
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
    void setBrand(String brand)
    {
        this.brand = brand;
    }
    void setModel(String model)
    {
        this.model = model;
    }

    void setPrice(double price)
    {
        this.price = price;
    }
    public double getSalePrice()
    {
        return price * (1-discount);
    }
    public double getAmountOff()
    {
        return price * discount;
    }
    public static void main(String[] args)
    {
        //arrays of objects
        Comp[] comps = new Comp[3];
        comps[0] = new Comp("HP", "xyz", 5000);
        comps[1] = new Comp("Dell", "xyzs", 4000);
        comps[2] = new Comp("Apple", "xyzss", 10000);
        for(int i = 0; i <comps.length; i++)
        {
            System.out.println("Amount of, for the computer with brand "+comps[i].brand + " = " + comps[i].getAmountOff());
        }

    }
}

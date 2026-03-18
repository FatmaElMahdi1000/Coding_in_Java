package AAST_Assignments;

class Laptop
{
    public static void main(String[] args)
    {
        Computers lap1 = new Computers("Toshiba", "Satellite", 2299.50, 0.15);
        Computers lap2 = new Computers("Apple", "MacBook", 2759.50, 0.43);

        System.out.println(lap1.getBrand());
        System.out.println(lap2.getSalePrice());
    }
}
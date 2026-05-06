package OOPRelationships;
import java.util.*;
import javax.swing.*;

//Association
public class Customer
{
    private String CustName;
    private double PurchaseAmount;

    //Non Parametrized Constructor for(building an array of objects)
    Customer()
    {

    }

    public Customer(double PurchaseAmount, String CustName)
    {
        this.CustName = CustName;
        this.PurchaseAmount = PurchaseAmount;
    }
    //Can buy the book or not??
    //this is where the association appear, an object of another class passed to a method of a different class.
    String purchasingStatus(Book book)
    {
        if(PurchaseAmount >= book.getPrice())
        {
            return "The Customer Named: " + this.CustName + " is able to buy this book"+"\n"
                    + book.getBookInfo();
        }
        else
        {
            return "Unfortunately, You don't have enough money to buy this book"
                    +"\n" + "You need extra $" + (book.getPrice()-PurchaseAmount);

        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //Adding Customer Manually
        Customer customer1 = new Customer(13.0, "Fatma");
        Book book1 = new Book("Rules of Life", 20.00);
        System.out.println(book1.getBookInfo());
        System.out.println(customer1.purchasingStatus(book1));

        //prompt the user to provide several customers' data
        Customer[] custList = new Customer[2];
        Book[] bookList = new Book[2];

        for(int i =0; i <custList.length;i++)
        {
            custList[i] = new Customer();
            System.out.print("Enter the Name of the Customer#"+(i+1) +":");
            String name = sc.nextLine();
            custList[i].CustName = name;
            System.out.print("Enter the Purchase Amount of the Customer#"+(i+1) +":");
            Double amount = sc.nextDouble();
            custList[i].PurchaseAmount = amount;
            sc.nextLine(); // Clear the buffer so the next name isn't skipped!
            System.out.println("Customer: "+custList[i].CustName + " has only $"+custList[i].PurchaseAmount);
        }
        for(int j = 0; j <bookList.length; j++)
        {
            bookList[j] = new Book();
            System.out.println("Enter the Book Price: ");
            Double BkPrice = sc.nextDouble();
            sc.nextLine();
            //REVIEW
            bookList[j].setPrice(BkPrice);
            System.out.println("Enter the Book Title: ");
            bookList[j].setTitle(sc.nextLine());
            JOptionPane.showMessageDialog(null, "***Book Info:***\n"+bookList[j].getBookInfo());
        }

    }

}
class Book
{
    private String title;

    private Double price;

    Book()
    {

    }
    public Book(String title, Double price)
    {
        this.title= title;
        this.price = price;
    }

    String getBookInfo()
    {
        return "The Book entitled: " + this.title + " costs: "+this.price + "$";
    }
    //to access both Price and Title in a different class, we need to use setters(Mutators) and Getters(Accessors)

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}


package MidTermRevision.Classes;
import java.util.*;
import java.util.Collections;
import javax.swing.JOptionPane;
public class Book
{
    //attributes:
    String title;
    String Author;
    int NumOfCopies;
    int PublishYear;
    private double price;
    //Static variable to track distinct books(Counter)
    static private int DistinctBooks = 0;

    //Constructor
    Book(String title, String Author, int NumOfCopies, int PublishYear, double price)
    {
        this.title = title;
        this.price = price;
        this.PublishYear = PublishYear;
        this.Author = Author;
        this.NumOfCopies = NumOfCopies;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String author) {
        Author = author;
    }
    public int getPublishYear() {
        return PublishYear;
    }

    public void setPublishYear(int publishYear) {
        PublishYear = publishYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }
    public int getNumOfCopies() {
        return NumOfCopies;
    }

    public void setNumOfCopies(int numOfCopies) {
        NumOfCopies = numOfCopies;
    }

    public void BorrowBook(int Borrowed)
    {     //6 - 3;
        if(NumOfCopies > Borrowed)
        {
            NumOfCopies -= Borrowed;
        }
        else
        {
            NumOfCopies = 0;
            JOptionPane.showMessageDialog(null, "No Sufficient copies to borrow of this book titled: "+ title);
        }

    }
    //Adds copies to the stock
    public double ReturnBook(int ReturnedBook)
    {
        NumOfCopies+=ReturnedBook;
        return NumOfCopies;
    }
    public int DistinctBooks()
    {
        return DistinctBooks;
    }

    //info of the book
    String Bookinfo() {
        return "Title: " + title + "\n" +
                "Author: " + Author + "\n" +
                "Price: " + price + "\n"+
                "Copies: " + NumOfCopies + "\n"+
                "Publish Year: " + PublishYear;
    }
    public static void main(String[] args) {

        //Arrays of objects
        Book[] books = new Book[3];

        books[0]  = new Book("Java", "Schildt", 10, 2022, 135.50);
        books[1] = new Book("C#", "Deitel", 3, 2021, 136);
        books[2] = new Book("Python", "john", 5, 2019, 130);
        System.out.println("Total Number of copies so far(All Books) = " + (books[0].NumOfCopies + books[1].NumOfCopies + books[2].NumOfCopies));
        JOptionPane.showMessageDialog(null, books[0].title + ": " + books[0].NumOfCopies + " Copies" + "\n" + books[1].title + ": " + books[1].NumOfCopies + " Copies" + "\n" +
                books[2].title + ": " + books[2].NumOfCopies + " Copies" + "\n", "Number Of Copies Before Lending Books", JOptionPane.INFORMATION_MESSAGE);

        //After lending books
        books[0].BorrowBook(10);
        books[1].BorrowBook(2); //Error
        books[2].BorrowBook(2);

        if (!(books[0].getNumOfCopies() + books[1].getNumOfCopies() + books[2].getNumOfCopies() == 0)) {
            JOptionPane.showMessageDialog(null, books[0].title + ": " + books[0].getNumOfCopies() + " Copies" + "\n" + books[1].title + ": " + books[1].getNumOfCopies() + " Copies" + "\n" +
                    books[2].title + ": " + books[2].getNumOfCopies() + " Copies " + "\n");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "There are 0 Copies available now!");
        }
        //Which book is the most recent
        //array of objects

        int MostRecent = 0;
        //tracking the book with the most recent year using its index
        int bookIdx = 0;
        for(int i = 0; i < 3; i++)
        {
            if(MostRecent <= books[i].PublishYear)
            {
                MostRecent = books[i].PublishYear;
                bookIdx = i;
            }
        }
        System.out.println("Most Recent Year = " + MostRecent);
        JOptionPane.showMessageDialog(null, "Book info that's published in "+MostRecent+ ":" + "\n" +
                "Book title: " + books[bookIdx].title + "\n"+
                "Book Author: " + books[bookIdx].Author + "\n"+
                "Book Copies in stock: " + books[bookIdx].getNumOfCopies() + "\n"+
                "Book Price: " + books[bookIdx].price + "\n"+
                "Published In: " + books[bookIdx].getPublishYear() + "\n");


    }
}


/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Library
{
    // instance variables - replace the example below with your own
    private String name;
    private int openTime;
    private ArrayList<Book> bookList = new ArrayList<Book>();
    
    public Library(String libraryName, int libraryOpenTime)
    {
        name = libraryName;
        openTime = libraryOpenTime;
    }

    public void addBook(String bookName, String bookAuthor)
    {
        Book book = new Book(bookName, bookAuthor);        
        bookList.add(book);
    }

    public void printBooks()
    {
        System.out.println("We currently have " + Integer.toString(bookList.size()) + " books.");
        for(int i=0; i<bookList.size(); i++ )
        {
            System.out.println(bookList.get(i).getBookName() + " by " + bookList.get(i).getBookAuthor());
        }
    }
    
    public void openTime()
    {
        System.out.println(openTime);
    }
}

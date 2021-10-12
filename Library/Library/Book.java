
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables - replace the example below with your own
    private String name, author;
    public Book(String bookName, String bookAuthor)
    {
        // initialise instance variables
        name = bookName;
        author = bookAuthor;
    }

    public String getBookName()
    {
        //System.out.println(name);
        return name;
    }
    
    public String getBookAuthor()
    {
        //System.out.println(author);
        return author;
    }
}

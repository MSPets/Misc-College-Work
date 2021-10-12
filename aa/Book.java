/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int amountOfPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = amountOfPages;
    }
    public void printAuthor()
    {
        System.out.println("The author is: " + author);
    
    }
    public void printTitle()
    {
        System.out.println("The title is: " + title);
    }
    public void getPages()
    {
        System.out.println("It consists of " + pages + " pages");
    }
    public void printDetails()
    {
        System.out.println("Title: " + title + " Author : " + author + " Pages: " + pages);
    }
}

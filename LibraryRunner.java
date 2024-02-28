/*
 * Activity 3.7.5
 */
import java.util.ArrayList;

public class LibraryRunner
{
  public static void main(String[] arg)
  {
    ArrayList<Book> childrenBooks = new ArrayList<Book>();
    Library library = new Library();

    childrenBooks = library.getChildrensBooks();

    String authorToFind = "L. Frank Baum";
    String bookToFind = "Sky Island";
    double minRating = 4.14;
    for (Book b : childrenBooks)
    {
        /*
        if (b.getAuthor().equals(authorToFind))
        {
            System.out.println(b);
        }
        */

        /*
        if (b.getTitle().equals(bookToFind) && b.getRating() > minRating)
        {
            minRating = b.getRating();
        }
        */

        if (b.getRating() > minRating)
        {
            System.out.println(b);
        }
    }

  }
}
package Chapter9.Library;

/**
 * Created by Jami on 10/17/2015.
 */
public class Book extends Item {
    protected String ISBN;

    public Book(String title, String[] authors, String description, Shelf shelfLocation, String callNum, String ISBN) {
        super(title, authors, description, shelfLocation, callNum, Format.Book);
        this.ISBN = ISBN;
    }
}

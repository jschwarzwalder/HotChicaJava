package Chapter9.Library;

/**
 * Created by Jami on 10/17/2015.
 */
public class FictionBook extends Book {

    public FictionBook(String title, String[] authors, String description, String ISBN, Shelf shelf) {
        super(title, authors, description, shelf, authors[0].substring(0, 5), ISBN);


    }


}

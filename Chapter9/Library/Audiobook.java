package Chapter9.Library;

/**
 * Created by Jami on 10/17/2015.
 */
public class Audiobook extends Item{

    public Audiobook(String title, String[] authors, String description, Shelf shelf) {
        super(title, authors, description, shelf, authors[0].substring(0, 5), Format.Audiobook);

    }
}

package Chapter9.Library;

/**
 * Created by Jami on 10/17/2015.
 */
public class DVD extends Item {

    public DVD(String title, String[] authors, String description, String callNum) {
        super(title, authors, description, Shelf.DVD, callNum, Format.DVD);
    }
}

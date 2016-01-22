package Chapter9.Library;

/**
 * Created by Jami on 10/17/2015.
 */
public class NFBook extends Book {

    public NFBook(String title, String[] authors, String description, Shelf shelf, String callNum, String ISBN) {
        super(title, authors, description, shelf, callNum, ISBN);
    }

    public String getCallNum() {

        String auth = this.getAuthor();
        String end = auth.substring(0, 5);
        return Shelf.DVD + " " + getCallNumCat() + " " + end;
    }
}



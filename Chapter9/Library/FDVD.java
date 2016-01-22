package Chapter9.Library;

/**
 * Created by Jami on 10/17/2015.
 */
public class FDVD extends DVD {

        public FDVD(String title, String[] authors, String description, DVDCat callNum) {
            super(title, authors, description, callNum.toString());
            setCheckoutTime(7);
    }

    public enum DVDCat{
        Action,
        Anime,
        Comedy,
        Drama,
        Family,
        Horror,
        SpecialInterest,
        Television,
        SciFi

    }

    public String getCallNum() {

        String title = this.getTitle();
        String end = title.substring(0, 1);
        return Shelf.DVD + " " + getCallNumCat() + " " + end;
    }

}

package Chapter9.Library;

import java.util.Date;

/**
 * Created by Jami on 10/17/2015.
 */
public class Item {
    private String title;
    private String[] authors;
    private String description;
    private Shelf shelfLocation;
    private String callNum;
    private Format format;
    private Date purchased;
    private Circ circStatus;
    private Date lastUsed;
    private int numOfCircs;
    private Date DueDate;
    private int checkoutTime = 21;



    public Item(String title, String[] authors, String description, Shelf shelfLocation, String callNum, Format format) {
        this.title = title;
        this.authors = authors;
        this.description = description;
        this.shelfLocation = shelfLocation;
        this.callNum = callNum;
        this.format = format;
        purchased = new Date();
        circStatus = Circ.InProcess;

    }


    public enum Shelf {
        F,
        YA,
        J,
        E,
        EREADER,
        DVD,
        NF,
        NFYA,
        NFJ,
        ENF,
        CD,
        GAME,
        HELP,
        SPANISH,
        JAPANESE,
        CHINESE,
        RUSSIAN,
        LUCKYDAY,
        TKCD,
        YATKCD,
        JTKCD,
        READALONG

    }

    public enum Circ {
        In,
        Out,
        BeingShelved,
        Bindry,
        Weeds,
        Withdrwan,
        InProcess,
        Transfered,
        InTransit
    }

    public enum Format {
        Book,
        CD,
        DVD,
        Audiobook,
        VideoGame,
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return authors[0];
    }

    public String[] getAuthors() {
        return authors;
    }

    public String getDescription() {
        return description;
    }

    public Date getPurchased() {
        return purchased;
    }

    public Date getLastUsed() {

        return lastUsed;
    }

    public Circ getCircStatus() {
        return circStatus;
    }

    public Format getFormat() {
        return format;
    }

    public int getCheckoutTime(){
        return checkoutTime;
    }

    public long getCheckoutLong(int days){
        long second = days*1000;
        long min = (int)second*60;
        long hours = min*60;
        long milli = hours*24;
        return milli;

    }

    public void setCheckoutTime(int days){
        this.checkoutTime = days;

    }

    public int getNumOfCircs() {
        return numOfCircs;
    }

    public String getCallNum() {

        return shelfLocation + " " + callNum;
    }

    protected String getCallNumCat() {
        return this.callNum;
    }

    public void setCircStatus(Circ circStatus) {
        this.circStatus = circStatus;
        if (circStatus == Circ.Out) {
            numOfCircs++;
            lastUsed = new Date();
            setDueDate();
        }
    }

    protected Date setDueDate(){
        Date today = new Date();
        DueDate.setTime(today.getTime() + getCheckoutLong(checkoutTime));
        return DueDate;
    }
}



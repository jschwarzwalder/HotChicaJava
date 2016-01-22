package Week7_Games.Pez;

/**
 * Created by Jami on 10/4/2015.
 */
public class PezDispenser {
    public static final int MAX_PEZ = 12;
    private String mCharacterName;
    private int mPezCount;


    public PezDispenser (String name){
        mCharacterName = name;
        mPezCount = 0;
    }

    public String getCharacterName(){
        return mCharacterName;
    }
    public int getPezCount() {
        return mPezCount;
    }

    public boolean isEmpty(){
        return mPezCount == 0;
    }

    public void setCharacterName(String name){
        mCharacterName = name;
    }

    public void load(){
        load(MAX_PEZ);
    }

    public void load(int pezAmmount){
        int newAmount = mPezCount + pezAmmount;
        if (newAmount > MAX_PEZ){
            throw new IllegalArgumentException("Too many Pez!!!!");
        }
        mPezCount += pezAmmount;
    }

    public boolean dispensePez() {
        boolean wasDispensed = false;
        if (!isEmpty()) {
            mPezCount--;
            System.out.printf("Here have a Pez. You have %s left\n", mPezCount);
            wasDispensed = true;
        }
        return wasDispensed;
    }

}

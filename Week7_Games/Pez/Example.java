package Week7_Games.Pez;

/**
 * Created by Jami on 10/4/2015.
 */
public class Example {
    public static void main(String[] args){
        System.out.println("We are making a new Pez Dispenser.");
        PezDispenser dispenser1 = new PezDispenser("Yoda");
        System.out.printf("The dispenser character is %s\n", dispenser1.getCharacterName());
        PezDispenser dispenser2 = new PezDispenser("Donatello");
        System.out.printf("The dispenser character is %s\n", dispenser2.getCharacterName());
        PezDispenser dispenser3 = new PezDispenser("Darkwing Duck");
        System.out.printf("The dispenser character is %s\n", dispenser3.getCharacterName());
        dispenser3.setCharacterName("Kitty Pyrde");
        System.out.printf("The dispenser character is now %s\n", dispenser3.getCharacterName());
        //testing loading without int
        if (dispenser3.isEmpty()){
            System.out.println("It is currently empty");
        }
        System.out.println("Loading.....");
        dispenser3.load();
        if(!dispenser3.isEmpty()){
            System.out.println("It is no longer empty");
        }
        while(dispenser3.dispensePez()){
            System.out.println("Chomp!");
        }
        if (dispenser3.isEmpty()){
            System.out.println("Ate all the Pez!");
        }
        //testing loading method with int
        dispenser2.load(4);
        dispenser2.load(2);
        while(dispenser2.dispensePez()){
            System.out.println("Chomp!");
        }
        //testing load method with more than Max.
        try {
            dispenser1.load(400);
            System.out.println("This will never happen");
        } catch (IllegalArgumentException iae){
            System.out.println("Whoa there!");
            System.out.printf("The error was: %s\n", iae);

        }
    }
}

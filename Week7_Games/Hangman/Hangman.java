package Week7_Games.Hangman;

import java.io.Console;
import java.util.*;

/**
 * Created by Jami on 10/4/2015.
 */
public class Hangman {
    public static void main(String[] args) {
        String word = " ";
        if (args.length == 0) {
            Scanner console = new Scanner(System.in);
            System.out.println("Please enter a word");
            word = console.nextLine();
            while (word.length() <= 1 || word.isEmpty()) {
                System.out.println("Please enter a longer word");
                word = console.nextLine();
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();


            clearConsole();

        }
        Game game = new Game(word);
        //System.out.println(game.applyGuess('t'));
        //System.out.println(game.applyGuess('z'));
        Prompter prompter = new Prompter(game);
        //System.out.println(game.getAnswer());
        prompter.play();

        //Testing to ensure that methods worked.
//        prompter.displayProgress();
//        boolean isHit = prompter.promptForGuess();
//        if (isHit){
//            System.out.println("We got a hit!");
//        }else {
//            System.out.println("Whoops that was a miss.");
//        }
//        prompter.displayProgress();
//        char[] guesses = {'t','z', };
//        for (int i = 0; i < guesses.length; i++){
//            System.out.println("guess is " + guesses[i]);
//            if (game.applyGuess(guesses[i])) {
//                System.out.println("It worked");
//            } else{
//                System.out.println("It didn't work");
//            }
        }



    private static String inputTest(char letter, Game game){
        game.applyGuess(letter);
        return "I ton'd get this";

    }
    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }


}

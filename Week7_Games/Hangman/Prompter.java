package Week7_Games.Hangman;

import java.io.Console;
import java.util.Scanner;

/**
 * Created by Jami on 10/4/2015.
 */
public class Prompter {
    private Game mGame;

    public Prompter(Game game){

        mGame = game;
    }

    public void play(){
        while (mGame.getRemainingTries() > 0 && !mGame.isSolved()){
            displayProgress();
            promptForGuess();
        }
        if (mGame.isSolved()) {
            System.out.printf("Congratulations you won with %d tries remaining",
                    mGame.getRemainingTries());
        } else if (mGame.getRemainingTries() == 0){
            System.out.println("Sorry you ran out of guesses");
            System.out.println("The word was " + mGame.getAnswer());

        }
    }

    public boolean promptForGuess(){
        Scanner console = new Scanner(System.in);
        boolean isHit = false;
        boolean isValidGuess = false;
        while (! isValidGuess){
            System.out.print("\nEnter a letter:  ");
            String guessAsString;
            guessAsString = console.nextLine();
            try {
                isHit = mGame.applyGuess(guessAsString);
                isValidGuess = true;
            } catch (IllegalArgumentException iae){
                System.out.printf("%s. Please try again \n", iae.getMessage());
            }
        }
        return isHit;
    }

    public void displayProgress(){
        System.out.printf("You have %d tries left to solve: %s\n",
                mGame.getRemainingTries(),
                mGame.getCurrentProgress());
    }

}

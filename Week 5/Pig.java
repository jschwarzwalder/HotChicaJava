import java.util.Random;
import java.util.Scanner;

/**
 * Created by Jami on 9/10/2015.
 */
public class Pig {
    static Random r = new Random();
    static Scanner console = new Scanner(System.in);
    static String player = "Player1";
    public static void main(String[] args) {
        int player1_score = 0;
        boolean player1 = true;
        int player2_score = 0;
        System.out.println(player + " goes first");
        while (player1_score <= 100 && player2_score <= 100) {
            if (player1){
               player1_score += pigTurn();
                player1 = false;
                player = "Player2";
            } else {
                player2_score += pigTurn();
                player = "Player1";
                player1 = true;

            }
            System.out.println("Scores: Player 1 - "+ player1_score + " Player 2 - " + player2_score);
            System.out.println();

        }
        if (player1_score > player2_score) {
            System.out.println("Player 1 Wins with a score of " + player1_score);
        } else if(player1_score < player2_score) {
            System.out.println("Player 2 Wins with a score of " + player2_score);
        } else {
            System.out.println("You both win! or you can go play again.");
        }

    }

    public static int pigTurn(){
        int roll = roll();
        int turn_score = 0;
        boolean goOn = true;
       //if roll is 1 player loosed turn
        while (roll != 1 && goOn) {
            // roll is added to round score
            turn_score += roll;
            //Ask player if they want to stop
            System.out.println(player + " rolled " + roll + ", and your current score is " + turn_score + ". ");
            System.out.println("True or False. Do you want to continue?");
            while (!console.hasNextBoolean()) {
                console.next();
                System.out.println(" Type True or False. I want to roll again.");
            }
            boolean response = console.nextBoolean();
            if (!response) {
                goOn = response ;
                break;
            } else {
                roll = roll();
            }

        }

        if (roll == 1) {
            System.out.println(player + "'s turn is over. You rolled a 1");
            turn_score = 0;

        } else {
            System.out.println(player + "'s turn is over. Your score is " + turn_score);
        }
        return turn_score;
    }

    //Roll 6 sided dice
    public static int roll (){

        return r.nextInt(6) + 1;

    }

}

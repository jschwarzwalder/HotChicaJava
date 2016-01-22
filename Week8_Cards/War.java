package Week8_Cards;

import pschwarz.cards.*;

/**
 * Created by Jami on 10/10/2015.
 */
public class War {
    public static void main(String[] args){
        Deck deck = new Deck();
        Hand player1 = new Hand();
        Hand player2 = new Hand();
        Hand play = new Hand();
        Hand tie = new Hand();
        // Split deck in half for both players.
        deck.shuffle();
        while (!deck.isEmpty()){
            deck.dealCard(player1);
            deck.dealCard(player2);
        }
        while (player1.getCards().length > 0 && player2.getCards().length > 0) {
            play = playCards(player1, player2);
            Card[] played = play.getCards();

            if (played[0].getRank() > played[1].getRank()) {
                System.out.println("Player 1 won this round with " + played[0].getRank() + " vs " + played[1].getRank());
                player1.add(played[1]);
                player2.remove(played[1]);
                player1.remove(played[0]);
                player1.add(played[0]);

            } else if (played[0].getRank() < played[1].getRank()) {
                System.out.println("Player 2 won this round with " + played[0].getRank() + " vs " + played[1].getRank());
                player2.add(played[0]);
                player1.remove(played[0]);
                player2.remove(played[1]);
                player2.add(played[1]);
            } else {
                System.out.println("There was a tie. Discard 3 cards");
                tie.add(played[0]);
                player1.remove(played[0]);
                tie.add(played[1]);
                player2.remove(played[1]);
                for (int i = 0; i > 3; i++){
                    Hand temp = playCards(player1, player2);
                    Card[] discard = temp.getCards();
                    tie.add(discard[0]);
                    player1.remove(discard[0]);
                    tie.add(discard[1]);
                    player2.remove(discard[1]);
                }





            }
        }
        if (player1.getCards().length == 0){
            System.out.println("Player 2 Won! ");
        } else if (player2.getCards().length == 0){
            System.out.println("Player 1 Won! ");
        }


    }

    public static Hand playCards (Hand hand1, Hand hand2){
        Hand play = new Hand();
        Card[] player1 = hand1.getCards();
        Card[] player2 = hand2.getCards();
        if (player1.length >0 && player2.length > 0) {
            play.add(player1[0]);
            play.add(player2[0]);

        }
        return play;


    }

}


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        List<Card> playerHand = new ArrayList<>(0);
        List<Card> dealerHand = new ArrayList<>(0);
        BlackJack game = new BlackJack(deck, playerHand, dealerHand);

        System.out.println("Welcome to BlackJack!");
        deck.shuffle();
        game.deal();

        while (true) {
            System.out.println("Player hand: " + game.getPlayerScore());
            System.out.println("PlayerCard:");
            // String formmattedCard = "";
            for (int i = 0; i < playerHand.size(); i++) {
                // formmattedCard += playerHand.get(i).toString();
                System.out.println(playerHand.get(i).toString());
            }
            // System.out.println(formmattedCard);
            System.out.println("Would you like to Hit or Stay?");
            System.out.println("1 : Hit");
            System.out.println("2 : Stay");
            System.out.print("Choice: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if (choice == 1) {
                game.hitPlayer();
                game.hitDealer();
            } else if (choice == 2) {
                System.out.println("Player hand: " + game.getPlayerScore());
                System.out.println("Dealer hand: " + game.getDealerScore());
                game.determineWinner();
                break;
            }
        }

    }

}
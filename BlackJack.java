import java.util.*;

public class BlackJack {
    private final Deck deck;
    private List<Card> playerHand;
    private List<Card> dealerHand;

    public BlackJack(Deck deck, List<Card> playerHand, List<Card> dealerHand) {
        this.deck = deck;
        this.playerHand = playerHand;
        this.dealerHand = dealerHand;
    }

    public void deal() {
        playerHand.add(deck.draw());
        dealerHand.add(deck.draw());
        playerHand.add(deck.draw());
        dealerHand.add(deck.draw());
    }

    public List<Card> getPlayerHand() {
        return playerHand;
    }

    public List<Card> getDealerHand() {
        return dealerHand;
    }

    public void printPlayerHand() {
        System.out.println("Playerhand: " + playerHand);
    }

    public void printDealerHand() {
        System.out.println("Dealerhand: " + dealerHand);
    }

    public void hitPlayer() {
        playerHand.add(deck.draw());
        System.out.println("Player hits!");
    }

    public void hitDealer() {
        Random r = new Random();
        boolean choice = r.nextBoolean();
        if (choice) {
            dealerHand.add(deck.draw());
            System.out.println("Dealer hits!");
        } else {
            System.out.println("Dealer stay!");
        }
    }

    public int getPlayerScore() {
        int sum = 0;

        for (Card card : playerHand) {
            // Assuming Card class has a method called `getRank()` that returns the Rank of
            // the card
            Rank rank = card.getRank();

            // Assuming Rank enum has a method called `getValue()` that returns the
            // numerical value of the rank
            sum += rank.getValue();

        }

        return sum;
    }

    public int getDealerScore() {
        int sum = 0;

        for (Card card : dealerHand) {

            Rank rank = card.getRank();

            sum += rank.getValue();

        }

        return sum;
    }

    public void determineWinner() {
        if (getPlayerScore() > 21 && getDealerScore() > 21) {
            System.out.println("Player Bust!");
            System.out.println("Dealer Bust!");
        } else if (getPlayerScore() > 21 && getDealerScore() <= 21) {
            System.out.println("Player Bust!");
            System.out.println("Dealer Win!");
        } else if (getDealerScore() > 21 && getPlayerScore() <= 21) {
            System.out.println("Player Win!");
            System.out.println("Dealer Bust!");
        } else if (getPlayerScore() >= getDealerScore()) {
            System.out.println("Player Win!");
            System.out.println("Dealer Lose!");
        } else if (getPlayerScore() <= getDealerScore()) {
            System.out.println("Dealer Win!");
            System.out.println("Player Lose!");
        }

    }

    // getter setter

}
